import java.util.ArrayList;
import java.util.Scanner;

 class Bank {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    Scanner sc = new Scanner(System.in);
    final double USDCURRENCY = 0.75;
    final double EUROCURRENCY = 0.68;
    final double UAHCURRENCY = 27.28;

    ArrayList<String> login = new ArrayList<>();


    ArrayList<String> password = new ArrayList<>();


    private double balance = 2350.50;


    public double balanceAfterWithdarawal(double balance, double cash, double balanceAfterWithdrawal){
      balanceAfterWithdrawal = balance - cash;
      return balanceAfterWithdrawal;

    }

     public int getCash(int cashGiver) {
         return cash;

     }

     public void setCash(int cash) {
         this.cash = cash;
         if(cash > balance){
             System.out.println(ANSI_RED + "The amount of withdrawal is bigger than your Balance");
             System.out.println(ANSI_GREEN + "Please check your Balance!");
             System.exit(0);
         }
     }

     private int cash;


     public double getBalance() {
         return balance + deposit;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     private double deposit;

     public double getDeposit() {
         return deposit;
     }

     public void setDeposit(double deposit) {
         this.deposit = deposit;

     }

     String inputCurrencyCalc;
     Double inputNumberCurrencyCalc;


     public void accountRegister(){
         String loginAccoutRegister;
         String passwordAccountRegister;

         int attempCounter = 0;

         System.out.println("Type youre login");

         loginAccoutRegister = sc.next();
         login.add(loginAccoutRegister);

         System.out.println("Type your password. Password should be more than 8 characters.");
         passwordAccountRegister = sc.next();
            if(passwordAccountRegister.length() < 8){
                System.out.println("Password should be more than 8 characters!");
                passwordAccountRegister = sc.next();
                if(passwordAccountRegister.length() < 8){
                    System.out.println("Password should be more than 8 characters! Attempt 2/3");
                    passwordAccountRegister = sc.next();
                    if(passwordAccountRegister.length() < 8){
                        System.out.println("Error! Restart the Application");
                    }else{
                        password.add(passwordAccountRegister);
                        System.out.println("Registration Successful");
                        System.exit(1);
                    }
                }else{
                    password.add(passwordAccountRegister);
                    System.out.println("Registration Successful");
                    System.exit(1);
                }
            }else {
                password.add(passwordAccountRegister);
                System.out.println("Registration Successful");
                System.exit(1);
            }
            if (passwordAccountRegister.length() > 8){
                password.add(passwordAccountRegister);
                System.out.println("Registration Successful");
                System.exit(1);
            }
     }
 }
