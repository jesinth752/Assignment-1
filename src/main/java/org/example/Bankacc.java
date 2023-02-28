package org.example;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
class Bankacc
{
   
    Scanner input =new Scanner(System.in);

    String name;
    Long accno;
    double balance=0;
    String temp;

    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Bankacc()
    {
        
            LOGGER.log(Level.INFO,"Enter Account Name:");
            name = input.nextLine();
            LOGGER.log(Level.INFO,"Enter Account Number:");
            accno = input.nextLong();
           


    }

    void deposit()
    {
        LOGGER.log(Level.INFO,"Enter amount to deposit:");
        double amt = input.nextDouble();
        String dep="Deposit of Amount Rs "+amt+" is successful\n\n";
        LOGGER.log(Level.INFO,dep);
        balance=balance+amt;
    }
    void withdrawl()
    {
        LOGGER.log(Level.INFO,"Enter amount to withDrawl:");
        double amt = input.nextDouble();
        String with;

        if(amt<balance)
        {
            with="WithDrawl of Amount RS "+amt+" is successful";
            balance=balance-amt;
            LOGGER.log(Level.INFO,with);


        }
        else
        {
            LOGGER.log(Level.INFO,"Insufficient Funds Try again\n\n");
        }

    }
    void cbalance()
    {
        LOGGER.log(Level.INFO,"Account Name:"+name);
        LOGGER.log(Level.INFO,"Account Number:"+accno);
        LOGGER.log(Level.INFO,"Balance Amount:"+balance);
        LOGGER.log(Level.INFO,"\n\n");
    }


}
