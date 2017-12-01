package com.lito.websocket.demo.mapper;

/**
 * Bidirectional mapping interface
 * @author rapalisv
 *
 * @param <D> domain class
 * @param <E> entity class
 */
public interface BiMapping<D,E> {

  D mapToDomain(E entity);
  
  E mapToEntity(D domain);
}
