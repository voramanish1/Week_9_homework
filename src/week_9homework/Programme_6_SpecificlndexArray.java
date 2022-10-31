package week_9homework;
import java.util.ArrayList;
public class Programme_6_SpecificlndexArray {
    /**
     * Write a Java program to retrieve an element (at a specified index) from a given
     * array lis
     */
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("Manish");
        list.add("viral");
        list.add("nikhil");
        list.add("disha");
        list.add("vaibhavi");
        list.add("himesh");
        list.add("ajay");
        //getting value "nikhil" in consol
        System.out.println(list.get(2));
    }
}
