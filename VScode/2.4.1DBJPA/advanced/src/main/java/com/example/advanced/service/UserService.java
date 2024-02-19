package com.example.advanced.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.advanced.model.dto.UserDto;
import com.example.advanced.model.entity.UserEntity;
import com.example.advanced.model.repository.UserRepository;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
      this.userRepository = userRepository;
  }

  // 사용자 저장 메서드
  public UserEntity saveUser(UserDto userDto) {
      UserEntity userEntity = new UserEntity();
      userEntity.setUserName(userDto.getUserName());
      userEntity.setUserAge(userDto.getUserAge());
      return userRepository.save(userEntity);
  }

  public Optional<UserEntity> findByUserName(String userName) {
    return userRepository.findByUserName(userName);
}

  public UserEntity updateUser(String userName, UserDto updatedUserDto) {
      Optional<UserEntity> optionalUserEntity = userRepository.findByUserName(userName);

      if (optionalUserEntity.isPresent()) {
          UserEntity userEntity = optionalUserEntity.get();
          userEntity.setUserName(updatedUserDto.getUserName());
          userEntity.setUserAge(updatedUserDto.getUserAge());
          return userRepository.save(userEntity);
      } else {
          // 사용자를 찾지 못한 경우 예외 처리 또는 다른 방법으로 처리
          throw new RuntimeException("User not found with username: " + userName);
      }
  }

  public void deleteUser(String userName) {
      Optional<UserEntity> optionalUserEntity = userRepository.findByUserName(userName);

      if (optionalUserEntity.isPresent()) {
          userRepository.delete(optionalUserEntity.get());
      } else {
          // 사용자를 찾지 못한 경우 예외 처리 또는 다른 방법으로 처리
          throw new RuntimeException("User not found with username: " + userName);
      }
  }

  


      // 사용자 조회 메서드 등 필요한 다양한 비즈니스 로직 구현
}
