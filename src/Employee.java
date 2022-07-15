public class Employee {
    private String stuff;
    private int department;
    private int salary;
    private int id;
    private static int counter;


    public Employee (String stuff, int department, int salary) {
        this.stuff = stuff;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }
    public static int getCounter() {return counter;}

        public String getStuff() {
            return this.stuff;
        }
        public int getId()   {return id;}

        public int getDepartment()   {return this.department;}

        public int getSalary()   {return this.salary;}

        public void setStuff(String stuff) {this.stuff = stuff;}

        public void setDepartment(int new_department)   {this.department = department;}

        public void setSalary(int new_salary)   {this.salary = salary;}

    @Override
    public String toString() {
        return "Ф.И.О.: " + stuff +
                " Зарплата: " + salary +
                " Номер отдела: " + department +
                " Идентификационный номер: " + id;
    }
}
