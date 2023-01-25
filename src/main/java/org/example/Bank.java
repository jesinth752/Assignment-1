package org.example;

import  java.util.Scanner;
import java.util.logging.Level; 
import java.util.logging.Logger;

class BankAcc
{
    Scanner input =new Scanner(System.in);

    String name;
    Long accno;
    double balance=0;

  

    BankAcc()
    {

            System.out.print("Enter Account Name:");
            name = input.nextLine();
            System.out.print("Enter Account Number:");
            accno = input.nextLong();
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
    
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
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
                    default -> LOGGER.log(Level.WARNING, "INVALID"); 
                }
            }

        }while(opt!=4);
        System.out.println("Thanking you ,Have a nice Day  ");
    }
}

