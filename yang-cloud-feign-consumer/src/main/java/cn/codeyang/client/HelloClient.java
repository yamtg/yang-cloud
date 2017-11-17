package cn.codeyang.client;

import cn.codeyang.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by yangzhongyang on 17/11/14
 */
@FeignClient("yang-cloud-feign-service")
public interface HelloClient extends HelloService {
}
