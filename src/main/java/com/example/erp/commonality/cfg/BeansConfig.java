package com.example.erp.commonality.cfg;

 

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

 

@Configuration
@MapperScan(basePackages = { "com.example.erp.*.dao" })
public class BeansConfig {
	


}
