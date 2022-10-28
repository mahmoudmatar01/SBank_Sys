package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter ur Account Id :");
        int id= input.nextInt();
        System.out.println("Enter ur Balance : ");
        double bal=input.nextDouble();

        Acc_Info Acc=new Acc_Info(bal,id);
        while (true){
        System.out.println("choose what do u need ?\n1- withdraw \n2-deposit");
        int choose =input.nextInt();
        if (choose==1){
            System.out.println("Enter An Amount :- ");
            double amount= input.nextDouble();
            System.out.println(amount+" LE Was withdraw from ur balance");
            System.out.println("ur new balance = "+Acc.withdraw(amount));
            double new_bla=Acc.withdraw(amount);
            Acc_Info.balance=new_bla;

        }
        else if (choose==2){
            System.out.println("Enter An Amount :- ");
            double amount= input.nextDouble();
            System.out.println(amount+" LE Was deposit from ur balance");
            System.out.println("ur new balance = "+Acc.deposit(amount));
            double new_bla=Acc.deposit(amount);
            Acc_Info.balance=new_bla;
        }

        else {
            System.out.println("invaild choise !");
            break;
        }
    }



    }
}

 class Acc_Info{
     private static int id_Account;
      static  double balance;
      double amount;

     Acc_Info(double bal,int id){
         this.balance=bal;
         this.id_Account=id;
     }
     public static double get_balance(){
         return balance;
     }

     public  double withdraw(double amo){
         amount=amo;
         double new_balance=0;
         if (amount>0 && amount<=balance){
             new_balance=balance-amount;
         }
         return new_balance;
     }

     public  double deposit(double amo){
         amount=amo;
         double new_balance =0;
         if (amount>0){
             new_balance=balance+amount;
         }
         return new_balance;
     }

}



