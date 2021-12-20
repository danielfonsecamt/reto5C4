package com.cuatroa.retotres.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Daniel
 */
@Document(collection = "accessories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accessory {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String description;   
    private String price;
    private boolean availability = true;    
    private int quantity;
    private String photography;
}
