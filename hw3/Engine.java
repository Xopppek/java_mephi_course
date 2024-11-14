public sealed abstract class Engine permits Airplane.AirplaneEngine,
                                            Car.CarEngine,
                                            SteamShip.SteamShipEngine {
    private final FuelType fuelType;

    public Engine(FuelType fuelType){
        this.fuelType = fuelType;
    }

    public abstract void start();

    public FuelType getFuelType(){
        return fuelType;
    }
}
