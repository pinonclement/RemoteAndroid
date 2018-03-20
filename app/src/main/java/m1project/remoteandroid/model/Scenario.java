package m1project.remoteandroid.model;
import java.util.LinkedList;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.HashMap;

<<<<<<< Updated upstream
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

    // scenario = video
    // creer new class  Scenario qui contient liste video ( voir json prof)

    public Scenario(Ecran video, String file, List screens, boolean distributed) {
        this.video = video;
        this.file = file;
        this.screens = screens;
        this.distributed = distributed;
        this.mute = false;
        this.state = true;
        this.loop = false;
        this.volume = 10;
        //this.departure = 0.0;

        //liste screen : cle valeur : id ecran, position
    }
=======
import java.util.Iterator;
>>>>>>> Stashed changes

import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;


/**
 * Created by Zephyr on 23/02/2018.
 */

public class Scenario {
    Map<String,ArrayList<Integer> > ecranpos;
    ArrayList video;
    String name;

    public Scenario(ArrayList video, String name,HashMap ecranpos) {
        this.ecranpos = new HashMap<>();
        this.ecranpos.putAll(ecranpos);
        this.video=new ArrayList();
        this.video= (ArrayList)video.clone();
        this.name = name;
    }

    public Map<String, ArrayList<Integer>> getEcranpos() {
        return ecranpos;
    }

    public void setEcranpos(Map<String, ArrayList<Integer>> ecranpos) {
        this.ecranpos = ecranpos;
    }

    public ArrayList getVideo() {
        return video;
    }

    public void setVideo(ArrayList video) {
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


