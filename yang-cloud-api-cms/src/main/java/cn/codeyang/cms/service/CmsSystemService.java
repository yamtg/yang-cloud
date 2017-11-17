package cn.codeyang.cms.service;

import cn.codeyang.pojo.CmsSystem;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RequestMapping(value = "/system")
public interface CmsSystemService {

    @RequestMapping(value = "/findAll")
    List<CmsSystem> findAll();

    @RequestMapping(value = "/test")
    String test();
}
