package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the pizza you are creating");
        System.out.println("Small, Medium or Large");
        String pizzaSize = "";
        double sum = 0;
        boolean ianis = true;
        while (ianis) {
            pizzaSize = input.next();
            ianis = false;
            if (pizzaSize.equalsIgnoreCase("small")) {
                sum = sum + 7.99;
                pizzaSize = "Small";
            } else {
                if (pizzaSize.equalsIgnoreCase("medium")) {
                    sum = sum + 10.99;
                    pizzaSize = "Medium";
                } else {
                    if (pizzaSize.equalsIgnoreCase("large")) {
                        sum = sum + 13.99;
                        pizzaSize = "Large";
                    } else {
                        System.out.println("This is not a pizza size you idiot");
                        ianis = true;
                    }
                }
            }
        }
        System.out.println("Your first two toppings are free.");
        System.out.println("Choose one from; Mushroom, Ham, Pepperoni, Onion, Chilli, Sweetcorn");
        System.out.println("If you don't want a topping please enter 'skip'");
        String toppingOne = toppingMethod();
        System.out.println("Now chose your second topping");
        String toppingTwo = toppingMethod();
        System.out.println("You can add up to two more toppings for £1.25 each");
        System.out.println("If you don't want an extra topping please enter 'skip'");
        String extraToppingOne = toppingMethod();
        System.out.println("Please enter 'confirm' to confirm your choice");
        double extraToppingOnePrice = toppingSum();
        if (extraToppingOnePrice == 0) {
            extraToppingOnePrice = extraToppingOnePrice + 1.25;
        }
        if (extraToppingOne.equalsIgnoreCase("")) {
            extraToppingOnePrice = extraToppingOnePrice - 1.25;
        }
        System.out.println("Please enter you second extra topping, enter 'skip' if you don't want one");
        String extraToppingTwo = toppingMethod();
        System.out.println("Please enter 'confirm' to confirm your choice");
        double extraToppingTwoPrice = toppingSum();
        if (extraToppingTwoPrice == 0) {
            extraToppingTwoPrice = extraToppingTwoPrice + 1.25;
        }
        if (extraToppingTwo.equalsIgnoreCase("")){
            extraToppingTwoPrice = extraToppingTwoPrice - 1.25;
        }
        double totalPrice = sum + extraToppingOnePrice + extraToppingTwoPrice;
        System.out.println("Your order is a "+pizzaSize+" pizza with "+toppingOne+" "+toppingTwo+" "+extraToppingOne+" "+extraToppingTwo);
        System.out.println("And it will cost you £" + totalPrice);
        System.out.println("Thank you for ordering at Zack's Pizzeria, enjoy your food!");
    }
    static String toppingMethod() {
        Scanner input = new Scanner(System.in);
        boolean henry = true;
        String topping = "";
        while (henry) {
            topping = input.next();
            henry = false;
            if (topping.equalsIgnoreCase("mushroom")) {
                topping = "Mushroom";
            } else if (topping.equalsIgnoreCase("ham")) {
                topping = "Ham";
            } else if (topping.equalsIgnoreCase("pepperoni")) {
                topping = "Pepperoni";
            } else if (topping.equalsIgnoreCase("onion")) {
                topping = "Onion";
            } else if (topping.equalsIgnoreCase("chilli")) {
                topping = "Chilli";
            } else if (topping.equalsIgnoreCase("sweetcorn")) {
                topping = "Sweetcorn";
            } else if (topping.equalsIgnoreCase("skip")) {
                topping = "";
            } else {
                System.out.println("Sorry but we do not have this topping");
                System.out.println("Please enter one that is currently available");
                henry = true;
            }
        }
        return topping;
    }
    static double toppingSum() {
        Scanner input = new Scanner(System.in);
        String confirmation = "";
        double extraToppingSum = 0;
        boolean europe = true;
        while (europe) {
            europe = false;
            confirmation = input.next();
            if (confirmation.equalsIgnoreCase("confirm")){
                extraToppingSum = 1.25;
            }
            else {
                System.out.println("extra topping cancelled");
                extraToppingSum = 0;
            }
        }
        return extraToppingSum;
    }
}



