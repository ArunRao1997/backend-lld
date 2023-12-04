package src.factory;

public class Flutter {
    public void setTheme(){

    }

    public void setRefreshRate(){

    }

//    public UIFactory getUIFactory(String platform) {
//        if(platform.equals("Android")){
//            return new AndroidFactory();
//        } else if (platform.equals("IOS")){
//            return new IOSFactory();
//        } else {
//            throw new IllegalArgumentException("Platform not supported");
//
//        }
//    }

    public UIFactory getUIFactory(SupportedPlatforms platform) {
        return UIFactoryCreator.getUIFactoryForPlatform(platform);
    }
}
