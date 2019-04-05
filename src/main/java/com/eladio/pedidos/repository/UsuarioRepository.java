package com.eladio.pedidos.repository;

import java.util.Optional;

import com.eladio.pedidos.model.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * UsuarioRepository
 */
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

    public Optional<Usuario> findByUsername(String username);
}