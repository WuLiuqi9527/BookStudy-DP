package chainofresponsibility.advance;

public abstract class Handler {
    private int level;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("-----------没地方请示了，不做处理！---------\n");
            }
        }
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void response(IWomen women);
}
