import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        var transports = new LinkedList<Transport>();
        transports.add(new Car("Audi 8000", FuelType.GASOLINE));
        transports.add(new Airplane("Boing 200", FuelType.DIESEL));
        transports.add(new Bicycle("Stels"));
        transports.add(new SteamShip("Lenin", FuelType.COAL));
        transports.add(new Sailboat("poBEDA"));

        for (var transport : transports) {
            transport.displayInfo();
            transport.move();
            System.out.println();
        }

    }
}
