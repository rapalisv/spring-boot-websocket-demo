package com.lito.websocket.demo.repository;

import java.io.Serializable;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * Base repository, can be used by all repositories
 * 
 * @author rapalisv
 *
 * @param <T> Entity type
 * @param <ID> Id type
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {

  /**
   * Save entity
   * 
   * @param entity
   * @return entity
   */
  T save(T entity);

  /**
   * Save enities
   * 
   * @param entities
   * @return {@link Stream} of persisted entities
   */
  Stream<T> save(Iterable<T> entities);

  /**
   * Retrieves an entity by its id.
   * 
   * @param id must not be {@literal null}.
   * @return the entity with the given id or {@literal null} if none found
   */
  Optional<T> findOne(ID id);


  /**
   * Returns all instances of the type with the given IDs.
   * 
   * @param ids
   * @return founded entities as stream
   */
  Stream<T> findAll(Iterable<ID> ids);
  
  /**
   * Returns all instances of the type.
   * 
   * @return all entities
   */
  Stream<T> findAll();

  /**
   * Deletes the entity with the given id.
   * 
   * @param id must not be {@literal null}.
   */
  void delete(ID id);
}
