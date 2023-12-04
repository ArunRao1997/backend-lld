package src.decorator;

public class ChocoCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

//    Base Constructor
    public ChocoCone (){}

//    Add-on Constructor
    public ChocoCone (IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription(){
        if(iceCreamConeConstituents != null){
            return iceCreamConeConstituents.getDescription() + " + Choco Cone";
        }
        return "Choco Cone";
    }

    @Override
    public int getCost(){
        if(iceCreamConeConstituents != null){
            return iceCreamConeConstituents.getCost() + 30;
        }
        return 30;
    }
}
