package com.hiper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Daniel
 */
@Document(collection="supplements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplement {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String description;
    private double price;
    private boolean availability = true;    
    private int quantity;
    private String photography;
}
