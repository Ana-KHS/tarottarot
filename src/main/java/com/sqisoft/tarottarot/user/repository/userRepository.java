package com.sqisoft.tarottarot.user.repository;

import com.sqisoft.tarottarot.user.entity.userEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<userEntity, Long> {
    @Query(value = "SELECT * FROM user_info WHERE user_id = :userId AND user_password = :userPassword", nativeQuery = true)
    userEntity findUser(String userId, String userPassword);
}
