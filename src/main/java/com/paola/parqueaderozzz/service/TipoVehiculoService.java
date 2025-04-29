package com.paola.parqueaderozzz.service;

import com.paola.parqueaderozzz.model.TipoVehiculo;
import com.paola.parqueaderozzz.repository.TipoVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoVehiculoService {

    private final TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    public TipoVehiculoService(TipoVehiculoRepository tipoVehiculoRepository) {
        this.tipoVehiculoRepository = tipoVehiculoRepository;
    }

    public List<TipoVehiculo> getAllTipoVehiculos() {
        return tipoVehiculoRepository.findAll();
    }

    public Optional<TipoVehiculo> getTipoVehiculoById(Long id) {
        return tipoVehiculoRepository.findById(id);
    }

    public TipoVehiculo saveOrUpdateTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return tipoVehiculoRepository.save(tipoVehiculo);
    }

    public void deleteTipoVehiculo(Long id) {
        tipoVehiculoRepository.deleteById(id);
    }
}
