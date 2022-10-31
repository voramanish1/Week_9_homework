package week_9homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_Iterate {

    /**
     * . Write a Java program to iterate through all elements in an array list using
     * Iterator.*/

    public void method1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        //using iterator
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Programme_5_Iterate obj = new Programme_5_Iterate();
        obj.method1();
    }

}
