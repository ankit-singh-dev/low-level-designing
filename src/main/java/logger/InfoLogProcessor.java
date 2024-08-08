package logger;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(String level, String value) {
        if(level.equalsIgnoreCase(INFO)){
            System.out.println(value);
        }else{
            super.log(level, value);
        }
    }
}
