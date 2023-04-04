package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upgradeit.rest.api.DAO.IAmbiente;
import upgradeit.rest.api.model.AmbientesModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/ambientes")
public class AmbienteController {

    @Autowired
    private IAmbiente dao;

    @GetMapping
    public List<AmbientesModel> listaAmbientes() {
        return (List<AmbientesModel>) dao.findAll();
    }

    @PostMapping
    public AmbientesModel criarAmbiente(@RequestBody AmbientesModel ambiente) {
        AmbientesModel ambienteNovo = dao.save(ambiente);
        return ambienteNovo;
    }

    @PutMapping
    public AmbientesModel editarAmbiente(@RequestBody AmbientesModel ambiente) {
        AmbientesModel ambienteNovo = dao.save(ambiente);
        return ambienteNovo;
    }

    @DeleteMapping("/{id}")
    public Optional<AmbientesModel> excluirAmbiente(@PathVariable Integer id_AMBIENTE) {
        Optional<AmbientesModel> ambiente = dao.findById(id_AMBIENTE);
        dao.deleteById(id_AMBIENTE);
        return ambiente;
    }


}
