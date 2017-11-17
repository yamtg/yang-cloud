package cn.codeyang.cms.controller;

import cn.codeyang.cms.service.CmsSystemService;
import cn.codeyang.mapper.CmsSystemDao;
import cn.codeyang.pojo.CmsSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/14
 */
@RestController
public class CmsSystemController implements CmsSystemService{

    @Autowired
    private CmsSystemDao cmsSystemDao;

    public List<CmsSystem> findAll() {
        return cmsSystemDao.findAll();
    }

    @Override
    public String test() {
        return "String";
    }
}
