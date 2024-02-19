package com.example.advanced.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.advanced.model.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  Optional<UserEntity> findByUserName(String userName);

    // 특별한 쿼리 메서드나 커스텀 쿼리 메서드가 필요한 경우 추가할 수 있습니다.
}
