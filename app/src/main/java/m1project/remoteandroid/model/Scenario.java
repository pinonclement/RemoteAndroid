package m1project.remoteandroid.model;

import java.util.List;
/**

 * Created by Zephyr on 23/02/2018.

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
