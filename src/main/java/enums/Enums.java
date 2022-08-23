package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Enums {
    private static final Logger logger = LogManager.getLogger((String.valueOf(Enums.class)));
    SocialMedia name;
    public Enums(SocialMedia name) {
        this.name = name;
    }
    public void socialMediaDetails() {
        switch (name) {
            case Facebook:
                logger.info("Facebook: It's free and always will be.");
                break;
            case Twitter:
                logger.info("Twitter: Discover what's happening right now, anywhere in the world.");
                break;
            case Instagram:
                logger.info("Instagram: Capture and Share the World's Moments.");
                break;
            case Youtube:
                logger.info("Youtube: Broadcast Yourself.");
                break;
            default:
                logger.info("DEFAULT: You are using Google...");
                break;
        }
    }
    public static void main(String[] args) {
        Enums JOHN = new Enums(SocialMedia.Facebook);
        JOHN.socialMediaDetails();

        UsersAge john = UsersAge.JOHN;
        logger.info("User name and age: "+john.name()+" "+john.getAge());

        Enums tw = new Enums(SocialMedia.Twitter);
        tw.socialMediaDetails();
        Enums ig = new Enums(SocialMedia.Instagram);
        ig.socialMediaDetails();
        Enums yt = new Enums(SocialMedia.Youtube);
        yt.socialMediaDetails();
        Enums gg = new Enums(SocialMedia.Google);
        gg.socialMediaDetails();

    }
}