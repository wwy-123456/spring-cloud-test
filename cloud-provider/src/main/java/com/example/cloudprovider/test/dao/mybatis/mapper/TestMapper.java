package com.example.cloudprovider.test.dao.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cloudprovider.test.model.Test;

import java.util.List;

public interface TestMapper extends BaseMapper<Test> {
    /**
     * 查询所有
     *
     * @return
     * @throws Exception
     */
    public List<Test> queryAll() throws Exception;
}
