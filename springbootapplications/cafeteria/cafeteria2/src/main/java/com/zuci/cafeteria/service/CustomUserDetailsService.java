package com.zuci.cafeteria.service;

import com.zuci.cafeteria.model.Users;
import com.zuci.cafeteria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Users users=userRepository.findByUsername(username);
        System.out.println(users);
            if (users==null){
                throw new UsernameNotFoundException("username not exist");
            }
           List<GrantedAuthority> list=users.getRoles().stream().map(e->new SimpleGrantedAuthority(e.getRoleName())).collect(Collectors.toList());
        return new User(users.getUsername(),users.getPassword(),list);
    }
}
