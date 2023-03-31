package upgradeit.rest.api.DAO;

import org.springframework.data.repository.CrudRepository;

import upgradeit.rest.api.model.InformacoesComplementaresModel;

public interface IInformacaoComplementar  extends CrudRepository<InformacoesComplementaresModel, Integer> {
}
