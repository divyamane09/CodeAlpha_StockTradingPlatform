package com.codealpha;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        TradingPlatform tp = new TradingPlatform();

        while(true) 
        {
            System.out.println("\n===== STOCK TRADING PLATFORM =====");

            System.out.println("1. View Market Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) 
            {
                case 1:

                    tp.viewStocks();
                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Stock Name: ");
                    String buyName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int buyQty = sc.nextInt();

                    tp.buyStock(buyName, buyQty);

                    break;

                case 3:

                    sc.nextLine();

                    System.out.print("Enter Stock Name: ");
                    String sellName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int sellQty = sc.nextInt();

                    tp.sellStock(sellName, sellQty);

                    break;

                case 4:

                    tp.viewPortfolio();
                    break;

                case 5:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}