package org.lee.dubbo.spi;

import java.util.Iterator;
import java.util.ServiceLoader;


/**
 * @author wb-lqp383186
 * @title: TestSpi
 * @projectName dubbo
 * @description: TestSpi
 * @date 2019/9/1016:35
 */
public class TestSpi {

    public static void main(String[] args) {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        while (iterator.hasNext()) {
            Search search =  iterator.next();
            search.searchDoc("hello world");
        }
    }
}
