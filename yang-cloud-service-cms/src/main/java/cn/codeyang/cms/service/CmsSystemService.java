package cn.codeyang.cms.service;

import cn.codeyang.cms.entity.CmsSystem;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/8
 */
public interface CmsSystemService {
    List<CmsSystem> findAll();
}
