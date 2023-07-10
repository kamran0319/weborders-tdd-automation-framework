package CLASSTASK064;

public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public Manager(String name,double salary,int yearsOfservice,double bonus){
        super(name,salary,yearsOfservice);
        this.bonus=bonus;
    }
    public String toString() {
        return  super.toString() +" bonus=" + bonus ;
    }
    public double getPaid(){
        return getSalary()+getSalary()*bonus/100;
    }

}
