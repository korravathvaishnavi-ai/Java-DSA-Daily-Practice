class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    
public static void main(String[] args){

    Dog D = new Dog();

    D.eat();
}
}
