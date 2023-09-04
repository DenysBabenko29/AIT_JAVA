import television.Channel;
import television.Program;
import television.RemoteController;
import television.TV;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Program> programs = new ArrayList<>();
        programs.add(new Program("title1", 1));
        programs.add(new Program("title2", 2));
        programs.add(new Program("title3", 3));

        ArrayList<Channel> channels = new ArrayList<>();
        channels.add(new Channel("name1", 1, programs));
        channels.add(new Channel("name2", 2, programs));
        channels.add(new Channel("name3", 3, programs));

        TV tv = new TV(channels);
        RemoteController remoteController = new RemoteController(tv);
        remoteController.offTV();
        remoteController.setChannel(0);
        remoteController.onTV();
        remoteController.setChannel(1);
        remoteController.setChannel(2);
        remoteController.setChannel(4);

    }
}
