public class WelcomeEmp {
    public static void main(String[] args) {
        int wage_per_hour=20;
        int working_hour=8;
        int total_wage_hour=0;
        int partTime_hour=(working_hour/2);
            int isPresent = (int)(Math.random() * 3);
            switch (isPresent){
                case 0:
                    System.out.println("Total wages of employee is Absent " + total_wage_hour);
                    break;
                case 1:
                    total_wage_hour=working_hour*wage_per_hour;
                    System.out.println("Total wages of employee who work in full Time Hour is: " + total_wage_hour);
                    break;

                case 2:
                    total_wage_hour=partTime_hour*wage_per_hour;
                    System.out.println("Total wages of employee who work in part Time Hour: " + total_wage_hour);
                    break;
            }
    }
}
