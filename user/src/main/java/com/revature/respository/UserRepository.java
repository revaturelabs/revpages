package com.revature.respository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.User;

@Repository("userRepository")
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

}
