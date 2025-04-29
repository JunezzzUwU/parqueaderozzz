package com.paola.parqueaderozzz.service;

import com.paola.parqueaderozzz.model.Ubicacion;
import com.paola.parqueaderozzz.repository.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UbicacionService {

    @Autowired
    private UbicacionRepository ubicacionRepository;

    public List<Ubicacion> getAllUbicaciones() {
        return ubicacionRepository.findAll();
    }

    public Optional<Ubicacion> getUbicacionById(Long id) {
        return ubicacionRepository.findById(id);
    }

    public Ubicacion saveOrUpdateUbicacion(Ubicacion ubicacion) {
        return ubicacionRepository.save(ubicacion);
    }

    public void deleteUbicacion(Long id) {
        ubicacionRepository.deleteById(id);
    }
}
