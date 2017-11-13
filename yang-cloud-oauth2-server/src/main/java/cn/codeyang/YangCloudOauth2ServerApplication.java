package cn.codeyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "cn.codeyang.mapper")
public class YangCloudOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YangCloudOauth2ServerApplication.class, args);
	}
}
