package org.lee.dubbo.spi.impl;

import java.util.List;

import org.lee.dubbo.spi.Search;

/**
 * @author wb-lqp383186
 * @title: DatabaseSearch
 * @projectName dubbo
 * @description: DatabaseSearch
 * @date 2019/9/1016:34
 */
public class DatabaseSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据库搜索"+keyword);
        return null;
    }
}
