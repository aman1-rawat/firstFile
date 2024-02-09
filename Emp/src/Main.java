public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aman", 22, 1500, "Mumbai");
        Employee employee2 = new Employee("Akshay", 23, 1500, "Bangalore");

    System.out.println("Salary before Increment:");
    System.out.println(employee1.name + ":" + employee1.salary);
    System.out.println(employee2.name + ":" + employee2.salary);

   employee2.raiseSalary();
  
   System.out.println("Salary after Increment:");
    System.out.println(employee1.name + ":" + employee1.salary);
    System.out.println(employee2.name + ":" + employee2.salary);
    

    }
}
