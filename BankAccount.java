package BITLAB.BankApplication;

public interface BankAccount {
    public String getAccountNumber(); // Данный метод возвращает номер счета

    public String getPinCode(); // Данный метод возвращает пин код карточки

    public void setPinCode(String pinCode); // Данный метод меняет пин код карточки

    public int totalBalance(); // Данный метод возвращает текущий баланс

    public void creditBalance(int credit); // Данный метод мы используем при снятии денег со счета

    public void debetBalance(int debet); // Данный метод мы используем при добавлении денег к счету

    public String accountData(); // Данный метод возвращает данные о клиенте
}
