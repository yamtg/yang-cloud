package cn.codeyang.oauth2.service.impl;

import cn.codeyang.mapper.RoleDao;
import cn.codeyang.oauth2.service.RoleService;
import cn.codeyang.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public int insert(Role role){
        return roleDao.insert(role);
    }

    @Override
    public int insertSelective(Role role){
        return roleDao.insertSelective(role);
    }

    @Override
    public int insertList(List<Role> roles){
        return roleDao.insertList(roles);
    }

    @Override
    public int update(Role role){
        return roleDao.update(role);
    }

    @Override
    public List<Role> findByUser(Long userId) {
        return roleDao.findByUser(userId);
    }
}
