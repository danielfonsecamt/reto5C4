package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Accessory;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Daniel
 */
public interface AccesoryCrudRepository extends MongoRepository<Accessory, String> {
    
    public Optional<Accessory> findBydescription(String description);

    public Optional<Accessory> findByprice(String price);
    
}
