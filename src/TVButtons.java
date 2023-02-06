public class TVButtons implements TVControls{
    // с помощью кнопок на телевизоре можно увеличить/уменьшить канал
    @Override
    public void changeChannel(int num) {
        System.out.printf("Increase channel by %d\n", num);
    }

    @Override
    public void changeVolume(int num) {
        System.out.printf("Change volume to %d\n", num);
    }
}
