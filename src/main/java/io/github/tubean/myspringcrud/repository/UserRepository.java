package io.github.tubean.myspringcrud.repository;

import io.github.tubean.myspringcrud.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
}
