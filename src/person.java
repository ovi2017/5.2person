//Author: Ovidio Castillo
//Purpose: To add Attributes to a person and compare to another using methods
//Date: 11/16/2017
//License: GNU

public class person {
        private String name;
        private int age;

        //constructor
    public person () {
        name = "ovidio";
        age = 25;
    }
    public person(String name, int age ) {
       this.name = name;
    }
    //getters
    public String getName(){
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge(){

        return age;
    }
    public void setAge(int age) {

        this.age = age;
    }
    public String toString() {
        return this.name + " " + this.age;
    }
}