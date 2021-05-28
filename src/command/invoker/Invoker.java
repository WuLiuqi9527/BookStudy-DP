package command.invoker;

import command.command.Command;

/**
 * 接头人的职责就是接收命令，并执行
 * Invoker 实现类:项目接头人，setComand 接受客户发给我我们的命令，action 方法是执行客户的命令
 * （方法名写成是 action 是与 command 的 execute 区分开，避免混淆）
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

}
