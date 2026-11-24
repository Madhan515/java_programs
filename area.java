class Rectangle{
    private double length;
    private double width;
    public void getter(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    public void setter(double l, double w){
        if(l > 0 && w > 0){
            length = l;
            width = w;
        }
        else{
            System.out.println("Invalid Length or Width");
        }
    }
    public double area(){
        return length * width;
    }
}
class area{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.getter();
        r.setter(10, 5);
        r.getter();
        System.out.println("Area: " + r.area());
        r.setter(-10, 5);
    }
}