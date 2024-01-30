package com.icicibank.account;

public class UpdateProfile{
    public void show(){
        Account account=new Account();
        System.out.println(account.accountNumber);
        System.out.println(account.accountName);
        account.display();
    }
}
