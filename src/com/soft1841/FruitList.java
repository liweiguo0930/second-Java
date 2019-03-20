package com.soft1841;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 实现Comparable接口的Student，放入List进行排序
 * @author 李伟国
 * 2019.3.20
 */
public class FruitList {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("橘子",6));
        list.add(new Fruit("苹果",5));
        list.add(new Fruit("梨子",8));
        list.add(new Fruit("香蕉",7));
        //调用collection的sort方法，会自动调用之前写的compareto方法进行排序
        Collections.sort(list);
        for (Fruit fruit : list){
            System.out.println("名字："+fruit.getName()+",价格："+fruit.getPrise());
        }
    }
}
