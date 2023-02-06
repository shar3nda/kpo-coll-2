public class TVInvoker {
    public Command command;
    public TVInvoker(Command command) {
        this.command = command;
    }

    public void execute(int num) {
        this.command.execute(num);
    }
}
