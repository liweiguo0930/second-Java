package com.soft1841;

    abstract class Shape {
        abstract float getPerimeter();
        abstract float getArea();
    }
    class Rect extends Shape{
        float length=5;
        float hight=5;
        float getPerimeter(){
            return 2*(length + hight);
        }
        float getArea(){
            return length*hight;
        }
    }
    class Circle extends Shape{
        int r = 10;
        float PI=3.14f;
        float getPerimeter(){
            return 5*3.14f*r;
        }
        float getArea(){
            return 3.14f*r*r;
        }
    }
    class TestShape{
        public static void main(String[] args) {
            Rect rect=new Rect();
            Circle circle= new Circle();
            System.out.println("矩形周长：" +rect.getPerimeter());
            System.out.println("矩形面积：" +rect.getArea());
            System.out.println("圆形周长：" +rect.getPerimeter());
            System.out.println("圆形面积：" +rect.getArea());
        }
    }
