package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.ContatosPessoasModel;

public interface IContatoPessoa extends CrudRepository<ContatosPessoasModel, Integer> {
}
