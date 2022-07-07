package BITLAB.BankApplication;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер счета");
        String accountNumber = sc.next();

        BankAccount account = null;

        for (int i = 0; i < Database.allAccounts.length; i++) {
            if (Database.allAccounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Введите Пин код: ");
                String pinCode = sc.next();

                if (Database.allAccounts[i].getPinCode().equals(pinCode)) {
                    account = Database.allAccounts[i];
                    break;
                }
                else {
                    while (!Database.allAccounts[i].getPinCode().equals(pinCode)) {
                        System.out.println("Неверный Пин код");
                        pinCode = sc.next();
                        if (Database.allAccounts[i].getPinCode().equals(pinCode)) {
                            account = Database.allAccounts[i];
                            break;
                        }
                    }
                    break;
                }
            }
           else {
               if (i != Database.allAccounts.length-1)
                   continue;
               else
                   System.out.println("Аккаунт не найден.");
            }

        }

        while (true) {

            if (account instanceof CityBankAccount) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL" +
                        "\nPRESS [2] TO VIEW BALANCE" +
                        "\nPRESS [3] TO CHANGE PIN CODE" +
                        "\nPRESS [4] TO CASH IN ACCOUNT" +
                        "\nPRESS [5] TO VIEW ACCOUNT DATA" +
                        "\nPRESS [6] TO EXIT");

                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Введите сумму денег для вывода");
                    int credit = sc.nextInt();
                    account.creditBalance(credit);
                    System.out.println("Ваш баланс: " + account.totalBalance());
                }

                else if (choice == 2)
                    System.out.println("Ваш баланс: " + account.totalBalance());

                else if (choice == 3) {
                    System.out.println("Введите новый Пин код:");
                    String newPinCode = sc.next();
                    account.setPinCode(newPinCode);
                    System.out.println("Новый Пин код установлен!");
                }

                else if (choice == 4) {
                    System.out.println("Приложите купюру");
                    int debet = sc.nextInt();
                    account.debetBalance(debet);
                    System.out.println("Ваш баланс: " + account.totalBalance());
                }

                else if (choice == 5) {
                    System.out.println(account.accountData());
                }
                else if (choice == 6)
                    break;
                else
                    break;

            }
            else if (account instanceof NationalBankAccount) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL" +
                        "\nPRESS [2] TO VIEW BALANCE" +
                        "\nPRESS [3] TO EXIT");

                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Введите сумму денег для вывода");
                    int credit = sc.nextInt();
                    account.creditBalance(credit);
                    System.out.println("Ваш баланс: " + account.totalBalance());
                }
                else if (choice == 2)
                    System.out.println("Ваш баланс: " + account.totalBalance());

                else if (choice == 3)
                    break;
                else
                    break;
            }

            else
                break;
        }

    }

}
