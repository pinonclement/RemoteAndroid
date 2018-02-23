package m1project.remoteandroid.model;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**
 * Created by Zephyr on 23/02/2018.
 */

public class Scenario {
    Ecran video;
    String file;
    List screens;
    boolean distributed;
    boolean mute;
    boolean state;
    boolean loop;
    int volume;
    Float departure;

    public Scenario(Ecran video, String file, List screens, boolean distributed) {
        this.video = video;
        this.file = file;
        this.screens = screens;
        this.distributed = distributed;
        this.mute = false;
        this.state = true;
        this.loop = false;
        this.volume = 10;
        this.departure = 0.0;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public List getScreens() {
        return screens;
    }

    public void setScreens(List screens) {
        this.screens = screens;
    }

    public boolean isDistributed() {
        return distributed;
    }

    public void setDistributed(boolean distributed) {
        this.distributed = distributed;
    }

    public boolean isMute() {
        return mute;
    }

    public void setMute(boolean mute) {
        this.mute = mute;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Float getDeparture() {
        return departure;
    }

    public void setDeparture(Float departure) {
        this.departure = departure;
    }
}


