package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upgradeit.rest.api.DAO.IContatoEmpresa;
import upgradeit.rest.api.model.ContatosEmpresasModel;
import upgradeit.rest.api.model.ContatosPessoasModel;
import upgradeit.rest.api.model.EmpresaModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contatosEmpresas")
public class ContatoEmpresaController {
    @Autowired
    private IContatoEmpresa dao;

    @GetMapping
    public List<ContatosEmpresasModel> listaContatosEmpresas(){return (List<ContatosEmpresasModel>) dao.findAll();}

    @PostMapping
    public ContatosEmpresasModel criarContatoEmpresa(@RequestBody ContatosEmpresasModel contatoEmpresa){
        ContatosEmpresasModel contatoEmpresaNovo = dao.save(contatoEmpresa);
        return contatoEmpresaNovo;
    }
    @PutMapping
    public ContatosEmpresasModel editarContatoEmpresa(@RequestBody ContatosEmpresasModel contatoEmpresa){
        ContatosEmpresasModel contatoEmpresaNovo = dao.save(contatoEmpresa);
        return contatoEmpresaNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<ContatosEmpresasModel> excluirContatoEmpresa(@PathVariable Integer id_CONTATO_EM){
        Optional<ContatosEmpresasModel> contatoEmpresa = dao.findById(id_CONTATO_EM);
        dao.deleteById(id_CONTATO_EM);
        return  contatoEmpresa;

    }
}
