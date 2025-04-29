package com.paola.parqueaderozzz.service;

import com.paola.parqueaderozzz.model.Usuario;
import com.paola.parqueaderozzz.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Obtener todos los usuarios
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    // Obtener un usuario por su ID
    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    // Crear o actualizar un usuario
    public Usuario saveOrUpdateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Eliminar un usuario
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
