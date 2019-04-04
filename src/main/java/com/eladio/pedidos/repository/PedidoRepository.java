package com.eladio.pedidos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eladio.pedidos.model.Pedido;


/**
 * PedidoRepository
 */
@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
    
}