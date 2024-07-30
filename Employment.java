public class Employment {
    String name;
    String jobTitle;
    double salary;
    private static double tax=0.1;
    public Employment(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary=salary;
    }
    public  double salanehSalary(){
        return salary*12;
    }

    public double hoghogheKhales(){
        double  khales= (salanehSalary()- salanehSalary()*tax);


        return khales;
    }
    public void printhoghogheKhales(){
        System.out.println(hoghogheKhales());
    }

}
