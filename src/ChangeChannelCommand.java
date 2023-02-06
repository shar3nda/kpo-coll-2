public class ChangeChannelCommand implements Command {
    private TVControls controls;

    public ChangeChannelCommand(TVControls controls){
        this.controls = controls;
    }
    @Override
    public void execute(int num) {
        this.controls.changeChannel(num);
    }
}
