package cn.codeyang.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableOAuth2Client
public class YangCloudWebCmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(YangCloudWebCmsApplication.class, args);
	}
}
