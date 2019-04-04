package com.eladio.pedidos.rest;

import java.util.List;
import java.util.Optional;

import com.eladio.pedidos.model.Catalogo;
import com.eladio.pedidos.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CatalogoRest
 */
@RestController
@RequestMapping("/catalogo")
public class CatalogoRest {

    @Autowired
    private CatalogoService catalogoService;

    @GetMapping
    public List<Catalogo> getCatalogos() {
        return catalogoService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Catalogo> getCatalogo(@PathVariable("id") Long id) {
        return catalogoService.find(id);
    }

}