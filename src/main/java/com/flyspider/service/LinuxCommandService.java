package com.flyspider.service;

import com.flyspider.pojo.LinuxCommand;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface LinuxCommandService {
    List<LinuxCommand> queryList(int pageNum, int pageSize);
    int insert(LinuxCommand record);
}
