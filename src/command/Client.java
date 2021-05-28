package command;

import command.command.AddRequirementCommand;
import command.command.Command;
import command.command.DeletePageCommand;
import command.invoker.Invoker;
import command.receiver.Group;
import command.receiver.PageGroup;
import command.receiver.RequirementGroup;

/**
 * 命令模式【Command Pattern】
 * <p>
 * 命令模式比较简单，但是在项目中使用是非常频繁的，封装性非常好，
 * 因为它把请求方（Invoker）和执行方（Receiver）分开了，扩展性也有很好的保障。
 * 但是，命令模式也是有缺点的，你看 Command 的子类没有，
 * 那个如果我要写下去的可不是几个，而是几十个，这个类膨胀的非常多，这个就需要大家在项目中自己考虑使用了
 */
public class Client {

    public static void main(String[] args) {
        Invoker xiaosan = new Invoker();
        System.out.println("-------------客户要求增加一项需求-----------------");
        Command command = new AddRequirementCommand();
        xiaosan.setCommand(command);
        xiaosan.action();

        command = new DeletePageCommand();
        xiaosan.setCommand(command);
        xiaosan.action();
    }
}
