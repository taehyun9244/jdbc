package hello.jdbc.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {

    private String itemId;
    private int price;

    public Item(String itemId, int price) {
        this.itemId = itemId;
        this.price = price;
    }
}
