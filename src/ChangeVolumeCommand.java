public class ChangeVolumeCommand implements Command {
        private TVControls controls;

        public ChangeVolumeCommand(TVControls controls){
            this.controls = controls;
        }
        @Override
        public void execute(int num) {
            this.controls.changeVolume(num);
        }

}
