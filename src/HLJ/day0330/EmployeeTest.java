package HLJ.day0330;

public class EmployeeTest {
    static class Person{
        String name ="NO name";
        Person(){}
        public Person(String nm) {
            name = nm;
        }
    }

    static class Employee extends Person{
        String id="0000";
        public Employee(String idv){
            id=idv;
        }
    }

    public static void main(String[] args) {
        Employee employee=new Employee("4321");
        System.out.println(employee.id);
    }

}
