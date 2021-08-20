public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("Sonido squeak");
    }

    @Override
    void display() {
        System.out.println("Visualizar RubberDuck");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
