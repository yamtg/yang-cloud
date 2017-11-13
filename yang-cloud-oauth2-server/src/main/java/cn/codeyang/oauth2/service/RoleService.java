package cn.codeyang.oauth2.service;

import java.util.List;
import cn.codeyang.pojo.Role;
public interface RoleService{

    int insert(Role role);

    int insertSelective(Role role);

    int insertList(List<Role> roles);

    int update(Role role);

    List<Role> findByUser(Long userId);
}
