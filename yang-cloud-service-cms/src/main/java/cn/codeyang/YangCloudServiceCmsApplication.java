package cn.codeyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.codeyang.mapper")
@EnableResourceServer
public class YangCloudServiceCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(YangCloudServiceCmsApplication.class, args);
	}
}
