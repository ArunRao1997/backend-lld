package src.factory;

import src.factory.components.Button;

public class ClientMain {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.IOS);

        Button button = uiFactory.createButton();
        button.changeColor();
    }
}
