class Student{
    private String name;
    private int rollNumber;
    public void setName(String n){
        name = n;
    }
    public void setRollNumber(int r){
        rollNumber = r;
    }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void getter(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
    public void setter(String n, int r){
        name = n;
        rollNumber = r;
    }
}
class Main_class{
    public static void main(String[] args){
        Student s = new Student();
        s.setter("Madhan", 123);
        s.getter();
    }
}