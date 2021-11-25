package com.hzw.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author Godliness
 * @date 2021/10/11 20:31
 * @Description
 */
@Configuration//标志该类是Spring的核心配置类
//<context:component-scan base-package="com.hzw"></context:component-scan>
@ComponentScan("com.hzw")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {
}
