package src.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();
    public static Flipkart getInstance(){
        if(instance == null){
            return new Flipkart();
        }
        else {
            return instance;
        }
    }

    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(){
//        an.notify
//        ig.generateInvoice
//        es.send
        for (OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
