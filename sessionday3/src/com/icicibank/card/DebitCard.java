package com.icicibank.card;

import com.icicibank.account.Account;

public class DebitCard extends Account{
    public void accountInfo(){
        System.out.println(accountNumber);
        System.out.println(accountName);
        display();
    }
}
