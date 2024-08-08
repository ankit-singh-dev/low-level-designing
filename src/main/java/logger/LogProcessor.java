package logger;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public abstract class LogProcessor {

    protected final String INFO = "1";
    protected final String DEBUG = "2";
    protected final String ERROR = "3";

    private LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(String level, String value){
        nextLogProcessor.log(level, value);
    }

}
