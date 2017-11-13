package cn.codeyang.oauth2.service.impl;

import cn.codeyang.mapper.AuthorityDao;
import cn.codeyang.oauth2.service.AuthorityService;
import cn.codeyang.pojo.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/12
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public int insert(Authority authority) {
        return authorityDao.insert(authority);
    }

    @Override
    public int insertSelective(Authority authority) {
        return authorityDao.insertSelective(authority);
    }

    @Override
    public int insertList(List<Authority> authoritys) {
        return authorityDao.insertList(authoritys);
    }

    @Override
    public int update(Authority authority) {
        return authorityDao.update(authority);
    }

    @Override
    public List<Authority> findByUser(Long userId) {
        return authorityDao.findByUser(userId);
    }
}
