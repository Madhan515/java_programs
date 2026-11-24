class vehicles{
    void brand(){
        System.out.println("Brand: BMW!");
    }
}
class car extends vehicles{
    void modelName(){
        System.out.println("Model: x5");
    }
    void displayDetails(){
        brand();
        modelName();
    }
    void honk(){
        System.out.println("Beep Beep!");
    }
}
class vehicle{
    public static void main(String[] args){
        car c = new car();
        c.displayDetails();
        c.honk();
    }
}
