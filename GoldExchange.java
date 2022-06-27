import java.util.Scanner;

public class GoldExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter gold price in USD");
        double goldPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter dollar price");
        double dollarPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter gold carat");
        int carat = Integer.parseInt(scanner.nextLine());

        double pricePerGram = goldPrice / 31.1034768;
        double pricePerCarat = pricePerGram / 24;
        double priceInDollars = pricePerCarat * carat;
        double priceInLeva = priceInDollars * dollarPrice;

        System.out.printf("Price per gram is %.2fBGN", priceInLeva);
    }
}
