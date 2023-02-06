public class TVRemote implements TVControls{
    // с помощью пульта можно ввести номер канала
    @Override
    public void changeChannel(int num) {
        System.out.printf("Switch channel to %d\n", num);
    }

    @Override
    public void changeVolume(int num) {
        System.out.printf("Change volume to %d\n", num);
    }
}
