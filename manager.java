class Person{
    void name(){

    }
    void displayPerson(){
        name();
        System.out.println("Name: Madhan");
    }
}
class Employee extends Person{
    void employeeId(){

    }
    void displayEmployee(){
        employeeId();
        System.out.println("Employee ID: 12345");
    }
}
class Manager extends Employee{
    void department(){

    }
    void displayManager(){
        department();
        System.out.println("Department: IT");
    }
}
class manager{
    public static void main(String[] args){
        Manager m = new Manager();
        Employee e = new Employee();
        m.displayPerson();
        e.displayEmployee();
        m.displayManager();
    }
}