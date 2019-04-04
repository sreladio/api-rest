package com.eladio.pedidos.rest;

import java.util.List;
import java.util.Optional;

import com.eladio.pedidos.model.Pedido;
import com.eladio.pedidos.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PedidoRest
 */
@RestController
@RequestMapping("/pedido")
public class PedidoRest {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido createPedido(@RequestBody List<Long> articulosId) {
        return pedidoService.create(articulosId);
    }

    @GetMapping
    public List<Pedido> getPedidos() {
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> getPedido(@PathVariable("id") Long id) {
        return pedidoService.find(id);
    }

    public void putPedido() {
        // Not implemented yet
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable("id") Long id) {
        pedidoService.delete(id);
    }
    
}