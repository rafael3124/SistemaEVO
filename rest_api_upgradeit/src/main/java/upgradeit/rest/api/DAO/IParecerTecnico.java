package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.CargoModel;
import upgradeit.rest.api.model.ParecerTecnicoModel;

public interface IParecerTecnico  extends CrudRepository<ParecerTecnicoModel, Integer> {
}
