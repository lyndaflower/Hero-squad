public class squad {

    private String hName ;
    private String hAge;
    private String hSuperpower;
    private String hWeakness;
    private String hCause;

    public squad(String name, String age, String superpower, String weakness, String cause) {
        this.hName = name ;
        this.hAge = age;
        this.hSuperpower = superpower;
        this.hWeakness = weakness;
        this.hCause = cause;
    }
    public String gethName(){
        return hName;
    }
    public String gethAge(){
        return hAge;
    }

    public String gethSuperpower(){
        return hSuperpower;
    }

    public String gethWeakness(){
        return hWeakness;
    }

    public String gethCause(){
        return hCause;
    }

}
