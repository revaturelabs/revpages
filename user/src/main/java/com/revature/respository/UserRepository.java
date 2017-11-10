package com.revature.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.User;

@Repository("userRepository")
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findByEmail(String email);
}
