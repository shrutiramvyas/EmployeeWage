public class WelcomeEmp {
    public static void main(String[] args) {
        System.out.println("Welcome Employee Wage");
        int fullTime =1;
        int empcheck= (int)(Math.random()*2);
        if ( empcheck == fullTime )
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
