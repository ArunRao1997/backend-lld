package src.adapterdesign.component;

public class IciciBankApiAdapter implements BankApiAdapter{
    @Override
    public double getBalance(String accNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String from, String to, int amt) {
        return false;
    }
}
