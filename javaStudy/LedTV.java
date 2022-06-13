public class LedTV implements TV {
    public void turnOn() {
        System.out.println("On");
    }

    public  void turnOff() {
        System.out.println("Off");
    }

    public void changeVolume(int volume) {
        System.out.println("볼륨변경");
    }

    public void changeChannel(int channel){
        System.out.println("채널변경");
    }
}
