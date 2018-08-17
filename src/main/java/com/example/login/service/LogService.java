package com.example.login.service;

import com.example.login.mapper.LogMapper;
import com.example.login.pojo.Log;
import org.apache.logging.log4j.spi.LoggerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    private Logger logger = LoggerFactory.getLogger(LogService.class);

    private LogMapper logMapper;

    public List<Log> getAll() {
        return logMapper.selectAll();
    }
}
