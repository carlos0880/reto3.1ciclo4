package reto3c4.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "product")
public class Product {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String name;
    private String description;
    private boolean availability = true;
    private double price;
    private Integer quantity;
    private String photography;

}
