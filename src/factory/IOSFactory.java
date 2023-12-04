package src.factory;

import src.factory.UIFactory;
import src.factory.components.Button;
import src.factory.components.IosButton;
import src.factory.components.IosMenu;
import src.factory.components.Menu;

public class IOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
