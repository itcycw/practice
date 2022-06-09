package com.awei.test.gupao.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cw
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private String sex;

    private String phone ;

    private String email ;
}
