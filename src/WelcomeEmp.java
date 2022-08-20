public class WelcomeEmp {
    public static void main(String[] args) {
        int wage_per_hour=20;
        int no_of_present=1;
        int total_day=20;
        int working_hour=8;
        int day=0;
        int total_wage_hour=0;
        while(day < total_day){
            int isPresent = (int)(Math.random() * 2);
            if (isPresent == 1 )
                no_of_present+=1;
            day++;
        }
        int no_of_days=no_of_present*working_hour;
        total_wage_hour=no_of_days*wage_per_hour;
        System.out.println("Total wages of employee who is present " + no_of_present +" days out of 20 days is: " + total_wage_hour);

    }
}
