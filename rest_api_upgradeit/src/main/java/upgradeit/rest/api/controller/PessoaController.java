package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upgradeit.rest.api.DAO.IPessoa;
import upgradeit.rest.api.model.PessoaModel;
import upgradeit.rest.api.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private IPessoa dao;
    @GetMapping
    public List<PessoaModel> listaPessoas() {return (List<PessoaModel>) dao.findAll()}
    @PostMapping
    public PessoaModel criarPessa (@RequestBody PessoaModel pessoa){
        PessoaModel pessoaNovo = dao.save(pessoa);
        return pessoaNovo;
    }
    @PutMapping
    public  PessoaModel editarPessoa(@RequestBody PessoaModel pessoa){
        PessoaModel pessoaNovo = dao.save(pessoa);
        return pessoaNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<PessoaModel> excluirPessoa(@PathVariable Integer id_PESSOA){
        Optional<PessoaModel> pessoa = dao.findById(id_PESSOA);
        dao.deleteById(id_PESSOA);
        return pessoa;
    }
 }
