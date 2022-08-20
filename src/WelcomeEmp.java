public class WelcomeEmp {
    public static void main(String[] args) {
        int wage_per_hour=20;
        int working_hour=8;
        int total_wage_hour=0;
            int isPresent = (int)(Math.random() * 2);
            if (isPresent == 1){
                total_wage_hour=working_hour*wage_per_hour;
                System.out.println("Total wages of employee is: " + total_wage_hour);
            }
            else{
                System.out.println("Total wages of employee is: " + total_wage_hour);
            }

    }
}
