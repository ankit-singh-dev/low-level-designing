package logger;

public class Client {

    public static void main(String[] args) {

        /*
        Chain of responsibility design pattern
         */
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor()));

        logProcessor.log("1","Info log");
        logProcessor.log("2","debug log");
        logProcessor.log("3","error log");
        logProcessor.log("4","error log");
    }
}
