package com.company;


import java.util.Scanner;

/**
 * Created by android on 7/21/2016.
 */
public class Menu {
        Scanner getval = new Scanner(System.in);
        CreateAccount createAccount[] = new CreateAccount[5];
        CreateAccount ac;
        int user,index;

        public void menu(){
        initializeaccount();
        while(true){
        System.out.println("Banking System");
        System.out.println("1.Create Account\n2.Account Detail\n3.Exit");
        System.out.println("Select Any One : ");
        int get = getval.nextInt();
        boolean pause=false;
        int press;
        switch (get){
        case 1:
        {
        do{System.out.println("Create Account");
        CreateAccount();
        pause = backmenu();
        }while (pause==false);
        }
        break;
        case 2:{
        System.out.println("Account Detail");
        Accountlogin();
        }
        break;
        case 3:{
        System.out.println("exit");
        return;
        }
        default:{
        System.out.println("Wrong Select");
        }}}}
        private void CreateAccount(){
        ac = new CreateAccount();
        System.out.println("Name : ");
        String name = getval.next();
        ac.setName(name);
        System.out.println("Age : ");
        int age = getval.nextInt();
        ac.setAge(age);
        System.out.println("AccountType : ");
        String accType = getval.next();
        ac.setAccountType(accType);
        System.out.println("Deposit Amount : ");
        int depositamount = getval.nextInt();
        ac.setDepositAmount(depositamount);
        ac.setAccountNumber();
        System.out.println("Account has been Created " +
        "\nNowAccount Number is:"+ac.getAccountNumber());
        SaveNewAccount(ac);
        }
        private void SaveNewAccount(CreateAccount ac){
        createAccount[user++] = ac;
        }
       private void AccountDetail(int index){
       System.out.println("Name : "+createAccount[index].getName()+
       "\nAge : "+createAccount[index].getAge()+
       "\nAccount Number : 111-000-"+createAccount[index].getAccountNumber()+
       "\nAccount Type : "+createAccount[index].getAccountType()+
       "\nCurrent Balance : "+createAccount[index].getDepositAmount());
      }
      private void Accountlogin(){
      System.out.println("Name : ");
      String name =  getval.next();
      System.out.println("Account Number : 111-000-");
      int num = getval.nextInt();
      if(Find(name,num)){
      AccoutnMenu();
      }
      else{
      System.out.println("Not Found");
      }}
      private void AccoutnMenu(){
      while (true){
      System.out.println("1.Account Detail\n2.Deposit\n3.Withdrawl" +
      "\n4.Current Balance\n5.LogOut");
      int select = getval.nextInt();
      switch (select){
      case 1:{
      AccountDetail(index);}
      break;
      case 2:{
      deposit(index);}
      break;
      case 3:{
      withdrawl(index);}
      break;
      case 4:{
      CurrentBalance(index);}
      break;
      case 5:{
      return;}
      default:{
      System.out.println("Wrong Select");}}}}
      private boolean backmenu(){
      System.out.println("Press 0 To Main Menu");
      int press = getval.nextInt();
      if(press==0){
      return true;
      }
      else {
      return false;
      }}
      public boolean Find(String name, int accountnum){
      boolean find = false;
      for(int i = 0; i < user; i++){
      int a = 0;
      if(a  == createAccount[i].getName().compareTo(name) && createAccount[i].AccountNumber ==accountnum){
      find = true;
      index = i;
      break;
      }}
      if(find){
      return true;
      }
      else {
      return false;
      }}
      public void initializeaccount(){
      ac = new CreateAccount();
      ac.setName("Shehryar");
      ac.setAge(22);
      ac.setAccountType("Current");
      ac.setDepositAmount(5000);
      ac.AccountNumber=425;
      SaveNewAccount(ac);
     }
     private void deposit(int index){
     System.out.println("Amount : ");
     int amount = getval.nextInt();
     createAccount[index].DepositAmount+=amount;
     }
     private void withdrawl(int index){
     System.out.println("Amount : ");
     int amount = getval.nextInt();
     if(createAccount[index].getDepositAmount() < amount){
     System.out.println("Not Withdrawl");
     }
     else {
     createAccount[index].setDepositAmount(createAccount[index].getDepositAmount()-amount);
     }}
     private void CurrentBalance(int index){
     System.out.println("Current Balance : "+createAccount[index].getDepositAmount());
     }
     }
