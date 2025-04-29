package com.paola.parqueaderozzz.controller;

import com.paola.parqueaderozzz.model.Vehiculo;
import com.paola.parqueaderozzz.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.getAllVehiculos();
    }

    // Obtener un vehículo por ID
    @GetMapping("/{id}")
    public Optional<Vehiculo> getVehiculoById(@PathVariable Long id) {
        return vehiculoService.getVehiculoById(id);
    }

    // Crear o actualizar un vehículo
    @PostMapping
    public Vehiculo createOrUpdateVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.saveOrUpdateVehiculo(vehiculo);
    }

    // Eliminar un vehículo
    @DeleteMapping("/{id}")
    public void deleteVehiculo(@PathVariable Long id) {
        vehiculoService.deleteVehiculo(id);
    }
}
