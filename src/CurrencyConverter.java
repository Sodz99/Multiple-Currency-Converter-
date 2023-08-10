import java.util.Scanner;

public class CurrencyConverter {

    static double curr2Amt;
    static double euroRate = 0.912545;
    static double usdRate = 1.10035;
    static double usdinrRate = 82.7584;

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

                    case "EUR":
                        System.out.println(eurConvertor(curr1Amt));
                        break;

                    case "INR":
                        System.out.println(inrConvertor(curr1Amt));
                        break;
                }
            break;

            case "EUR":
                System.out.println(usdConvertor(curr1Amt));

        }
    }


    public static double eurConvertor(double curr1Amt) {
        curr2Amt = curr1Amt * euroRate;
        return curr2Amt;
    }

    public static double usdConvertor(double curr1Amt) {
        curr2Amt = curr1Amt * usdRate;
        return curr2Amt;
    }

    public static double inrConvertor(double curr1Amt) {
        curr2Amt = curr1Amt * usdinrRate;
        return curr2Amt;
    }
}
