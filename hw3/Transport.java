public abstract class Transport implements Movable{
    private final String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void displayInfo();
}
