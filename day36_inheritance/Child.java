package day36_inheritance;

public class Child extends Parent{

    Child(){
        System.out.println("Child cons. çalıştı");


    }

    // tum class'larda biz görmesek bile
    // Java' nın oluşturduğu default constructor vardir.

    //Tum CONSTRUCTOR

    public static void main(String[] args) {
        Child child = new Child();
    }
}
