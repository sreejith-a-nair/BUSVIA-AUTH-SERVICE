package com.busvia.repository;

import com.busvia.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo , UUID> {
//    Optional<UserInfo> findByFirstName(String username);
//@Query("SELECT u FROM UserInfo u WHERE u.first_name = :firstName")
//Optional<UserInfo> findByFirst_nameIgnoreCase (@Param("firstName") String firstName);
Optional<UserInfo> findByFirstName (String firstName);

    Optional<UserInfo> findByEmail(String email);


}
