package com.flyspider.service.impl;

import com.flyspider.dao.LinuxCommandDao;
import com.flyspider.pojo.LinuxCommand;
import com.flyspider.service.LinuxCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service(value = "linuxCommandService")
public class LinuxCommandServiceImpl implements LinuxCommandService {
    @Autowired
    private LinuxCommandDao linuxCommandDao;
    @Override
    public List<LinuxCommand> queryList(int pageNum, int pageSize) {
        return linuxCommandDao.selectList();
    }

    @Override
    public int insert(LinuxCommand record) {
        return linuxCommandDao.insert(record);
    }
}
