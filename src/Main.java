import java.util.Scanner;
import java.util.Locale;
import java.util.Currency;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameClient = "Cristian Santos";
        String accountNumber = "123456789";
        double balance = 2500.0;

        Locale brazil = new Locale("pt", "BR");
        Currency currency = Currency.getInstance(brazil);

        System.out.println("Welcome to BankIt" + "\n" + "Client: " + nameClient + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: " + currency.getSymbol() + balance + "\n");

        System.out.println("Enter the desired option ");
        String menuOptions = """
                1 - Check Balance
                2 - Deposit
                3 - Transfer
                4 - To Go Out
                """;
        System.out.println(menuOptions);
        int options = 0;

        while (options != 4) {
            options = input.nextInt();
            switch (options) {
                case 1:
                    System.out.println("Balance: " + currency.getSymbol() + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit made successfully");
                    break;
                case 3:
                    System.out.println("Enter the amount to transfer: ");
                    double transfer = input.nextDouble();
                    if (transfer > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= transfer;
                        System.out.println("Transfer made successfully");
                    }
                    break;
                case 4:
                    System.out.println(("Thank you for using BankIt"));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}