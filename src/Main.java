public class Main {

    public static void allStuff(Employee[] employees) {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void countMinSalary (Employee[] employees) {
        if(employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalary() > employee.getSalary())
                    emp = employee;
            }
            System.out.println("Min salary: " + emp.getSalary() + " " + emp.getStuff() + " " + emp.getId());
        } else {
            System.out.println("massive empty");
        }
    }
    public static void countMaxSalary(Employee[] employees) {
        if(employees.length > 0){
            Employee emp = employees[0];
            for (Employee employee :employees) {
                if (emp.getSalary() < employee.getSalary())
                    emp = employee;
            }
            System.out.println("Stuff with MaxSalary :" + emp.getSalary() + " " + emp.getStuff() + " " + emp.getId());
        } else {
            System.out.println("Massive empty");
        }
    }

    public static int countStuffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Amount per month :" + sum);
        return sum;
    }
    public static void averageSalary(Employee[] employees) {
        int sum = countStuffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Average salary: " + average);
    }
    public static void countAllStuff(Employee[] employees) {
        for ( Employee employee : employees) {
            System.out.println("ФИО сотрудинокв : " +employee.getStuff());
        }
    }
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("John Lenon 1", 1, 15000);
        employee[1] = new Employee("John Lenon 2", 2, 25000);
        employee[2] = new Employee("John Lenon 3", 3, 35000);
        employee[3] = new Employee("John Lenon 4", 4, 45000);
        employee[4] = new Employee("John Lenon 5", 5, 55000);
        employee[5] = new Employee("John Lenon 6", 1, 20000);
        employee[6] = new Employee("John Lenon 7", 2, 30000);
        employee[7] = new Employee("John Lenon 8", 3, 40000);
        employee[8] = new Employee("John Lenon 9", 4, 50000);
        employee[9] = new Employee("John Lenon 10", 5, 60000);

        allStuff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStuffSalary(employee);
        averageSalary(employee);
        countAllStuff(employee);




    }
}