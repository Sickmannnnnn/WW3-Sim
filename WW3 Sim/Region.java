import java.util.ArrayList;
public class Region {
    public String name;
    public int strength;
    public int dStrength;
    public ArrayList<Region> touching;
    public double revoltCount;
    public int anger;

    public Region(String n, int s, int d, ArrayList<Region> t, double r, int a){
        name = n;
        strength = s;
        dStrength = 0;
        touching = t;
        revoltCount = r;
        anger = a;
    }
    public Region(String n, int s, ArrayList<Region> t, double r, int a){
        name = n;
        strength = s;
        dStrength = 0;
        touching = t;
        revoltCount = r;
        anger = a;
    }
    public String toString(){
        return name;
    }

}
