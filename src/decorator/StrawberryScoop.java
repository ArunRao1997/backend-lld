package src.decorator;

public class StrawberryScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public StrawberryScoop (IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    public String getDescription(){
        return iceCreamConeConstituents.getDescription();
    }

    public int getCost(){
        return iceCreamConeConstituents.getCost();
    }
}
