package com.paola.parqueaderozzz.controller;

import com.paola.parqueaderozzz.model.Ubicacion;
import com.paola.parqueaderozzz.service.UbicacionService;  // Asegúrate de importar el servicio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    // Obtener todas las ubicaciones
    @GetMapping
    public List<Ubicacion> getAllUbicaciones() {
        return ubicacionService.getAllUbicaciones();
    }

    // Obtener una ubicación por ID
    @GetMapping("/{id}")
    public Optional<Ubicacion> getUbicacionById(@PathVariable Long id) {
        return ubicacionService.getUbicacionById(id);
    }

    // Crear o actualizar una ubicación
    @PostMapping
    public Ubicacion createOrUpdateUbicacion(@RequestBody Ubicacion ubicacion) {
        return ubicacionService.saveOrUpdateUbicacion(ubicacion);
    }

    // Eliminar una ubicación
    @DeleteMapping("/{id}")
    public void deleteUbicacion(@PathVariable Long id) {
        ubicacionService.deleteUbicacion(id);
    }
}

