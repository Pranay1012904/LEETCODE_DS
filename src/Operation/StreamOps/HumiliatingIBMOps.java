package Operation.StreamOps;

import Operation.Employee;
import Operation.StringOps.CoolStringProb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class HumiliatingIBMOps {

    static int fAge=0;
    static int mAge=0;

    public static void humiliatingStream(){
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female"));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male"));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male"));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male"));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female"));
        List<Employee>  fEmp= employeeList.stream().filter(emp-> emp.getGender().equals("Female")).toList();
        List<Employee>  mEmp= employeeList.stream().filter(emp-> emp.getGender().equals("Male")).toList();
        fEmp.forEach(fE->{
            fAge+=fE.getAge();

        });
        mEmp.forEach(mE->{
            mAge+=mE.getAge();
        });
        System.out.print("\nFEMALE AGE:"+(fAge/fEmp.size()));
        System.out.print("\nMALE AGE:"+(mAge/mEmp.size()));
        /*Integer fSum=0;
        List<Integer> fa=employeeList.stream().filter(employee -> employee.getGender()
        .equals("Female")) //Stream<Employee>
        .map(Employee::getAge).toList();
        int fTA = fa.stream().mapToInt(Integer :: intValue).sum();
        System.out.print("\nSUM:"+fTA/fa.size());*/
    }
}
