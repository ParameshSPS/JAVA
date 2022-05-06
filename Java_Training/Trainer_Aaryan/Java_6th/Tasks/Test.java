package Java_Training.Trainer_Aaryan.Java_6th.Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Employee_Info emp1 = new Employee_Info();
        Employee_Info emp2 = new Employee_Info();
        Employee_Info emp3 = new Employee_Info();
        Employee_Info emp4 = new Employee_Info();

        emp1.setEmpId(101);
        emp1.setEmpFullName("AAA");
        emp1.setSalary(10000);
        emp1.setGender(Gender.Male);

        emp2.setEmpId(102);
        emp2.setEmpFullName("BBB");
        emp2.setSalary(20000);
        emp2.setGender(Gender.Female);

        emp3.setEmpId(103);
        emp3.setEmpFullName("CCC");
        emp3.setSalary(30000);
        emp3.setGender(Gender.Male);

        emp4.setEmpId(104);
        emp4.setEmpFullName("DDD");
        emp4.setSalary(40000);
        emp4.setGender(Gender.Female);

        List<Employee_Info> empList = new ArrayList<>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        // With Stream Api

        // I want list of employee who is drawing more than 10000

        List<Employee_Info> list = empList.stream().filter(e -> e.getSalary() > 10000).collect(Collectors.toList());

        System.out.println(list);
        // [102-->BBB-->20000-->Female, 103-->CCC-->30000-->Male,
        // 104-->DDD-->40000-->Female]

        // I wanr list of salaries who is drawing more than 10000

        List<Long> salaryList = empList.stream().filter(e -> e.getSalary() > 10000).map(e -> e.getSalary())
                .collect(Collectors.toList());

        System.out.println(salaryList); // [20000, 30000, 40000]

        // Without Stream Api

        Iterator itr = empList.iterator();

        while (itr.hasNext()) {
            Employee_Info emp = (Employee_Info) itr.next();

            if (emp.getSalary() > 10000) {
                System.out.println(emp.getSalary());
            }
        }
    }
}