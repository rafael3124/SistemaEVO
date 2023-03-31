package upgradeit.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
