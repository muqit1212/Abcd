import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your job type : ");
        String job_Type=input.nextLine();
        Employee fulltimeEmployee = new FulltimeEmployee();
        fulltimeEmployee.getJobType();
        Employee parttimeEmployee = new ParttimeEmployee();
        parttimeEmployee.getJobType();
        Employee contractEmployee = new ContractEmployee();
        contractEmployee.getJobType();

    }
}
