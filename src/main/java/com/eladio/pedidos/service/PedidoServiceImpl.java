package com.eladio.pedidos.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.eladio.pedidos.model.Articulo;
import com.eladio.pedidos.model.Pedido;
import com.eladio.pedidos.repository.ArticuloRepository;
import com.eladio.pedidos.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PedidoServiceImpl
 */
@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public Optional<Pedido> find(Long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public List<Pedido> findAll() {
        Iterable<Pedido> iterable = pedidoRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                        .collect(Collectors.toList());
    }

    @Override
    public Pedido create(List<Long> articulosId) {
        Iterable<Articulo> iterable = articuloRepository.findAllById(articulosId);
        List<Articulo> articulos = StreamSupport.stream(iterable.spliterator(), false)
                        .collect(Collectors.toList());

        Pedido pedido = new Pedido();
        pedido.setArticulos(articulos);

        return pedidoRepository.save(pedido);
    }

    @Override
    public void delete(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        pedidoRepository.delete(pedido.get());
    }

    @Override
    public Pedido update(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    
}