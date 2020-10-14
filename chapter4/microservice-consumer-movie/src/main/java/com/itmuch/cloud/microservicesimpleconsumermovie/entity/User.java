package com.itmuch.cloud.microservicesimpleconsumermovie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author:crelle
 * @className:User
 * @version:1.0.0
 * @date:2020/10/12
 * @description:XX
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
