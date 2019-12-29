import java.io.BufferedReader;
import java.util.*;


public class TripPlan {
    public static void main(String[] args) {
        Welcome();
        Time();
      local();
      area();

    }

    public static void Welcome() {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
             String secondName = scan.nextLine();
        System.out.print("Nice to meet you " + firstName + " " + secondName + ", where are you travelling to?");
        String city1 = scan.nextLine();
        String city2 = scan.nextLine();
        System.out.println("Great! " + city1 + " " + city2 + " sounds like a great trip");
    }

    public static void Time() {
        System.out.println("How many days are you doing to spend travelling?");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        double money = scan.nextDouble();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        scan.nextLine();
        String cur = scan.nextLine();

        System.out.println("How many " + cur + " are there in 1 USD?");
        double moneyusd = scan.nextDouble();
        System.out.println("If you are travelling for " + day + " days that is the same as " + day * 24 + " hours or " + day * 1440 + " minutes");
        double a = money/day;
        System.out.printf("If you are going to spend %.2f  USD that means per day you can spend up to %.2f USD", money, a);
        scan.nextLine();
        System.out.printf("Your total budget in %s is %.2f %s, which per day is %.2f %s",cur, money*moneyusd,cur, (money*moneyusd)/day,cur );
        scan.nextLine();
    }
    public static void local() {
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int hours2 = hours+12;
        System.out.println("That means that when it is midnight at home it will be " + hours + ":00 in your travel destination and when it is noon at home it will be " + hours2 + ":00");

    }
    public static void area() {
System.out.println("What is the square area of your destination county in km2?");
        Scanner scan = new Scanner(System.in);
         double area = scan.nextDouble();
double areamiles = area * 0.3861;
   System.out.println("In miles2 that is " +areamiles);
    }
}









