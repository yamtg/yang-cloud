package cn.codeyang.oauth2.component;

import cn.codeyang.mapper.AuthorityDao;
import cn.codeyang.mapper.UserDao;
import cn.codeyang.oauth2.service.RoleService;
import cn.codeyang.pojo.Authority;
import cn.codeyang.pojo.Role;
import cn.codeyang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/12
 */
@Component
public class JdbcUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AuthorityDao authorityDao;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);

        List<Authority> authorities = authorityDao.findByUser(user.getId());
        List<Role> roles = roleService.findByUser(user.getId());

        user.setRoles(roles);
        user.setAuthorities(authorities);

        if (user==null)
            throw new UsernameNotFoundException("Username " + username + " not found");
        return user;
    }
}
