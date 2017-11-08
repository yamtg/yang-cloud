package cn.codeyang.cms.controller;

import cn.codeyang.cms.entity.CmsSystem;
import cn.codeyang.cms.service.CmsSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/8
 */
@RestController
@RequestMapping("/system")
public class CmsSystemController {


    @Autowired
    private CmsSystemService systemService;

    @GetMapping
    public List<CmsSystem> index(){
        return systemService.findAll();
    }
}
