public class Lab109_Company {
    private String name;
    private int numberOfEmployees;
    private int revenue;
    private int expenses;

    public Lab109_Company(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }
    public String getCompanySize(){

        if(numberOfEmployees<50){
            return "small";
        }else if(numberOfEmployees>51 && numberOfEmployees<250){
            return "medium";
        }else {
            return "large";
        }
    }
    public int getProfit(){
        return revenue-expenses;
    }
}
