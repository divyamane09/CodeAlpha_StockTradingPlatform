package com.codealpha;

public class Stock 
{
    String stockName;
    int price;
    int quantity;

    // Constructor
    Stock(String stockName, int price) 
    {
        this.stockName = stockName;
        this.price = price;
        this.quantity = 0;
    }
}