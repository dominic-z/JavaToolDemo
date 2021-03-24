package generic.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dominiczhu
 * @version 1.0
 * @title ListDemo
 * @date 2021/3/24 下午7:49
 */
public class ListDemo {
    @Test
    public void rawListError(){
        List rawList=new ArrayList<>();
        rawList.add("a");

        List<Long> longList=rawList;

        longList.forEach(System.out::println);
    }
}
