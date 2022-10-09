package patternt.factory;

public abstract class Phone{
    public abstract String getRAM();
    public abstract int getMainCam();
    public abstract String getDisplay();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", Main Cam MP="+this.getMainCam()+", Display res="+this.getDisplay();
    }
}
