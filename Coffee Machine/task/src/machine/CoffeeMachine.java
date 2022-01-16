package machine;


import java.net.Socket;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

      /*  System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.print(">");
        Scanner waterTank = new Scanner(System.in);
        int waterAmount = waterTank.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print(">");
        Scanner milkTank = new Scanner(System.in);
        int milkAmount = milkTank.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machines has: ");
        System.out.print(">");
        Scanner coffeeTank = new Scanner(System.in);
        int coffeeAmount = coffeeTank.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        System.out.print(">");
        Scanner cups = new Scanner(System.in);
        int numberOfCups = cups.nextInt();

        //calculator

        int water = 200;
        int milk = 50;
        int coffee = 15;

        /*System.out.println("For " + numberOfCups + " cups of coffee you will need: ");
        System.out.println(water*numberOfCups + "ml of water");
        System.out.println(milk*numberOfCups + "ml of milk");
        System.out.println(coffee*numberOfCups + "g of coffee beans");*/

        int waterNeeded = water * numberOfCups;
        int milkNeeded = milk * numberOfCups;
        int coffeeNedded = coffee * numberOfCups;
        int coffeeMax = 0;
        int maxWater = 0;
        int maxMilk = 0;
        int maxCoffeeBeans = 0;
        int newMaxWater = 0;
        int newMaxMilk = 0;
        int newMaxCoffeeBeans = 0;

        do {
            newMaxWater += 200;
            newMaxMilk += 50;
            newMaxCoffeeBeans += 15;
            coffeeMax++;
        } while (newMaxWater <= waterAmount && newMaxMilk <= milkAmount && newMaxCoffeeBeans <= coffeeAmount);


        int coffeMadeableAfterMakingSome = coffeeMax - numberOfCups - 1;
        if (waterNeeded > waterAmount || milkNeeded > milkAmount || coffeeNedded > coffeeAmount) {
            System.out.println("Sorry I cant make this much coffee.");
        } else if (waterNeeded < waterAmount && milkNeeded < milkAmount && coffeeNedded < coffeeAmount) {
            System.out.println("Yes, I can make that amount of coffee");
                 //   + " (and even " + coffeMadeableAfterMakingSome + " after that)");
        }

    }
}
