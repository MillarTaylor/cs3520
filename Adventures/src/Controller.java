import java.util.Stack;

public class Controller {

    private Command command;
    private Stack<Command> CommandHistory = new Stack<>();


    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {

        CommandHistory.push(this.command);
        command.execute();

    }

    public void undo() {
        Command temp = CommandHistory.peek();
        temp.undo();
        CommandHistory.pop();


    }



}
