package patternt.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
public class CDType {
    private static final Logger LOGGER = LogManager.getLogger(CDType.class);
    private List<Packing> items=new ArrayList<Packing>();
    public void addItem(Packing packs) {
        items.add(packs);
    }
    public void getCost(){
        for (Packing packs : items) {
            packs.price();
        }
    }
    public void showItems(){
        for (Packing packing : items){
            LOGGER.info("CD name: "+packing.pack() + ", Price: " + packing.price());
        }
    }
}