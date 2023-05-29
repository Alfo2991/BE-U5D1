package esercizi.u5d1;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Drink {
    private String name;
    private double price;
    private String nutritionalInformation;

    public Drink(String name, double price, String nutritionalInformation) {
        this.name = name;
        this.price = price;
        this.nutritionalInformation = nutritionalInformation;
    }
}
