package singleton;

import java.time.LocalDate;

public class Logger {
    private static volatile Logger logger;

    private Logger(){}

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public String doLog(Object obj, String info){
        return String.format("Log info: %s - %s - %s", LocalDate.now(), obj.getClass().getName(), info);
    }
}
