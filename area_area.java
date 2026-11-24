class Shape{
    void color(){
        System.out.println("Color:Red");
    }
    void displaycolor(){
        color();
    }
}
class Circle extends Shape{
    void radius(){
    }
    void calculateArea(){
        radius();
        System.out.println("Area: " + (3.14 * 5 * 5));
    }
}
class Rectangle extends Shape{
    void length(){
    }
    void width(){
    }
    void calculateArea(){
        length();
        width();
        System.out.println("Area: " + (10 * 5));
    }
}
class area_area{
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.displaycolor();
        r.calculateArea();
        c.calculateArea();

    }
}