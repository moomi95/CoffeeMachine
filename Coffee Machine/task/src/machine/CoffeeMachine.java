package machine;


import java.util.Scanner;


public class CoffeeMachine {

    public static int rwater = 400;
    public static int rmilk = 540;
    public static int rcoffeeBeans = 120;
    public static int rdisposableCups = 9;
    public static int rmoney = 550;


    public static void main(String[] args) {

        //initial status

        String buy = "buy";
        String fill = "fill";
        String take = "take";
        String remaining = "remaining";
        String exit = "exit";

        // initial function - PRINT

        printerCoffe(rwater, rmilk, rcoffeeBeans, rdisposableCups, rmoney);

        System.out.println("Write action (buy, fill, take, remaining, exit): ");


        {

            while (true) {
                Scanner makeADecision = new Scanner(System.in);
                String decisionMade = makeADecision.nextLine();
                switch (decisionMade) {
                    case "buy":
                        makeADecision.equals(buy);
                        coffeeCalculator(rwater, rmilk, rcoffeeBeans, rdisposableCups, rmoney);
                        printText();

                        continue;
                    case "fill":
                        makeADecision.equals(fill);
                        coffeeFiller(rwater, rmilk, rcoffeeBeans, rdisposableCups, rmoney);
                        printText();
                        continue;
                    case "take":
                        makeADecision.equals(take);
                        moneyTaker(rmoney);
                        printText();
                        continue;
                    case "remaining":
                        makeADecision.equals(remaining);
                        printerCoffe(rwater, rmilk, rcoffeeBeans, rdisposableCups, rmoney);
                        printText();
                        continue;
                    case "exit":
                        makeADecision.equals(exit);
                        break;
                    default:
                        System.out.println("Invalid action.");
                        printText();
                        continue;
                }
            }

        }

    }

    public static void printerCoffe(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        System.out.println("The coffe machine has: ");
        System.out.println(rwater + " ml of water");
        System.out.println(rmilk + " ml of milk");
        System.out.println(rcoffeeBeans + " g of coffee beans");
        System.out.println(rdisposableCups + " dsposable cups");
        System.out.println("$" + rmoney + " of money");
    }

    public static void coffeeCalculator(int water, int milk, int coffeeBeans, int disposableCups, int money) {

// water i water parametar i arugment isto ime imali
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner userCoffeeChosen = new Scanner(System.in);
        String coffeeChosen = userCoffeeChosen.nextLine();

        if (coffeeChosen.equalsIgnoreCase("1")) {
            if (water > 250 && coffeeBeans > 16 && disposableCups >= 1) {
                rwater -= 250;
                rcoffeeBeans -= 16;
                rdisposableCups -= 1;
                rmoney += 4;
                System.out.println("I have enough resources, making you a coffee!");
            } else if (rwater < 250) {
                System.out.println("Sorry, not enough water!");

            } else if (rcoffeeBeans < 16) {
                System.out.println("Sorry, not enough coffee beans!");

            } else if (rdisposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }

        } else if (coffeeChosen.equalsIgnoreCase("2")) {
            if (rwater > 350 && rmilk > 75 && rcoffeeBeans > 20 && rdisposableCups >= 1) {
                rwater -= 350;
                rmilk -= 75;
                rcoffeeBeans -= 20;
                rdisposableCups -= 1;
                rmoney += 7;
                System.out.println("I have enough resources, making you a coffee!");
            } else if (rwater < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (rmilk < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (rcoffeeBeans < 20){
                System.out.println("Sorry, not enough coffee beans!");
            }else if (rdisposableCups < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        } else if (coffeeChosen.equalsIgnoreCase("3")) {
            if (rwater > 200 && rmilk >100 && rcoffeeBeans > 12 && rdisposableCups >= 1) {
                rwater -= 200;
                rmilk -= 100;
                rcoffeeBeans -= 12;
                rdisposableCups -= 1;
                rmoney += 6;
                System.out.println("I have enough resources, making you a coffee!");
            }else if(rwater < 200){
                System.out.println("Sorry, not enough water!");
            } else if (rmilk < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (rcoffeeBeans < 12){
                System.out.println("Sorry, not enough coffee beans!");
            }else if (rdisposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        } else if (coffeeChosen.equalsIgnoreCase("back")) {
            printText();

        } else
            System.out.println("Invalid choice");
    }

    public static void coffeeFiller(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        System.out.println("Write how many ml of water you want to add: ");
        Scanner addWater = new Scanner(System.in);
        int waterAdded = addWater.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        Scanner addMilk = new Scanner(System.in);
        int milkAdded = addMilk.nextInt();
        System.out.println("Write how many grams of coffee you want to add: ");
        Scanner addCoffee = new Scanner(System.in);
        int coffeeAdded = addCoffee.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        Scanner addCups = new Scanner(System.in);
        int cupsAdded = addCups.nextInt();
        rwater += waterAdded;
        rmilk += milkAdded;
        rcoffeeBeans += coffeeAdded;
        rdisposableCups += cupsAdded;

        printerCoffe(rwater, rmilk, rcoffeeBeans, rdisposableCups, money);
    }

    public static void moneyTaker(int money) {
        System.out.println("I give you $" + rmoney);
        rmoney = 0;

    }

    static void printText() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
    }
}
    