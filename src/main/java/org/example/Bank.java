package org.example;

import  java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bank{


    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {

        bankacc obj=new bankacc();

        Scanner input =new Scanner(System.in);

        int opt;
        do {
         LOGGER.log(Level.info,"1.deposit\n2.withdrawl\n3.check balance\n4.exit ");
          LOGGER.log(Level.info,"Enter choice:");
            opt = input.nextInt();
            if( opt!=4) {
                switch (opt) {
                    case 1 -> obj.deposit();
                    case 2 -> obj.withdrawl();
                    case 3 -> obj.cbalance();
                    default -> LOGGER.log( Level.INFO,"Invalid option");
                }
            }

        }while(opt!=4);
        LOGGER.log("Thanking you ,Have a nice Day  ");
    }
}

