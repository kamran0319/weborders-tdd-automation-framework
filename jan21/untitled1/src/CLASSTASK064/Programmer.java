package CLASSTASK064;

public class Programmer extends Employee {
    private String language;

    public Programmer(String name, double salary, int yearsOfservice,String language) {
        super(name, salary, yearsOfservice);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String toString() {
        return  super.toString() +" language= " + language ;
    }
    public double getPaid(){
        if(language.equals("Java")){
            return getSalary()+30000;
        }else if(language.equals("Python")){
            return getSalary()+40000;
        }else if(language.equals("Scala")){
            return getSalary()+50000;
        }else{
            return 25000;
        }
    }
}
