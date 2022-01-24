package config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chanwcy
 * @Date 2022-01-23 11:59
 * @Version1.8
 */
@Configuration
@MapperScan("mapper")
public class UserConfig {
}
