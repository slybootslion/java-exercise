package com.slybootslion.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//
//    @Value("${jdbc.url}")
//    String url;
//
//    @Value("${jdbc.username}")
//    String username;
//
//    @Value("${jdbc.password}")
//    String password;
//
//    @Bean
//    public DruidDataSource dataSource() {
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName(driverClassName);
//        ds.setUrl(url);
//        ds.setUsername(username);
//        ds.setPassword(password);
//        return ds;
//    }
/*
    @Bean
    public DruidDataSource dataSource(JdbcProperties jdbcProperties) {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(jdbcProperties.getDriverClassName());
        ds.setUrl(jdbcProperties.getUrl());
        ds.setUsername(jdbcProperties.getUsername());
        ds.setPassword(jdbcProperties.getPassword());
        return ds;
    }
*/

//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DruidDataSource dataSource() {
//        return new DruidDataSource();
//    }

}
