package patternt.factory;


public class Samsung extends Phone {
    private String ram;
    private int mainCam;
    private String display;

    public Samsung(String ram, int mainCam, String display){
        this.ram=ram;
        this.mainCam=mainCam;
        this.display=display;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public int getMainCam() {
        return this.mainCam;
    }

    @Override
    public String getDisplay() {
        return this.display;
    }
}
