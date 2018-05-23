package com.flyspider.dao;

import com.flyspider.pojo.LinuxCommand;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

public interface LinuxCommandDao {
    List<LinuxCommand> selectList();

    int deleteByPrimaryKey(int id);

    int insert(LinuxCommand record);

    int insertSelective(LinuxCommand record);

    LinuxCommand selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(LinuxCommand record);

    int updateByPrimaryKey(LinuxCommand record);
}