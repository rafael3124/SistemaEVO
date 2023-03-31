package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.EnderecosPessoasModel;

public interface IEnderecoPessoa extends CrudRepository<EnderecosPessoasModel, Integer> {
}
