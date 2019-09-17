package model;

public class Squad {

    private String hName ;
    private String hAge;
    private String hStrength;
    private String hWeakness;
    private String hCause;

    public Squad(String name, String age, String strength, String weakness, String cause) {
        this.hName = name ;
        this.hAge = age;
        this.hStrength = strength;
        this.hWeakness = weakness;
    }
    public String gethName(){
        return hName;
    }
    public String gethAge(){
        return hAge;
    }

    public String gethStrength(){
        return hStrength;
    }

    public String gethWeakness(){
        return hWeakness;
    }


}

