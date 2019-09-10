package org.lee.dubbo.spi.impl;

import java.util.List;

import org.lee.dubbo.spi.Search;

/**
 * @author wb-lqp383186
 * @title: FileSearch
 * @projectName dubbo
 * @description: FileSearch
 * @date 2019/9/1016:33
 */
public class FileSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("文件搜索 "+keyword);
        return null;
    }
}
