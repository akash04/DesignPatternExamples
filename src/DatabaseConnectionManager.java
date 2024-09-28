public class DatabaseConnectionManager {

    //volitile - chnages will be visible to all the threads
    private static volatile DatabaseConnectionManager instance;
//////////////////////////////
    private DatabaseConnectionManager() {
        // private constructor to prevent instantiation
    }

    // responsible for providing access to the singleton instance
    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {

            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}
