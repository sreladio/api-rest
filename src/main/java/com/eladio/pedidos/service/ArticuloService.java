package com.eladio.pedidos.service;

import java.util.List;
import java.util.Optional;

import com.eladio.pedidos.model.Articulo;

/**
 * ArticuloService
 */
public interface ArticuloService {

    public Optional<Articulo> find(Long id);
    public List<Articulo> findAll();
    
}