package television;

public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void setChannel(int num) {
        tv.activateChannel(num);
    }

    public void onTV() {
        tv.activateTV();
    }
    public void offTV(){
        tv.switchOff();
    }
}
