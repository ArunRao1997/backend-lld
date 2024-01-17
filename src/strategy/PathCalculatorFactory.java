package src.strategy;

public class PathCalculatorFactory {
    static CarPathCalStrategy carPathCalStrategy = new CarPathCalStrategy();
    public static PathCalculatorStrategy getPathCalculatorByMode(String mode) {
        if ("car".equals(mode)) {
            return carPathCalStrategy;
        } else {
            return new BikePathCalStrategy();
        }
    }
}
