package patternt.builder;

import patternt.builder.models.Sony;

public class CDBuilder {
    public CDType buildSonyCD(){
        CDType cds = new CDType();
        cds.addItem(new Sony());
        return cds;
    }
}