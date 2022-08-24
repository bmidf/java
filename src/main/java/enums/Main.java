package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    SocialMedia name;
    public Main(SocialMedia name) {
        this.name = name;
    }
    public void socialMediaDetails() {
        switch (name) {
            case FACEBOOK:
                logger.info("Facebook: It's free and always will be.");
                break;
            case TWITTER:
                logger.info("Twitter: Discover what's happening right now, anywhere in the world.");
                break;
            case INSTAGRAM:
                logger.info("Instagram: Capture and Share the World's Moments.");
                break;
            case YOUTUBE:
                logger.info("Youtube: Broadcast Yourself.");
                break;
            default:
                logger.info("DEFAULT: You are using Google...");
                break;
        }
    }
    public static void main(String[] args) {
        //SocialMedia enum
        Main JOHN = new Main(SocialMedia.FACEBOOK);
        JOHN.socialMediaDetails();
        //Website url
        String w = Website.FB.getUrl();
        logger.info(w);
        //UsersAge enum
        UsersAge john = UsersAge.JOHN;
        logger.info("User Name and Age: "+john.name()+" "+john.getAge());
        //Calculator enum
        logger.info("calculator");
        int x = 2;
        int y = 3;
        for (Calculator c : Calculator.values()) {
            logger.info(x+" "+c.toString()+" "+y+" = "+c.calculate(x,y));
        }

    }
}