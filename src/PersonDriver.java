import java.util.Scanner;

public class PersonDriver {
        //Driver for person class
    //instance variable
    public static void main(String [] args) {
        person ovidio = new person();
        System.out.println(ovidio.toString());

        person joe = new person("joe",24);
            //age and name comparison
        if(ovidio.getName().equals(joe.getName())&& ovidio.getAge()==joe.getAge()){
            System.out.println("Two persons name and age are equal!");
        }else {
            System.out.println("Two persons name and age are not equal");
        }
                //age comparison
        if(ovidio.getName().equals(joe.getName())){
            System.out.println("Two persons names are the same!");
        }else {
            System.out.println("Two persons names are not the same");
        }
                //older comparison
        if(ovidio.getAge()<=joe.getAge()){
            System.out.println("Joe is older");
        }else {
            System.out.println("ovidio is older");
    }               //younger comparison
        if(ovidio.getAge()>=joe.getAge()){
            System.out.println("Joe is Younger");
        }else {
            System.out.println("ovidio is Younger");
        }}

}
