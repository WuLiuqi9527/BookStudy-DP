package command.command;

import command.receiver.CodeGroup;
import command.receiver.PageGroup;
import command.receiver.RequirementGroup;

public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();

    protected PageGroup pg = new PageGroup();

    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
