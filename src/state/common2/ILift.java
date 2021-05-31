package state.common2;

public interface ILift {
    /**
     * OPENING_STATE 门敞状态 1
     * CLOSING_STATE 门闭状态 2
     * RUNNING_STATE 运行状态 3
     * STOPPING_STATE 停止状态 4
     */
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();
}
