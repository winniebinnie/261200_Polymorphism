public class Duck extends Animal implements Flyable{
    public void sound() {
        System.out.println("Duck goes 'quack quack'");
    }
    public void fly() {
        System.out.println("Duck flies");
    }
    public void glide() {
        System.out.println("Duck glides");
    } 
    public void clean(Animal animal) {
        System.out.println(this + " is cleaning " + animal);
    }  
}
