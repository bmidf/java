package patternt.facade;

import patternt.facade.models.Iphone;
import patternt.facade.models.Samsung;

public class Shop {
    private Phone iphone;
    private Phone samsung;

    public Shop(){
        iphone= new Iphone();
        samsung=new Samsung();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
}
