package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.AmbientesModel;

public interface IAmbiente extends CrudRepository<AmbientesModel, Integer> {
}
