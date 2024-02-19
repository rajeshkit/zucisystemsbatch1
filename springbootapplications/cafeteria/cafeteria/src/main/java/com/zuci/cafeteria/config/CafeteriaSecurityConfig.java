package com.zuci.cafeteria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class CafeteriaSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(e->e.disable());
        http.authorizeHttpRequests(auth->
                auth.requestMatchers("/").permitAll()
                        .requestMatchers(HttpMethod.GET,"/cafeteria/**").hasRole("user")
                        .requestMatchers("/","/cafeteria/**").hasAnyRole("admin")
                .anyRequest().authenticated());
                http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails userDetails= User.builder()
                .username("rajesh")
                .password(passwordEncoder().encode("rajesh"))
                .roles("admin")
                .build();
        UserDetails userDetails1= User.builder()
                .username("janavi")
                .password(passwordEncoder().encode("janavi"))
                .roles("user")
                .build();
        return new InMemoryUserDetailsManager(userDetails,userDetails1);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
