public class SteamShip extends Ship {
    private final SteamShipEngine engine;

    public SteamShip(String model, FuelType fuelType) {
        super(model);
        this.engine = new SteamShipEngine(fuelType);
    }

    @Override
    public void move() {
        engine.start();
        System.out.println("Steam ship is moving...");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Steam ship: [Model: %s, Fuel type: %s]%n", this.getModel(), this.engine.getFuelType());
    }

    public final class SteamShipEngine extends Engine {
        public SteamShipEngine(FuelType fuelType) {
            super(fuelType);
        }

        @Override
        public void start() {
            System.out.println("Steam ship engine is starting...");
        }
    }
}
