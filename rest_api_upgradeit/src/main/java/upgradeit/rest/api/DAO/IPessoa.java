package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;
import upgradeit.rest.api.model.PessoaModel;


public interface IPessoa extends CrudRepository<PessoaModel, Integer> {
}
