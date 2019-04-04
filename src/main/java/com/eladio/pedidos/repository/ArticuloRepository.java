package com.eladio.pedidos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eladio.pedidos.model.Articulo;

/**
 * ArticuloRepository
 */
@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {

}