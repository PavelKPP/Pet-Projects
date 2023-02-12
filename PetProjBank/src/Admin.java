import java.util.Scanner;

public class Admin extends Bank implements ISameFunc{
    Scanner sc = new Scanner(System.in);

    Main main = new Main();

    @Override
    public void showExnchangeRate() {
        System.out.println("CAD TO USD: " + USDCURRENCY);
        System.out.println("CAD TO EURO: " + EUROCURRENCY);
        System.out.println("CAD TO UAH: " + UAHCURRENCY);
    }

    @Override
    public void ExchangeCalc() {
        System.out.println("Enter the amount of CAD for calculation: ");
        inputNumberCurrencyCalc = sc.nextDouble();
        System.out.println("Choose your currency: USD, EUR, UAH.");
        inputCurrencyCalc = sc.next();
            switch(inputCurrencyCalc){
                case "USD":
                    inputNumberCurrencyCalc = inputNumberCurrencyCalc * USDCURRENCY;
                    System.out.println("You will get: " + inputNumberCurrencyCalc + "USD");
                    break;
                case "EUR":
                    inputNumberCurrencyCalc = inputNumberCurrencyCalc * EUROCURRENCY;
                    System.out.println("You will get: " + inputNumberCurrencyCalc + "EURO");
                    break;
                case "UAH":
                    inputNumberCurrencyCalc = inputNumberCurrencyCalc * UAHCURRENCY;
                    System.out.println("You will get: " + inputNumberCurrencyCalc + "UAH");
                    break;
                default:
                    System.out.println("There is no currency like you chose.");
                    break;
            }
    }






}
