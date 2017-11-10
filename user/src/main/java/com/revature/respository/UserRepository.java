package com.revature.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.User;

@Repository("userRepository")
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
}
