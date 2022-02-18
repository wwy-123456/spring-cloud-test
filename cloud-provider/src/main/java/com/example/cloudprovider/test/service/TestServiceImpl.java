package com.example.cloudprovider.test.service;

import com.example.cloudprovider.test.dao.mybatis.mapper.TestMapper;
import com.example.cloudprovider.test.model.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;


@Service
public class TestServiceImpl implements TestService {
    private static final Logger logger = LogManager.getLogger(TestServiceImpl.class);

    @Resource
    private TestMapper testMapper;

    @Override
    public String test() throws Exception {
        List<Test> tests = testMapper.selectList(null);
        return Arrays.toString(tests.toArray());
    }
}
