package com.eladio.pedidos.service;

import java.util.List;
import java.util.Optional;

import com.eladio.pedidos.model.Catalogo;

/**
 * CatalogoService
 */
public interface CatalogoService {

    public Optional<Catalogo> find(Long id);
    public List<Catalogo> findAll();
}