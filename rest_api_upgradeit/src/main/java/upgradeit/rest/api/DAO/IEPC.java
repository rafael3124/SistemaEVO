package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;

import upgradeit.rest.api.model.EPCModel;

public interface IEPC  extends CrudRepository<EPCModel, Integer> {
}
