public class Airplane extends Transport {
    private final AirplaneEngine engine;

    public Airplane(String model, FuelType fuelType) {
        super(model);
        this.engine = new AirplaneEngine(fuelType);
    }

    @Override
    public void move() {
        engine.start();
        System.out.println("Airplane is moving...");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Airplane: [Model: %s, Fuel type: %s]%n", this.getModel(), this.engine.getFuelType());
    }

    public final class AirplaneEngine extends Engine {
        public AirplaneEngine(FuelType fuelType) {
            super(fuelType);
        }

        @Override
        public void start() {
            System.out.println("Airplane engine is starting...");
        }
    }
}
