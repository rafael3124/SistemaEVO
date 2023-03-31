package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;

import upgradeit.rest.api.model.UsuarioModel;

public interface IUsuario extends CrudRepository<UsuarioModel, Integer>{
}
