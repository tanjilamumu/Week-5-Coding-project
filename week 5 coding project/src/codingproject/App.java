package codingproject;

public class App {
	static Logger logger;
	
	public static void main(String[] args) {
	
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Test log and error methods on both instances
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
	}
}
