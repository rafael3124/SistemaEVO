package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upgradeit.rest.api.DAO.IUsuario;
import upgradeit.rest.api.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/operadores")
public class UsuarioController {
    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<UsuarioModel> listaUsuarios () {
        return (List<UsuarioModel>) dao.findAll();
    }

    @PostMapping
    public UsuarioModel criarUsuario (@RequestBody UsuarioModel usuario){
        UsuarioModel usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }
    @PutMapping
    public UsuarioModel editarUsuario (@RequestBody UsuarioModel usuario){
        UsuarioModel usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }
    @DeleteMapping ("/{id}")
    public Optional<UsuarioModel> excluirUsuario(@PathVariable Integer id_OPERADOR){
        Optional<UsuarioModel> usuario = dao.findById(id_OPERADOR);
        dao.deleteById(id_OPERADOR);
        return usuario;
    }

}
