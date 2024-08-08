package logger;

public class ErrorLogProcessor extends LogProcessor{
    @Override
    public void log(String level, String value) {
        if(level.equalsIgnoreCase(ERROR)){
            System.out.println(value);
        }else{
            System.out.println("Invalid log level");
        }
    }
}
