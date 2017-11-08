package cn.codeyang.cms.service.impl;

import cn.codeyang.cms.entity.CmsSystem;
import cn.codeyang.cms.repository.CmsSystemRepository;
import cn.codeyang.cms.service.CmsSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/8
 */
@Service
public class CmsSystemServiceImpl implements CmsSystemService {
    @Autowired
    private CmsSystemRepository systemRepository;

    public List<CmsSystem> findAll(){
        return systemRepository.findAll();
    }
}
