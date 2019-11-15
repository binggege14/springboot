package com.yiyang.dao;

import java.util.List;

import com.yiyang.entity.YyUser;
import com.yiyang.entity.YyUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface YyUserMapper {
    long countByExample(YyUserExample example);

    int deleteByExample(YyUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyUser record);

    int insertSelective(YyUser record);

    List<YyUser> selectByExample(YyUserExample example);

    YyUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyUser record, @Param("example") YyUserExample example);

    int updateByExample(@Param("record") YyUser record, @Param("example") YyUserExample example);

    int updateByPrimaryKeySelective(YyUser record);

    int updateByPrimaryKey(YyUser record);
}