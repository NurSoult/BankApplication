package BITLAB.BankApplication;

public class Database {
    public static BankAccount[] allAccounts = new BankAccount[10];

    static {
        allAccounts[0] = new CityBankAccount("Nurgali","Soltangeldinov",200000,"KZ010322312", "0102");
        allAccounts[1] = new CityBankAccount("Ilyas","Zhuanyshev",200000,"KZ010322313", "0101");
        allAccounts[2] = new NationalBankAccount("Erbosyn Tleubaev", 150000, "KZ0101112", "2010");
        allAccounts[3] = new NationalBankAccount("Maksat Galiev", 420000, "KZ010122114", "1076");
        allAccounts[4] = new CityBankAccount("Omirzhan","Kyzyruly",25000,"KZ010442554", "2004");
        allAccounts[5] = new CityBankAccount("Chen","Hujei",150,"KZ010510014", "0001");
        allAccounts[6] = new CityBankAccount("Dre","Parker",0,"KZ010322871", "2011");
        allAccounts[7] = new CityBankAccount("Bakhtiyar","Artaev",45000,"KZ020215411", "2000");
        allAccounts[8] = new CityBankAccount("Roman","Pak",42500,"KZ01022232", "0000");
        allAccounts[9] = new NationalBankAccount("Elzhas Aueskhan", 14000, "KZ030222145", "2003");
    }

}
