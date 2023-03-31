package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.ContatosEmpresasModel;

public interface IContatoEmpresa extends CrudRepository<ContatosEmpresasModel, Integer> {
}
