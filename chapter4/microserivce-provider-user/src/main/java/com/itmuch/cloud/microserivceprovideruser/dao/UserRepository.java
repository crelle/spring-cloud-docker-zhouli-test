package com.itmuch.cloud.microserivceprovideruser.dao;

import com.itmuch.cloud.microserivceprovideruser.entity.User;
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
