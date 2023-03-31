package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.CargoModel;


public interface ICargo extends CrudRepository<CargoModel, Integer> {
}

