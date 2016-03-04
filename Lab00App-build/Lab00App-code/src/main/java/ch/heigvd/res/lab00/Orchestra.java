
package ch.heigvd.res.lab00;
import java.util.*;


public class Orchestra {
    public void addInstrument(IInstrument instru){
        l.add(instru);
    }
    
    public int getNumberOfInstruments(){
        return l.size();
    }
    
    public List<String> makeMusic(){
        List<String> l = new ArrayList();
        l.add("trilili");
        l.add("pouet");
        l.add("trilili");
        return l;
    }
    
    private ArrayList<IInstrument> l = new ArrayList();
    private int n;
}
