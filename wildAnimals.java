class Animals{
    String name;
    void eat(){
        System.out.println(name + "is eating!");
    }
}
class Dog extends Animals{
    String breed;
    void bark(){
        System.out.println(name + "the" + breed + "is barking!");
    }
}
class wildAnimals{
    public static void main(String[] args){
        Dog d = new Dog();
        d.name = "charry";
        d.breed = "Golden Retriever";
        
        d.eat();
        d.bark();
    }
}