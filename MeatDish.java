
public class MeatDish extends Dish {
    private String meatType;

    public MeatDish(String name, double price, String components, String meatType) {
        super(name, price, components);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("przygotowuje danie mięsne " + getName());
    }

    @Override
    public void giveDish() {
        System.out.println("Podano danie mięsne " + getName());
    }
}