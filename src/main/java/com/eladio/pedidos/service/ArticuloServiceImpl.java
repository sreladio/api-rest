package com.eladio.pedidos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.eladio.pedidos.model.Articulo;
import com.eladio.pedidos.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ArticuloServiceImpl
 */
@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;
    
    @Override
    public Optional<Articulo> find(Long id) {
        return articuloRepository.findById(id);
    }

    @Override
    public List<Articulo> findAll() {
        Iterable<Articulo> iterable = articuloRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                        .collect(Collectors.toList());
    }

}