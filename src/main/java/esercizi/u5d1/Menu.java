package esercizi.u5d1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<Merchandise> merchandiseItems;

    public Menu() {
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.merchandiseItems = new ArrayList<>();
        initializeMenuItems();
    }

    private void initializeMenuItems() {
        Pizza margherita = new Pizza("Margherita", false, 4.99, "Calories: 250, Fat: 12g, Carbs: 30g, Protein: 8g");
        margherita.addTopping(new Topping("Prosciutto", 2.5));
        margherita.addTopping(new Topping("Funghi", 1.5));
        pizzas.add(margherita);

        Pizza hawaiian = new Pizza("Hawaiian Pizza", false, 6.99, "Calories: 280, Fat: 14g, Carbs: 32g, Protein: 10g");
        hawaiian.addTopping(new Topping("Prosciutto", 2.5));
        hawaiian.addTopping(new Topping("Ananas", 1.0));
        pizzas.add(hawaiian);

        drinks.add(new Drink("CocaCola", 2.0, "Bassiisima in calorie"));
        drinks.add(new Drink("Fanta", 1.5, "Senza zucchero salutare"));

        merchandiseItems.add(new Merchandise("Cappello", 10.0));
        merchandiseItems.add(new Merchandise("Tazza", 5.0));
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Merchandise> getMerchandiseItems() {
        return merchandiseItems;
    }

    public void printMenu() {
        System.out.println("Pizze:");
        for (Pizza pizza : pizzas) {
            String pizzaLine = pizza.getName() + " - " + pizza.getPrice() + "€";
            if (pizza.isLarge()) {
                pizzaLine += " (Grande)";
            }
            System.out.println(pizzaLine);
            System.out.println("  " + pizza.getNutritionalInfo());

            for (Topping topping : pizza.getToppings()) {
                String toppingLine = "+ " + topping.getName() + " - " + topping.getPrice() + "€";
                System.out.println(toppingLine);
            }

            System.out.println();
        }

        System.out.println("Bevande:");
        for (Drink drink : drinks) {
            String drinkLine = drink.getName() + " - " + drink.getPrice() + "€";
            System.out.println(drinkLine);
        }

        System.out.println("Articoli di oggettistica:");
        for (Merchandise item : merchandiseItems) {
            String itemLine = item.getName() + " - " + item.getPrice() + "€";
            System.out.println(itemLine);
        }
    }
}
