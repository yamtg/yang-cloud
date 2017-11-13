package cn.codeyang.oauth2.service;

import cn.codeyang.pojo.Authority;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yangzhongyang on 17/11/12
 */
public interface AuthorityService {
    int insert(Authority authority);

    int insertSelective(Authority authority);

    int insertList(List<Authority> authoritys);

    int update(Authority authority);

    /**
     * 根据用户ID查找该用户拥有的所有权限
     * @param userId
     * @return
     */
    List<Authority> findByUser(Long userId);
}
