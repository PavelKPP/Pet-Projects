import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";

        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        String loginInput;
        String passwordInput;


        bank.login.add("Admin");
        bank.login.add("Mike_Tyson");

        bank.password.add("Admin1133102");
        bank.password.add("Mike_Tyson1213acV");


        Admin admin = new Admin();

        Customer customer = new Customer();

        int menuMover;
        System.out.println("Choose your option: ");
        System.out.println("1.Login.");
        System.out.println("2.Register");
        menuMover = sc.nextInt();
        switch (menuMover){
            case 1:

                System.out.println("Type your login:");
                loginInput = sc.next();
                for(int i = 0; i < bank.login.size(); i++){
                    if(bank.login.get(i).equals(loginInput)){
                        System.out.println("Put your password:");
                        passwordInput = sc.next();
                        for(int j = 0; j < bank.password.size(); j++){
                            if(bank.password.get(j).equals(passwordInput)){
                                System.out.println( ANSI_GREEN + "Login Successful" + ANSI_RESET);
                              theStartLabel: while(true) {
                                  System.out.println("Welcome to the bank: ");
                                  System.out.println("Choose the menu: ");
                                  System.out.println("1.Admin");
                                  System.out.println("2.Customer");
                                  System.out.println("3.Exit");

                                  int menuMover2;
                                  menuMover2 = sc.nextInt();

                                  switch (menuMover2) {
                                      case 1: //Admin menu
                                          System.out.println("Here is the Admin menu:");
                                          System.out.println("1.Currency Rate.");
                                          System.out.println("2.Exchange Calculator.");
                                          System.out.println("Put the number of function in here: ");
                                          menuMover2 = sc.nextInt();
                                          switch (menuMover2) {
                                              case 1:
                                                  admin.showExnchangeRate();
                                                  continue theStartLabel;
                                              case 2:
                                                  admin.ExchangeCalc();
                                                  continue theStartLabel;
                                          }
                                          break;
                                      case 2:  //Customer Menu
                                          System.out.println("Here is the customer Menu: ");
                                          System.out.println("1.Currency Rate");
                                          System.out.println("2.Exchange Calculator");
                                          System.out.println("3.Balance");
                                          System.out.println("4.Money Deposit");
                                          System.out.println("5.Get Withdrawal");
                                          System.out.println("6.Credit availability");
                                          menuMover2 = sc.nextInt();
                                          switch (menuMover2) {
                                              case 1:
                                                  customer.showExnchangeRate();
                                                  continue theStartLabel;
                                              case 2:
                                                  customer.ExchangeCalc();
                                                  continue theStartLabel;
                                              case 3:
                                                  System.out.println("Current Balance: " + bank.getBalance());
                                                  continue theStartLabel;
                                              case 4:
                                                  customer.moneyDeposit();
                                                  continue theStartLabel;
                                              case 5:
                                                  customer.getWithdrawal();
                                                  continue theStartLabel;
                                              case 6:
                                                  customer.creditAvaiability();
                                                  continue theStartLabel;
                                          }
                                          break;
                                      case 3:
                                          System.out.println("See you later!");
                                          System.exit(0);
                                      default:
                                          System.out.println("There is no function as you chose.");
                                          continue theStartLabel;

                                  }
                              }
                          }if(!bank.password.get(j).equals(passwordInput)){
                                System.out.println("Incorrect password!");
                                System.exit(0);
                            }

                    }
                }else{
                        System.out.println(ANSI_RED + "Incorrect Login!" + ANSI_RESET);
                        break;
                    }
            }
                break;
            case 2:
                bank.accountRegister();
                break;
        }
    }
}