package src.observer;

public class EmailSender implements OrderPlacedSubscriber{
    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("Email is sending");
    }
}
