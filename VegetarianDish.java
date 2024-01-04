
public class VegetarianDish extends Dish{

    public VegetarianDish(String name, double price, String components) {
        super(name, price, components);
    }

    @Override
    public void prepare() {
        System.out.println("przygotowuje danie wegetariańskie " + getName());
    }

    @Override
    public void giveDish() {
        System.out.println("Podano danie wegetariańskie " + getName());
    }
}