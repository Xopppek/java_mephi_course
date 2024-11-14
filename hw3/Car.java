public class Car extends Transport {
    private final CarEngine engine;

    public Car(String model, FuelType fuelType) {
        super(model);
        this.engine = new CarEngine(fuelType);
    }

    @Override
    public void move() {
        engine.start();
        System.out.println("Car is moving...");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Car: [Model: %s, Fuel type: %s]%n", this.getModel(), this.engine.getFuelType());
    }

    public final class CarEngine extends Engine {
        public CarEngine(FuelType fuelType) {
            super(fuelType);
        }

        @Override
        public void start() {
            System.out.println("Car engine is starting...");
        }
    }
}
