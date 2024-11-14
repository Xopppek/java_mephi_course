public class Bicycle extends Transport {
    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Bicycle: [Model: %s]%n", this.getModel());
    }
}
