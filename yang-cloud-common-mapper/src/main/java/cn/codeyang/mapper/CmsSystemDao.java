package cn.codeyang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import cn.codeyang.pojo.CmsSystem;

@Mapper
public interface CmsSystemDao {
    int insert(@Param("cmsSystem") CmsSystem cmsSystem);

    int insertSelective(@Param("cmsSystem") CmsSystem cmsSystem);

    int insertList(@Param("cmsSystems") List<CmsSystem> cmsSystems);

    int update(@Param("cmsSystem") CmsSystem cmsSystem);

    List<CmsSystem> findAll();
}
