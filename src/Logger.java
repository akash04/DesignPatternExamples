public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("[LOG]" + msg);
    }

    public void info(String msg) {
        System.out.println("[INFO]" + msg);
    }

    public void error(String msg) {
        System.out.println("[ERROR]" + msg);
    }

    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        logger1.log("Reguklar message");
        logger1.info("infoer message");
        logger1.error("error message");

        Logger logger2 = Logger.getInstance();
        logger2.log("this is log message");

        System.out.println("Question:: " +  (logger1 == logger2));
    }
}
