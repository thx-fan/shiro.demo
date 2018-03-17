package com.sojson.aop.log;

import com.sojson.common.model.Log;
import com.sojson.common.dao.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xufan on 2018/03/13.
 */
public class LogService {
    @Autowired
    LogMapper logMapper;
    public void add(Log log) {
        logMapper.insert(log);
    }
}
