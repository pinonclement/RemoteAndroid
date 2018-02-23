package m1project.remoteandroid.model;

/**
 * Created by Zephyr on 23/02/2018.
 */


public class Ecran {
    private String ids;
    private String type;
    private String ipv4;
    private String resolution;
    private int row;
    private int cols;
    private boolean tactile;
    private boolean orientation;

    public Ecran(String ids, String resolution, boolean tactile, boolean orientation) {
        this.ids = ids;
        this.resolution = resolution;
        this.tactile = tactile;
        this.orientation = orientation;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public boolean isTactile() {
        return tactile;
    }

    public void setTactile(boolean tactile) {
        this.tactile = tactile;
    }

    public boolean isOrientation() {
        return orientation;
    }

    public void setOrientation(boolean orientation) {
        this.orientation = orientation;
    }
}
