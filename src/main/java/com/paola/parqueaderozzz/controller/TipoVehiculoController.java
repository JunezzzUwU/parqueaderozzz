package com.paola.parqueaderozzz.controller;

import com.paola.parqueaderozzz.model.TipoVehiculo;
import com.paola.parqueaderozzz.service.TipoVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipos-vehiculo")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoService tipoVehiculoService;

    // Obtener todos los tipos de vehículos
    @GetMapping
    public List<TipoVehiculo> getAllTiposVehiculo() {
        return tipoVehiculoService.getAllTipoVehiculos();
    }

    // Obtener un tipo de vehículo por ID
    @GetMapping("/{id}")
    public Optional<TipoVehiculo> getTipoVehiculoById(@PathVariable Long id) {
        return tipoVehiculoService.getTipoVehiculoById(id);
    }

    // Crear o actualizar un tipo de vehículo
    @PostMapping
    public TipoVehiculo createOrUpdateTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return tipoVehiculoService.saveOrUpdateTipoVehiculo(tipoVehiculo);
    }

    // Eliminar un tipo de vehículo
    @DeleteMapping("/{id}")
    public void deleteTipoVehiculo(@PathVariable Long id) {
        tipoVehiculoService.deleteTipoVehiculo(id);
    }
}
