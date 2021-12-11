package as.com.ciclo4.reto3.repository.crud;

import as.com.ciclo4.reto3.model.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Juan Carlos Rodríguez
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String> {
    
}

