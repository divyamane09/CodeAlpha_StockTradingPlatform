package com.codealpha;

import java.util.ArrayList;

public class TradingPlatform 
{
    ArrayList<Stock> stocks = new ArrayList<>();

    // Constructor
    TradingPlatform() 
    {
        stocks.add(new Stock("TATA", 100));
        stocks.add(new Stock("INFY", 200));
        stocks.add(new Stock("WIPRO", 150));
    }

    // View Market Stocks
    void viewStocks() 
    {
        System.out.println("\n----- Market Stocks -----");

        for(Stock s : stocks) 
        {
            System.out.println("Stock Name : " + s.stockName);
            System.out.println("Price      : ₹" + s.price);
            System.out.println();
        }
    }

    // Buy Stock
    void buyStock(String name, int qty) 
    {
        for(Stock s : stocks) 
        {
            if(s.stockName.equalsIgnoreCase(name)) 
            {
                s.quantity = s.quantity + qty;

                System.out.println("Stock Purchased Successfully!");
                return;
            }
        }

        System.out.println("Stock Not Found!");
    }

    // Sell Stock
    void sellStock(String name, int qty) 
    {
        for(Stock s : stocks) 
        {
            if(s.stockName.equalsIgnoreCase(name)) 
            {
                if(s.quantity >= qty) 
                {
                    s.quantity = s.quantity - qty;

                    System.out.println("Stock Sold Successfully!");
                } 
                else 
                {
                    System.out.println("Not Enough Shares!");
                }

                return;
            }
        }

        System.out.println("Stock Not Found!");
    }

    // View Portfolio
    void viewPortfolio() 
    {
        System.out.println("\n----- Your Portfolio -----");

        for(Stock s : stocks) 
        {
            if(s.quantity > 0) 
            {
                System.out.println("Stock Name : " + s.stockName);
                System.out.println("Shares     : " + s.quantity);
                System.out.println();
            }
        }
    }
}