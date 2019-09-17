package model;
import java.util.ArrayList;

public class Hero {
    private String name ;
    private int age;
    private String superpower;
    private String weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero (String name, int age, String superpower, String weakness) {
        this.name = name ;
        this.age = age;
        this.superpower = superpower;
        this.weakness = weakness;
    }
    public String getName(){ return name;}
    public  void setName(String name) {this.name = name;}

    public int getAge(){ return age; }
    public void setAge(int age) {this.age = age;}

    public String getSuperpower(){ return superpower; }
    public void setSuperpower(String superpower) {this.superpower = superpower;}

    public String getWeakness(){ return weakness; }
    public void setWeakness(String weakness) {this.weakness = weakness;}


    public static void setInstances(ArrayList<Hero>instances) {Hero.instances = instances;}
    public  int getId(){return id; }
    public void setId(int id ) {this.id = id;}
    public static ArrayList<Hero> getAll(){
        return instances;
    }

}
