package com.paola.parqueaderozzz.repository;

import com.paola.parqueaderozzz.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    // Aquí puedes agregar métodos específicos de consulta si es necesario.
}
