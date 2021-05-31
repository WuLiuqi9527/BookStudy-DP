package state.common;

public class Client {

    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.open();
        lift.close();
        lift.run();
        lift.close();
    }
}
