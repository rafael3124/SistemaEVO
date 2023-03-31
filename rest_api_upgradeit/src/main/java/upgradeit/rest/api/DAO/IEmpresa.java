package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.EmpresaModel;
import upgradeit.rest.api.model.UsuarioModel;

public interface IEmpresa extends CrudRepository<EmpresaModel, Integer> {
}
