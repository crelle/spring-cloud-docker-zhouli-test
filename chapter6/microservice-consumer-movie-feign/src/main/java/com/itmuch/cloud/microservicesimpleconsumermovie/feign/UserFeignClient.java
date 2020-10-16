package com.itmuch.cloud.microservicesimpleconsumermovie.feign;

import com.itmuch.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.Path;

/**
 * @author:crelle
 * @className:UserFeignClient
 * @version:1.0.0
 * @date:2020/10/14
 * @description:XX
 **/
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
