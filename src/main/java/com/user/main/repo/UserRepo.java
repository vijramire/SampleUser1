package com.user.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.main.pojo.UserPojo;

@Repository
public interface UserRepo extends JpaRepository<UserPojo, Integer> {

}
