package com.paola.parqueaderozzz.repository;

import com.paola.parqueaderozzz.model.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
    // Aquí puedes agregar métodos específicos de consulta si es necesario.
}
