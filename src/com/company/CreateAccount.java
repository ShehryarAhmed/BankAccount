package com.company;

/**
 * Created by android on 7/21/2016.
 */
public  class CreateAccount {
    String name;
    int age;
    String AccountType;
    int DepositAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getDepositAmount() {
        return DepositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        DepositAmount = depositAmount;
    }
    int AccountNumber;

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber() {
        AccountNumber = (int)(1005*Math.random());;
    }


}
