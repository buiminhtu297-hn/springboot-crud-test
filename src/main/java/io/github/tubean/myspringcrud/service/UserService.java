package io.github.tubean.myspringcrud.service;

import io.github.tubean.myspringcrud.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
  List<UserEntity> getAllUser();

  void saveUser(UserEntity user);

  void deleteUser(Long id);

  Optional<UserEntity> findUserById(Long id);
}
