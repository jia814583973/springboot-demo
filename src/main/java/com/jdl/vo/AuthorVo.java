package com.jdl.vo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "com.jdl")
@PropertySource(value = "classpath:/author.properties",encoding = "UTF-8")
public class AuthorVo {

    @Value("name")
    private String name;
    @Value("age")
    private String age;
    @Value("sex")
    private String sex;

}
