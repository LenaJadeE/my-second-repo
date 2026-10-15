package com.pluralsight;

import java.text.DecimalFormat;

public class Receipt {
    public static void main(String[] args) {

// Step 3

// Step 3.1
// Create variables for an item name (String) and item price (double)
// Step 3.2
// Create a quantity variable (int)
// Step 3.3
// Build and print: EX. "You bought 3 apples for $7.10"

        String itemName = "apples";
        double itemPrice = 7.10;
        int quantity = 3;

    //I wanted to show how to neatly align the price in a priced proper format
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("You bought " + quantity + " " + itemName + " for $" + df.format(itemPrice));
    }
}