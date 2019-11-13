package com.yiyang.dao;

import com.yiyang.entity.Outgoing;
import com.yiyang.entity.OutgoingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OutgoingMapper {
    long countByExample(OutgoingExample example);

    int deleteByExample(OutgoingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Outgoing record);

    int insertSelective(Outgoing record);

    List<Outgoing> selectByExample(OutgoingExample example);

    Outgoing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Outgoing record, @Param("example") OutgoingExample example);

    int updateByExample(@Param("record") Outgoing record, @Param("example") OutgoingExample example);

    int updateByPrimaryKeySelective(Outgoing record);

    int updateByPrimaryKey(Outgoing record);
}