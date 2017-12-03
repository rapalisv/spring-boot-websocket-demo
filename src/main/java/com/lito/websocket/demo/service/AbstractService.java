package com.lito.websocket.demo.service;

import java.util.List;
import java.util.Optional;

/**
 * Abstract service class
 * 
 * @author rapalisv
 *
 */
public abstract class AbstractService<D, ID> {

  /**
   * Save entity
   * 
   * @param entity
   * @return persisted entity
   */
  public abstract D save(D entity);

  /**
   * Retrieves an entity by its id.
   * 
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   */
  public abstract Optional<D> findOne(ID entityId);

  /**
   * Returns all instances of the type with the given IDs.
   * 
   * @param ids
   * @return founded entities as stream
   */
  public abstract List<D> findAll(Iterable<ID> ids);

  /**
   * Returns all instances of the type.
   * 
   * @return all entities
   */
  public abstract List<D> findAll();

  /**
   * Deletes the entity with the given id.
   * 
   * @param id must not be {@literal null}.
   */
  public abstract void delete(ID entityId);
}
