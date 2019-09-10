package org.lee.dubbo.spi;

import java.util.List;

/**
 * @author wb-lqp383186
 * @title: Search
 * @projectName dubbo
 * @description: Search
 * @date 2019/9/1016:31
 */
public interface Search {

    List<String> searchDoc(String keyword);
}
