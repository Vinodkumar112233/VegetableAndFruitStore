package com.javaPoc;

import java.util.Scanner;

public class VegetableAndFruitStore {

    public static void main(String[] args) {

        System.out.println("Hi Sir/Madam, Welcome To Our Vegetable And Fruit Store 🍅🍇");

        Scanner sc = new Scanner(System.in);

        String yesno;

        double totalVegetableCost = 0;
        double totalFruitCost = 0;

        do {

            System.out.println("\nEnter Your Category Sir/Madam : Vegetables/Fruits");

            String category = sc.next().toLowerCase();

            switch (category) {

            case "vegetables" -> {

                do {

                    System.out.println("\nEnter Vegetable:");
                    String vegetable = sc.next().toLowerCase();

                    double quantity;

                    switch (vegetable) {

                    case "tomato" -> {

                        System.out.println("Tomato per kg is : 50");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalVegetableCost += 50 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "brinjal" -> {

                        System.out.println("Brinjal per kg is : 60");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalVegetableCost += 60 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "ladiesfinger" -> {

                        System.out.println("Ladies Finger per kg is : 40");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalVegetableCost += 40 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "capsicum" -> {

                        System.out.println("Capsicum per kg is : 70");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalVegetableCost += 70 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "potato" -> {

                        System.out.println("Potato per kg is : 30");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalVegetableCost += 30 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    default -> {

                        System.out.println(
                                "Entered Vegetable Is Out Of Stock In Our Store 😊"
                        );
                    }
                    }

                    System.out.println("\nIf You want to buy more Vegetables, select Yes");
                    System.out.println("If You want to stop buying Vegetables, select No");

                    yesno = sc.next();

                } while (yesno.equalsIgnoreCase("yes"));

                System.out.println("\nYour Total Vegetables Price is : "
                        + totalVegetableCost);
            }

            case "fruits" -> {

                do {

                    System.out.println("\nEnter Fruit:");

                    String fruit = sc.next().toLowerCase();

                    double quantity;

                    switch (fruit) {

                    case "apple" -> {

                        System.out.println("Apple per kg is : 100");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalFruitCost += 100 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "banana" -> {

                        System.out.println("Banana per dozen is : 70");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalFruitCost += 70 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "grapes" -> {

                        System.out.println("Grapes per kg is : 80");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalFruitCost += 80 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    case "pineapple" -> {

                        System.out.println("Pineapple per kg is : 150");
                        System.out.println("Enter Quantity:");

                        quantity = sc.nextDouble();

                        if (quantity > 0) {
                            totalFruitCost += 150 * quantity;
                        } else {
                            System.out.println("Quantity must be greater than 0.");
                        }
                    }

                    default -> {

                        System.out.println(
                                "Entered Fruit Is Out Of Stock In Our Store 😊"
                        );
                    }
                    }

                    System.out.println("\nIf You want to buy more Fruits, select Yes");
                    System.out.println("If You want to stop buying Fruits, select No");

                    yesno = sc.next();

                } while (yesno.equalsIgnoreCase("yes"));

                System.out.println("\nYour Total Fruits Price is : "
                        + totalFruitCost);
            }

            default -> {

                System.out.println(
                        "Invalid Category! Please enter Vegetables or Fruits."
                );
            }
            }

            System.out.println("\nIf You want to buy more Vegetables/Fruits, select Yes");
            System.out.println("If You want to stop shopping, select No");

            yesno = sc.next();

        } while (yesno.equalsIgnoreCase("yes"));

        System.out.println("\n--------------------------------");

        System.out.println("Total Vegetable Price : " + totalVegetableCost);
        System.out.println("Total Fruit Price     : " + totalFruitCost);
        System.out.println("Total Bill            : "
                + (totalFruitCost + totalVegetableCost));

        System.out.println("--------------------------------");

        System.out.println("Thank you for choosing our store ❤️");

        sc.close();
    }
}