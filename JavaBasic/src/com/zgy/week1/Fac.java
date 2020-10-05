package com.zgy.week1;

public class Fac {
    public static void main(String args [] ) {
            System.out.println("这是一个简单的Java应用程序");
            Student stu=new Student();
            stu.speak("We are students");
        }
    }
    class Student{
    public void speak(String s) {
        System.out.println(s);
    }
}
