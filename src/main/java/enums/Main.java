package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    SocialMedia name;
    public Main(SocialMedia name) {
        this.name = name;
    }
    public void socialMediaDetails() {
        switch (name) {
            case FACEBOOK:
                LOGGER.info("Facebook: It's free and always will be.");
                break;
            case TWITTER:
                LOGGER.info("Twitter: Discover what's happening right now, anywhere in the world.");
                break;
            case INSTAGRAM:
                LOGGER.info("Instagram: Capture and Share the World's Moments.");
                break;
            case YOUTUBE:
                LOGGER.info("Youtube: Broadcast Yourself.");
                break;
            default:
                LOGGER.info("DEFAULT: You are using Google...");
                break;
        }
    }
    public static void main(String[] args) {
        //SocialMedia enum
        Main JOHN = new Main(SocialMedia.FACEBOOK);
        JOHN.socialMediaDetails();
        //Website url
        String w = Website.FB.getUrl();
        LOGGER.info(w);
        //UsersAge enum
        UsersAge john = UsersAge.JOHN;
        LOGGER.info("User Name and Age: "+john.name()+" "+john.getAge());
        //Calculator enum
        LOGGER.info("calculator");
        int x = 2;
        int y = 3;
        for (Calculator c : Calculator.values()) {
            LOGGER.info(x+" "+c.toString()+" "+y+" = "+c.calculate(x,y));
        }

    }
}