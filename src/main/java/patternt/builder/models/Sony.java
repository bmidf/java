package patternt.builder.models;

import patternt.builder.Company;

public class Sony extends Company {
    @Override
    public int price(){
        return 20;
    }
    @Override
    public String pack(){
        return "Sony CD";
    }
}
