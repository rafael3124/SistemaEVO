package upgradeit.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upgradeit.rest.api.DAO.ICargo;
import upgradeit.rest.api.model.CargoModel;
import upgradeit.rest.api.model.EmpresaModel;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    private ICargo dao;

    @GetMapping
    public List<CargoModel> listaCargos() {return (List<CargoModel>) dao.findAll();}

    @PostMapping
    public CargoModel criarCargo(@RequestBody CargoModel cargo){
        CargoModel cargoNovo = dao.save(cargo);
        return cargoNovo;
    }

    @PutMapping
    public CargoModel editarCargo(@RequestBody CargoModel cargo){
        CargoModel cargoNovo = dao.save(cargo);
        return cargoNovo;
    }
    @DeleteMapping("/{id}")
    public Optional<CargoModel> excluirCargo(@PathVariable Integer id_CARGO){
        Optional<CargoModel> cargo = dao.findById(id_CARGO);
        dao.deleteById(id_CARGO);
        return cargo;
    }


}
