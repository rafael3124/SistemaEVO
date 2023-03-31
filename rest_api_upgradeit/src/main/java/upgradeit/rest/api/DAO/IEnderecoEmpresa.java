package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;

import upgradeit.rest.api.model.EnderecosEmpresasModel;

public interface IEnderecoEmpresa  extends CrudRepository<EnderecosEmpresasModel, Integer> {
}
