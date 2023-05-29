package esercizi.u5d1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping {
    private String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }
}