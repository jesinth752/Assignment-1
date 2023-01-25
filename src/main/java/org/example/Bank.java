package org.example;

import  java.util.Scanner;

class BankAcc
{
    Scanner input =new Scanner(System.in);

    String name;
    Long accno;
    double balance=0;

    boolean t=true;
    boolean f=true;
    String temp;
    int r;

    BankAcc()
    {


        while (t) {
            r=0;
            System.out.print("Enter Account Name:");
            name = input.nextLine();
            for(int i=0;i<name.length();i++)
            {
                if(name.charAt(i)>='a' && name.charAt(i)<='z'
                        || name.charAt(i)>='A' && name.charAt(i)<='Z' || name.charAt(i)==32)
                {
                    r++;
                }


            }
            if(r==name.length())
            {
                t=false;
            }
            else {
                System.out.println("Invalid format it contains only alphabets \n example:JESINTH KUMAR\n");
            }
        }


        while (f) {
            System.out.print("Enter Account Number:");
            accno = input.nextLong();
            temp = String.valueOf(accno);

            if(temp.length()>=12)
            {
                f=false;
            }
            else
            {
                System.out.println("your Account Number must contains Minimum 12 digit\n example:123456789xxx\n");
            }
        }



    }

    void deposit()
    {
        System.out.println("Enter amount to deposit:");
        double amt = input.nextDouble();
        System.out.println("Deposit of Amount Rs "+amt+" is successful\n\n");
        balance=balance+amt;
    }
    void withdrawl()
    {
        System.out.println("Enter amount to withDrawl:");
        double amt = input.nextDouble();

        if(amt<balance)
        {
            balance=balance-amt;
            System.out.println("WithDrawl of Amount RS "+amt+" is successful\n\n");


        }
        else
        {
            System.out.println("Insufficient Funds Try again\n\n");
        }

    }
    void cbalance()
    {
        System.out.println("Account Name:"+name);
        System.out.println("Account Number:"+accno);
        System.out.println("Balance Amount:"+balance);
        System.out.println("\n\n");
    }


}
public class Bank{
    public static void main(String[] args) {
        bankacc obj=new bankacc();
        Scanner input =new Scanner(System.in);
        int opt;
        do {
            System.out.println("1.deposit\n2.ithdrawl\n3.check balance\n4.exit ");
            System.out.println("Enter choice:");
            opt = input.nextInt();
            if( opt!=4) {
                switch (opt) {
                    case 1 -> obj.deposit();
                    case 2 -> obj.withdrawl();
                    case 3 -> obj.cbalance();
                    default -> System.out.println("Invaild option Try Again\n");
                }
            }

        }while(opt!=4);
        System.out.println("Thanking you ,Have a nice Day  ");
    }
}

