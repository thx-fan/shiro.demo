package com.sojson.common.dao;

import java.util.List;

import com.sojson.common.model.Log;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {

    int deleteByPrimaryKey(String id);

    int insert(Log record);

    int insertSelective(Log record);


    Log selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKeyWithBLOBs(Log record);

    int updateByPrimaryKey(Log record);
}