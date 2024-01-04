
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restauracja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dish> dishList = new ArrayList<>();
        List<Dish> koszyk = new ArrayList<>();
        Dish meatDish1 = new MeatDish("Mielony", 27, "mielony, ziemniaki, buraki", "mięso mielone");
        Dish meatDish2 = new MeatDish("schabowy", 17, "schabowy, surówki, ziemniaki", "kurczak");
        Dish meatDish3 = new MeatDish("kebab", 13, "wołowina, pita, surówki", "kurczak");
        Dish vegetarianDish = new VegetarianDish("sałatka", 3, "sałata, pomidor, ogórek, kukurydza");
        dishList.add(meatDish1);
        dishList.add(meatDish2);
        dishList.add(meatDish3);
        dishList.add(vegetarianDish);

        System.out.println("Menu");
        for (Dish dish : dishList) {
            dish.displayInformation();
        }

        String choice;
        boolean isFind = false;


        do{
            System.out.println("podaj nazwę dania");
            String name = scanner.next();
            for (Dish dish : dishList) {
                if (dish.getName().equalsIgnoreCase(name.toLowerCase())) {
                    koszyk.add(dish);
                }
            }

            System.out.println("podaj składniki");
            String components = scanner.next();
            for(Dish zmien : koszyk){
                zmien.changeComponents(components);
            }
            System.out.println("zmieniono składniki na: " + components);
            isFind = true;
            if(isFind)
                System.out.println("czy chcesz dodać kolejny produkt");
            choice = scanner.next();

        }while(choice.equalsIgnoreCase("t"));


        for (Dish wypiszKoszyk : koszyk) {
            wypiszKoszyk.displayInformation();
        }
    }

}