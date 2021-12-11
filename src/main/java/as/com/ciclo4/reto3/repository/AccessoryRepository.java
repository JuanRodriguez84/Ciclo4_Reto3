package as.com.ciclo4.reto3.repository;

import as.com.ciclo4.reto3.model.Accessory;
import as.com.ciclo4.reto3.repository.crud.AccessoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Carlos Rodríguez
 */
@Repository
public class AccessoryRepository {

    @Autowired
    private AccessoryCrudRepository crudInterface;

    public List<Accessory> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Accessory> getAccesory(String reference) {
        return crudInterface.findById(reference);
    }

    public Accessory create(Accessory accesory) {
        return crudInterface.save(accesory);
    }

    public void update(Accessory accesory) {
        crudInterface.save(accesory);
    }

    public void delete(Accessory accesory) {
        crudInterface.delete(accesory);
    }
}
