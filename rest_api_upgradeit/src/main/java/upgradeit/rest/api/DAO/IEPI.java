package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.CargoModel;
import upgradeit.rest.api.model.EPIModel;

public interface IEPI  extends CrudRepository<EPIModel, Integer> {
}
