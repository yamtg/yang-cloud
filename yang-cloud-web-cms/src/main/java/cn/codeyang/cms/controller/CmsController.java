package cn.codeyang.cms.controller;

import cn.codeyang.cms.service.CmsSystemClient;
import cn.codeyang.pojo.CmsSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RestController
@RequestMapping("/system")
public class CmsController {

    @Autowired
    private CmsSystemClient cmsSystemClient;
    @Autowired
    private OAuth2RestTemplate restTemplate;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<CmsSystem> index(){
        return cmsSystemClient.findAll();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        //String str = restTemplate.getForObject("http://localhost:3321/cms-service/system/test", String.class);
        //return str;
        return cmsSystemClient.test();
    }
}
