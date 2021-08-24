public class ClienteDuck {
    public static void main(String[] args) {
        System.out.println("---------- MallardDuck ----------");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.performFly();

        System.out.println("---------- RedheadDuck ----------");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.performQuack();
        redheadDuck.swim();
        redheadDuck.display();
        redheadDuck.performFly();

        System.out.println("---------- RubberDuck ----------");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performFly();

        System.out.println("---------- ModelDuck ----------");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
