public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Sin sonido - no puedo hacer quack");
    }
}
