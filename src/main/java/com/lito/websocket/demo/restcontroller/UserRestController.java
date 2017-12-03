package com.lito.websocket.demo.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lito.websocket.demo.domain.ui.contract.User;
import com.lito.websocket.demo.service.UserService;

import lombok.AllArgsConstructor;

/**
 * Rest api for {@link User} resource
 * 
 * @author rapalisv
 *
 */
@RestController
@RequestMapping(path = ApiConstants.API_PREFIX + "/users")
@AllArgsConstructor
public class UserRestController {
  /*** Class dependencies ***/
  private UserService userService;

  /**
   * Find one ore all users. If the id will be present on the path, then one user will be returned.
   * 
   * @param id user id
   * @return {@link List} of {@link User} or one {@link User} if id will be presented on the path
   */
  @SuppressWarnings("unchecked")
  @GetMapping(path = {"","{id}"})
  public <T> ResponseEntity<T> findUsers(@PathVariable(required = false) Optional<Long> id) {
    if (id.isPresent()) {
      return (ResponseEntity<T>) userService.findOne(id.get())
          .map(ResponseEntity::ok)
          .orElse(ResponseEntity.notFound()
              .build());
    }
    return (ResponseEntity<T>) ResponseEntity.ok(userService.findAll());
  }

}
