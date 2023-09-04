package television;

import java.util.ArrayList;
import java.util.Random;


public class TV {
    Random random = new Random();
    private ArrayList<Channel> channels;
    private boolean isActiv;

    public TV(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public boolean isActiv() {
        return isActiv;
    }

    Channel findChannel(int num){
        if (num == 0){
            return channels.get(0);
        } else if (num == 1){
            return channels.get(1);
        } else if (num == 2){
            return channels.get(2);
        } else {
            throw new NullPointerException("Такого канала нет!");
        }
    }

    void activateChannel(int num) {
        if (isActiv){
            Channel channel = findChannel(num);
            System.out.println("Включен канал " + channel);
        } else {
            System.err.println("Включите телевизор");
        }
    }
    void activateTV(){
        isActiv = true;
        System.out.println("Телевизор включён");
        activateChannel(random.nextInt(channels.size() - 1));

    }
    void switchOff(){
        if (!isActiv){
            System.err.println("Телевизор и так выключен");
            return;
        }
        System.out.println("Телевизор выключен");
        isActiv = false;
    }
}
