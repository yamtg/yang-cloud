package cn.codeyang.cms.service.hystrix;

import cn.codeyang.cms.service.CmsSystemService;
import cn.codeyang.pojo.CmsSystem;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/13
 */
public class CmsSystemServiceHystrix implements CmsSystemService {
    @Override
    public List<CmsSystem> findAll() {
        return null;
    }

    @Override
    public String test() {
        return null;
    }
}
