package org.example;

import java.util.Scanner;

class Bankacc
{
    Scanner input =new Scanner(System.in);

    String name;
    Long acc_no;
    double balance=0;

    boolean t=true;
    boolean f=true;
    String temp;
    int r;

    bankacc()
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
            acc_no = input.nextLong();
            temp = String.valueOf(acc_no);

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
        System.out.println("Account Number:"+acc_no);
        System.out.println("Balance Amount:"+balance);
        System.out.println("\n\n");
    }


}
