package logger;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(String level, String value) {
        if(level.equalsIgnoreCase(DEBUG)){
            System.out.println(value);
        }else{
            super.log(level, value);
        }
    }
}
