package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Questions:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE

// Step 1

// Question 1:
// Create two variables to represent the salary for Bob and Gary, name them
// bobSalary and garySalary. Create a new variable named
// highestSalary. Determine which salary is greater using Math.max() and
// store the answer in highestSalary.  Set the initial salary variables to any value
// you want. Print the answer (i.e "The highest salary is …")
    double bobSalary = 65000.00;
    double garySalary = 72000.00;
    double highestSalary = Math.max( bobSalary,garySalary);
    System.out.println("The highest salary is " + highestSalary);

// Question 2:
// Find and display the smallest of two variables named carPrice and
// truckPrice.  Set the variables to any value you want.
    double carPrice = 28500.00;
    double truckPrice = 34900.00;
    double lowestPrice = Math.min(carPrice, truckPrice);
    System.out.println("The lower of the two vehicle prices is " + lowestPrice);

// Question 3:
// Find and display the area of a circle whose radius is 7.25
    double radius = 7.25;
    double circleArea = Math.PI * Math.pow(radius, 2);
    System.out.println("The area of a circle with radius " + radius + " is ");


// Question 4:
// Find and display the square root of a variable after it is set to 5.0
    double numberToRoot = 5.0;
    double squareRoot = Math.sqrt(numberToRoot);
    System.out.println("The square root of " + numberToRoot + " is " + squareRoot);

// Question 5:
// Find and display the distance between the points (5, 10) and (85, 50)
    double x1 = 5, y1 = 10;
    double x2 = 85, y2 = 50;
    double distance = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow (y2 - y1, 2));
    System.out.println("The Distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);

// Question 6:
// Find and display the absolute (positive) value of a variable after it is set to -3.8



// Question 7:
// Find and display a random number between 0 and 1



// Question 8:
// Calculate how many minutes are in 24 days, use a variable for each value you
// calculate with. BONUS: How many milliseconds?





    }
}