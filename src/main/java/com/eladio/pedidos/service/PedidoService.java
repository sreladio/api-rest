package com.eladio.pedidos.service;

import java.util.List;
import java.util.Optional;

import com.eladio.pedidos.model.Pedido;

/**
 * PedidoService
 */
public interface PedidoService {

    public Optional<Pedido> find(Long id);
    public List<Pedido> findAll();
    public Pedido create(List<Long> articulosId);
    public void delete(Long id);
    public Pedido update(Pedido pedido);
}