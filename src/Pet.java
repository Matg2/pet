import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.Scanner;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

public Pet(String name, String location, int age, String type){
    this.name=name;
    this.age=age;
    this.type=type;
    this.location=location;

}

    public Pet(String name, int age, String type){
    this.name=name;
    this.age=age;
    this.type=type;

    }


public Pet(){

}

public String getName(){
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String gettype(){
    return type;
    }

    public  void setType(String type){
    this.type=type;
    }

    public boolean isanAnimal() {
        return true;
    }


    public String Walk() {
        return "Let's go for a walk!";
    }

    public String animal_Breeds(String Breed_list) {
        //there is now a variable called Breed_list, that exists in this code
        return Breed_list;
    }

    public class AteMyKeys{

    }
    public static void main(String[] args) {
            Pet pet = new Pet("Chris", "7201 Bullard", 14, "German Shepard");
           System.out.println(pet.gettype());
        System.out.println(pet.getLocation());
        System.out.println(pet.getName());
        System.out.println(pet.gettype());
        System.out.println(pet.Walk());
        System.out.println(pet.isanAnimal());
            System.out.println(pet.animal_Breeds("dog breeds"));
            //String list = "pizza";

    }



}
