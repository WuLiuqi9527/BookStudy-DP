package state.common2;

public class Client {

    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.CLOSING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
