
public abstract class Dish {
    private String name;
    private double price;
    private String components;

    public Dish(String name, double price, String components) {
        this.name = name;
        this.price = price;
        this.components = components;
    }

    public abstract void prepare();
    public abstract void giveDish();
    public void displayInformation(){
        System.out.println("danie: " + name + " kosztuje " + price + " składa się z " + components);
    }

    public void changeComponents(String components){
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getComponents() {
        return components;
    }
}