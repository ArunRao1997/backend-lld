package src.decorator;

public class ClientMain {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents =
                new ChocoChips(
                        new VanillaScoop(
                                new StrawberryScoop(
                                        new ChocoChips(
                                                new ChocoCone(
                                                        new ChocoCone(
                                                                new OrangeCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        IceCreamConeConstituents iceCreamConeConstituents1 =
                new VanillaScoop(
                        new VanillaScoop(
                                new StrawberryScoop(
                                        new ChocoChips(
                                                new ChocoCone(
                                                        new ChocoCone(
                                                                new OrangeCone()
                                                        )
                                                )
                                        )
                                )
                        )
                );

        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());


    }
}
