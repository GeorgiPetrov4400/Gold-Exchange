package GoldExchangeBG;

import java.util.Scanner;

public class GoldExchangeBG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете цена в долари на тройунция злато");
        double goldPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете курс на долара спрямо лева");
        double dollarPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете карати на златото");
        int carat = Integer.parseInt(scanner.nextLine());

        double pricePerGram = goldPrice / 31.1034768;
        double pricePerCarat = pricePerGram / 24;
        double priceInDollars = pricePerCarat * carat;
        double priceInLeva = priceInDollars * dollarPrice;

        System.out.printf("Цената за грам е %.2f лева", priceInLeva);
    }
}
