package com.eladio.pedidos.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.eladio.pedidos.model.Articulo;
import com.eladio.pedidos.service.ArticuloService;

/**
 * ArticuloRest
 */
@RestController
@RequestMapping("/articulo")
public class ArticuloRest {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public List<Articulo> getArticulos() {
        return articuloService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Articulo> getArticulo(@PathVariable("id") Long id) {
        return articuloService.find(id);
    }

}