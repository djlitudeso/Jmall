package pers.jl.jmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyBatisConfig.java
 * @Description: MyBatis配置类
 * @author: JL Du
 * @date: 2022/2/26 13:01
 * @version: 1.0.0
 */
@Configuration
@MapperScan("pers.jl.jmall.mbg.mapper")
public class MyBatisConfig {
}
