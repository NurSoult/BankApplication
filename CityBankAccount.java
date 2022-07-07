package BITLAB.BankApplication;

public class CityBankAccount implements BankAccount {
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount() {}

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (balance >= credit)
            balance -= credit;
        else {
            System.out.println("Недостаточно средств");
        }
    }

    @Override
    public void debetBalance(int debet) {
        this.balance += debet;
    }

    @Override
    public String accountData() {
        return "Имя - " + name +
                "\nФамилия - " + surname +
                "\nБаланс: " + balance +
                "\nНомер аккаунта: " + accountNumber +
                "\nПинкод: " + pinCode;
    }
}
