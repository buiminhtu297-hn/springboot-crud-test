package io.github.tubean.myspringcrud.service.impl;

import io.github.tubean.myspringcrud.entity.UserEntity;
import io.github.tubean.myspringcrud.repository.UserRepository;
import io.github.tubean.myspringcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
  @Autowired private UserRepository userRepository;

  @Override
  public List<UserEntity> getAllUser() {
    return (List<UserEntity>) userRepository.findAll();
  }

  @Override
  public void saveUser(UserEntity user) {
    userRepository.save(user);
  }

  @Override
  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public Optional<UserEntity> findUserById(Long id) {
    return userRepository.findById(id);
  }
}
