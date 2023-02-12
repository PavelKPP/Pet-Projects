import java.sql.SQLOutput;

public class Customer extends Bank implements ISameFunc{
    Bank bank = new Bank();

    int cashGiver;
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
            switch (inputCurrencyCalc){
                case "USD":
                    inputNumberCurrencyCalc = inputNumberCurrencyCalc * USDCURRENCY;
                    System.out.println("You will get: " + inputNumberCurrencyCalc + "USD");
                    break;
                case "EUR":
                    inputNumberCurrencyCalc = inputNumberCurrencyCalc * EUROCURRENCY;
                    System.out.println("You will get : " + inputNumberCurrencyCalc + "EURO");
                    break;
                case "UAH":
                    inputNumberCurrencyCalc = inputNumberCurrencyCalc * UAHCURRENCY;
                    System.out.println("You will get : " + inputNumberCurrencyCalc + "UAH");
                    break;
                default:
                    System.out.println("There is no currency like you chose.");
                    break;
            }
    }


    public void creditAvaiability() {
        int interestRate;
        double downpayment;
        int availableCredit;
        System.out.println("Choose a prefrent interest rate: 5%, 10%, 25%");

        interestRate = sc.nextInt();

        System.out.println("Put the amount of downpayment: ");

        downpayment = sc.nextDouble();

        switch (interestRate){
            case 5:
                availableCredit = (int) (downpayment * 100) / 5;
                System.out.println("Available credit: " + availableCredit);
                break;
            case 10:
                availableCredit = (int) (downpayment * 100) / 3;
                System.out.println("Available credit: " + availableCredit);
                break;
            case 25:
                availableCredit = (int) (downpayment * 100) / 2;
                System.out.println("Available credit: " + availableCredit);
                break;
            default:
                System.out.println("Threre is no interest rate as you put.");
        }


    }

    public void moneyDeposit(){
        double topUpper;
        System.out.println("Put the amount of your deposit: ");
        topUpper = sc.nextDouble();
        bank.setDeposit(topUpper);
        System.out.println("Balance due to deposit: " + bank.getBalance());
    }

    public void getWithdrawal(){
        System.out.println("Put the amount of the withdrawal: ");
        cashGiver = sc.nextInt();
        bank.setCash(cashGiver);
        System.out.println("This is your withdrawal: " + cashGiver);
        System.out.println("Balance due to operation: " + balanceAfterWithdarawal(getBalance(), cashGiver, 0));
    }


}
