package com.adaivskenan.cloud.repository;

import com.adaivskenan.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by adaivskenan on 18/01/2019.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
