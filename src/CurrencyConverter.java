import java.util.Scanner;

public class CurrencyConverter {

    static double curr2Amt;

    static double usdinrRate = 82.7584;
    static double usdeurRate =  0.912791;

    static double eurusdRate =  1.0950336;
    static double eurinrRate =  90.853657;

    static double inrusdRate = 0.012051641;
    static double inreurRate =  0.01100664;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the currency converter App!");

        System.out.println("Type the currency to covert from: ");
        String currency1 = scanner.next();

        System.out.println("Type the currency to covert to: ");
        String currency2 = scanner.next();

        System.out.println("Enter " + currency1 + " amount:");
        double curr1Amt = scanner.nextInt();

        switch (currency1) {
            case "USD":
                switch (currency2) {
                    case "EUR" -> System.out.println(getUsdEurRate(curr1Amt));
                    case "INR" -> System.out.println(getUsdinrRate(curr1Amt));
                }
            break;

            case "EUR":
                switch (currency2) {
                    case "USD" -> System.out.println(getEurUsdRate(curr1Amt));
                    case "INR" -> System.out.println(getEurInrRate(curr1Amt));
                }
            break;

            case "INR":
                switch (currency2) {
                    case "USD" -> System.out.println(getInrUsdRate(curr1Amt));
                    case "EUR" -> System.out.println(getInrEurRate(curr1Amt));
                }
            break;

        }
    }

    public static double getUsdEurRate(double curr1Amt) {
        curr2Amt = curr1Amt * usdeurRate;
        return curr2Amt;
    }

    public static double getUsdinrRate(double curr1Amt) {
        curr2Amt = curr1Amt * usdinrRate;
        return curr2Amt;
    }

    public static double getEurUsdRate(double curr1Amt) {
        curr2Amt = curr1Amt * eurusdRate;
        return curr2Amt;
    }

    public static double getEurInrRate(double curr1Amt) {
        curr2Amt = curr1Amt * eurinrRate;
        return curr2Amt;
    }

    public static double getInrUsdRate(double curr1Amt) {
        curr2Amt = curr1Amt * inrusdRate;
        return curr2Amt;
    }

    public static double getInrEurRate(double curr1Amt) {
        curr2Amt = curr1Amt * inreurRate;
        return curr2Amt;
    }

}
