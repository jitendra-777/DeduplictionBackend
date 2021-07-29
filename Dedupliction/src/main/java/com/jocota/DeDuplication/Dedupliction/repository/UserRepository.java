package com.jocota.DeDuplication.Dedupliction.repository;

import com.jocota.DeDuplication.Dedupliction.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

    @Query("select u from UserDetails u where u.userName = ?1")
    public UserDetails findByUserName(String username);
}
