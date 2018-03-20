package m1project.remoteandroid.model;


import java.util.ArrayList;

/**

 * Created by Zephyr on 18/03/2018.

 */



public class Video {

    Ecran videos;

    String file;

    ArrayList screens;

    boolean distributed;

    boolean mute;

    boolean state;

    boolean loop;

    int volume;

    double departure;

    String idv;



    public Video (Ecran video, String file, boolean distributed,ArrayList screens) {

        this.videos = video;

        this.screens=new ArrayList();

        this.screens= (ArrayList)screens.clone();

        this.file = file;

        this.distributed = distributed;

        this.mute = false;

        this.state = true;

        this.loop = false;

        this.volume = 10;

        this.departure = 0.0;

    }



    public Ecran getVideos() {

        return videos;

    }



    public void setVideos(Ecran videos) {

        this.videos = videos;

    }



    public String getIdv() {

        return idv;

    }



    public void setIdv(String idv) {

        this.idv = idv;

    }



    public String getFile() {

        return file;

    }



    public void setFile(String file) {

        this.file = file;

    }



    public ArrayList getScreens() {

        return screens;

    }



    public void setScreens(ArrayList screens) {

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



    public double getDeparture() {

        return departure;

    }



    public void setDeparture(Float departure) {

        this.departure = departure;

    }

}