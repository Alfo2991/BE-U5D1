package esercizi.u5d1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Pizza {
    private String name;
    private List<Topping> toppings;
    private boolean isLarge;
    private double basePrice;
    private String nutritionalInfo;

    public Pizza(String name, boolean isLarge, double basePrice, String nutritionalInfo) {
        this.name = name;
        this.toppings = new ArrayList<>();
        this.isLarge = isLarge;
        this.basePrice = basePrice;
        this.nutritionalInfo = nutritionalInfo;
        addBaseToppings();
    }

    private void addBaseToppings() {
        toppings.add(new Topping("Pomodoro", 0.0));
        toppings.add(new Topping("Mozzarella", 0.0));
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void addTopping(String toppingName, double toppingPrice) {
        toppings.add(new Topping(toppingName, toppingPrice));
    }

    public double getPrice() {
        double total = basePrice;
        for (Topping topping : toppings) {
            total += topping.getPrice();
        }
        return total;
    }

    public String getFormattedPrice() {
        return String.format("%.2f", getPrice());
    }

    public String getFormattedNutritionalInfo() {
        return nutritionalInfo;
    }
}
