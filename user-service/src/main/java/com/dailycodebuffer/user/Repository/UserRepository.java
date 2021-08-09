package com.dailycodebuffer.user.Repository;

import com.dailycodebuffer.user.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserId(Long userId);
}
