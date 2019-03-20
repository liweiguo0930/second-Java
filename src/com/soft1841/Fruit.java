package com.soft1841;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private Integer prise;

    public Fruit(String name,Integer prise){
        this.name=name;
        this.prise=prise;
    }
    public Fruit(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Integer getPrise(){
        return prise;
    }
    public void setPrise(Integer prise){
        this.prise= prise;
    }


    @Override
    public int compareTo(Fruit fruit) {
        //按价格排序
        return this.getPrise()-fruit.getPrise();
    }
}
