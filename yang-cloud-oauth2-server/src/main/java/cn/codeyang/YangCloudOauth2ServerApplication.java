package cn.codeyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YangCloudOauth2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YangCloudOauth2ServerApplication.class, args);
	}
}
