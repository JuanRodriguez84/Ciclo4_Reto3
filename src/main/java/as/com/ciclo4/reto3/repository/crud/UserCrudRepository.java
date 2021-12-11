package as.com.ciclo4.reto3.repository.crud;

import as.com.ciclo4.reto3.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Juan Carlos Rodríguez
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    
   //aqui defino consultas adicionales que no estan predeterminadas en la Interfaz "MongoRepository"
    public Optional<User> findByEmail(String email);

    public Optional<User> findByEmailAndPassword(String email, String password);

}
