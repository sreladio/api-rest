package com.eladio.pedidos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.eladio.pedidos.model.Catalogo;
import com.eladio.pedidos.repository.CatalogoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CatalogoServiceImpl
 */
@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

    @Override
    public Optional<Catalogo> find(Long id) {
        return catalogoRepository.findById(id);
    }

    @Override
    public List<Catalogo> findAll() {
        Iterable<Catalogo> iterable = catalogoRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                        .collect(Collectors.toList());
    }

    
}