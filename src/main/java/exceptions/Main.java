//package exceptions;
//
//import java.util.logging.Logger;
//
//class Main{
//    private static Logger logger = Logger.getLogger(String.valueOf(Main.class));
//    //1st exception
//    static void enterWebsite(int age) {
//        if (age < 18) {
//            throw new AgeToEnterWebsite("Must be 18 years old to enter website.");
//        } else {
//            logger.info("Accepted");
//        }
//    }
//    //2nd exception
//    static void vote(int age) {
//        if(age < 18){
//            throw new IllegalArgumentException("Must be 18 years old to vote.");
//        } else {
//            logger.info("You can vote.");
//        }
//    }
//    //main
//    public static void main(String[] args){
//        int a = 6;
//        int b = 0;
//
//        enterWebsite(26);
//        vote(26);
//        //4th exception
//        try{
//            logger.info("" + a/b);
//        } catch(AgeToEnterWebsite e){
//            logger.info("AgeToEnterWebsite");
//        }
//        //5th exception
//        try {
//            int num = Integer.parseInt ("Number") ;
//            logger.info("" + num);
//        } catch(NumberFormatException e) {
//            logger.info("NumberFormatException");
//        }
//
//    }
//
//}