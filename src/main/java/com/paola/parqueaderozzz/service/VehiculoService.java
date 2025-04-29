package com.paola.parqueaderozzz.service;

import com.paola.parqueaderozzz.model.Vehiculo;
import com.paola.parqueaderozzz.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    // Obtener todos los vehículos
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    // Obtener un vehículo por su ID
    public Optional<Vehiculo> getVehiculoById(Long id) {
        return vehiculoRepository.findById(id);
    }

    // Crear o actualizar un vehículo
    public Vehiculo saveOrUpdateVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    // Eliminar un vehículo
    public void deleteVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
