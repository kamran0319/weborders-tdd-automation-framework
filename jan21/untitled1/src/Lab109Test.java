public class Lab109Test {
    public static void main(String[] args) {
        Lab109_Company company = new Lab109_Company("Wheel and Deal");
        System.out.println("The Company name is: "+ company.getName());

        company.setNumberOfEmployees(58);
        System.out.println("The number of employees at the company is: "+ company.getNumberOfEmployees());

        company.setRevenue(850000);
        System.out.println("The annual revenue of the compan is: "+ company.getRevenue());

        company.setExpenses(130000);
        System.out.println("The annual expenses of the compan is: "+ company.getExpenses());


        System.out.println("The Company size is: "+ company.getCompanySize());
        System.out.println("The annual revenue after annual expenses is: "+ company.getProfit());


    }

}