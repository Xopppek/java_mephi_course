public class Sailboat extends Ship {

    public Sailboat(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("Sailboat is moving...");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Sailboat: [Model: %s]%n", this.getModel());
    }
}
