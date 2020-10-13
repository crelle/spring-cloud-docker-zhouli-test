package com.itmuch.cloud.microservicesimpleprovideruser.dao;

import com.itmuch.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author:crelle
 * @className:UserRepository
 * @version:1.0.0
 * @date:2020/10/12
 * @description:XX
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
