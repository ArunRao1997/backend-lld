package src.adapterdesign.component;

public interface BankApiAdapter {
    double getBalance(String accNumber);

    boolean sendMoney(String from, String to, int amt);
}
