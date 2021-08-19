public abstract class Duck {
    public void quack() {
        System.out.println("Sonido quack");
    }

    public void swim() {
        System.out.println("Acción Nadar");
    }

    abstract void display();

    public void fly() {
        System.out.println("Acción Volar");
    }
}
