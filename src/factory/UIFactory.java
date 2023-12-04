package src.factory;

import src.factory.components.Button;
import src.factory.components.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();

}
