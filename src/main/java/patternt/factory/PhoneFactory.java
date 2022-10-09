package patternt.factory;


public class PhoneFactory {
    public static Phone getPhone(String type, String ram, int mainCam, String display){
        if("Samsung".equalsIgnoreCase(type)) return new Samsung(ram, mainCam, display);
        return null;
    }
}