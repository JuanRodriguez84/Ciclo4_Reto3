package as.com.ciclo4.reto3.repository.crud;

import as.com.ciclo4.reto3.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Juan Carlos Rodríguez
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    // Para seleccionar la orden con el id maximo para creación de ordenes de uno en uno
    Optional<Order> findTopByOrderByIdDesc();

    //Retorna las ordenes de pedido que coincidad con la zona recibida como parametro
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);

}
