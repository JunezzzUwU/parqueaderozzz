package com.paola.parqueaderozzz.repository;

import com.paola.parqueaderozzz.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario.
}
