package cn.codeyang.cms.service;

import cn.codeyang.cms.config.feign.FeignClientConfiguration;
import cn.codeyang.cms.service.hystrix.CmsSystemServiceHystrix;
import feign.RequestInterceptor;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by yangzhongyang on 17/11/14
 */
@FeignClient(value = "yang-cloud-service-cms", configuration = FeignClientConfiguration.class)
public interface CmsSystemClient extends CmsSystemService {
}
