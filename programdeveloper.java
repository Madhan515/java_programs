class Employee{
    String name;
    double basesalary;

    void displayBaseInfo(){
        System.out.println("Name:" + name);
        System.out.println("Base Salary:"+ basesalary);

    }
}
class Developer extends Employee{
    String ProgrammingLanguage;
    
    void writecode(){
        System.out.println("Programming Language:" + ProgrammingLanguage);
    }
}
class Tester extends Employee{
    String Testingtools;

    void runTests(){
        System.out.println("Testing Tools:" + Testingtools);
    }
}

public class programdeveloper {
    public static void main(String[] args){
        Developer d = new Developer();
        Tester t = new Tester();

        d.name = "Madhan";
        d.basesalary = 25000;
        d.ProgrammingLanguage = "Java";
        t.Testingtools = "Google Gemini";

        d.displayBaseInfo();
        d.writecode();
        t.runTests();
    }
}
