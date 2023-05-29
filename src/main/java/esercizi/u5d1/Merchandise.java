package esercizi.u5d1;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Merchandise {
    private String name;
    private double price;

    public Merchandise(String name, double price) {
        this.name = name;
        this.price = price;
    }
}