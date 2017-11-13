package cn.codeyang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.codeyang.pojo.Role;

@Mapper
public interface RoleDao {
    int insert(@Param("role") Role role);

    int insertSelective(@Param("role") Role role);

    int insertList(@Param("roles") List<Role> roles);

    int update(@Param("role") Role role);

    List<Role> findByUser(Long userId);
}
