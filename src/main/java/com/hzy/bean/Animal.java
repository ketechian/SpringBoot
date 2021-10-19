package com.hzy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2021/10/17 15:54
 */

@Component
@ConfigurationProperties(prefix = "animal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private String name;
    private int age;
}
