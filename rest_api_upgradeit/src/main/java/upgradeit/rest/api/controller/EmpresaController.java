package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upgradeit.rest.api.DAO.IEmpresa;
import upgradeit.rest.api.model.EmpresaModel;
import upgradeit.rest.api.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/empresas")
public class EmpresaController {

    @Autowired
    private IEmpresa dao;

    @GetMapping
    public List<EmpresaModel> listaEmpresas(){
        return (List<EmpresaModel>) dao.findAll();
    }
    @PostMapping
    public EmpresaModel criarEmpresa (@RequestBody EmpresaModel empresa){
        EmpresaModel empresaNovo = dao.save(empresa);
        return empresaNovo;
    }
    @PutMapping
    public EmpresaModel editarEmpresa (@RequestBody EmpresaModel empresa){
        EmpresaModel empresaNovo = dao.save(empresa);
        return empresaNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<EmpresaModel> excluirEmpresa(@PathVariable Integer id_EMPRESA){
        Optional <EmpresaModel> empresa = dao.findById(id_EMPRESA);
        dao.deleteById(id_EMPRESA);
        return  empresa;
    }

}
