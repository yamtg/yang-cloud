package cn.codeyang.mapper;

import cn.codeyang.pojo.Authority;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorityDao {
    int insert(@Param("authority") Authority authority);

    int insertSelective(@Param("authority") Authority authority);

    int insertList(@Param("authoritys") List<Authority> authoritys);

    int update(@Param("authority") Authority authority);

    /**
     * 根据用户ID查找该用户拥有的所有权限
     * @param userId
     * @return
     */
    List<Authority> findByUser(@Param("userId") Long userId);
}
