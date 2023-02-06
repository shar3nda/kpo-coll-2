public class Main {
    public static void main(String[] args) {
        TVControls controls;
        // выбор режима ввода - с пульта или с кнопок телевизора
        inputMode mode = inputMode.REMOTE;
        if (mode == inputMode.BUTTONS) {
            controls = new TVButtons();
        } else {
            controls = new TVRemote();
        }
        controls.changeChannel(45);
        controls.changeVolume(5);

    }
}