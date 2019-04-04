package com.eladio.pedidos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eladio.pedidos.model.Catalogo;


/**
 * CatalogoRepository
 */
@Repository
public interface CatalogoRepository extends CrudRepository<Catalogo, Long> {

}