package src.factory;

import src.factory.UIFactory;
import src.factory.components.AndroidButton;
import src.factory.components.AndroidMenu;
import src.factory.components.Button;
import src.factory.components.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
