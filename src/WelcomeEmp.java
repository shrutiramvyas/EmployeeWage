public class WelcomeEmp {
    public static void main(String[] args) {
                int wage_per_hour=20;
                int no_of_present=1;
                int total_day=20;
                int working_hour=8;
                int day=0;
                int total_wage_hour=0;
                int part_time=(working_hour/2);
                int no_of_days=1;
                while(day < total_day){
                    int isPresent = (int)(Math.random() * 3);
                    switch (isPresent) {
                        case 1:
                            no_of_present+= working_hour;
                            no_of_days+=1;
                        case 2:
                            no_of_present+=part_time;
                            no_of_days+=0.5;
                    }
                    day++;
            }
        total_wage_hour=no_of_present*wage_per_hour;
        System.out.println("Total wages of employee who is present " + no_of_days +" days out of 20 days is: " + total_wage_hour);
    }

}
