package com.flyspider.controller;

import com.flyspider.pojo.LinuxCommand;
import com.flyspider.service.LinuxCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/linux_command")
public class LinuxCommandController {
    @Autowired
    private LinuxCommandService linuxCommandService;


    @RequestMapping(value = "/",method= RequestMethod.GET)
    public List<LinuxCommand> queryList(){
        List<LinuxCommand> resultList= linuxCommandService.queryList(0,0);
        return resultList;
    }
}
