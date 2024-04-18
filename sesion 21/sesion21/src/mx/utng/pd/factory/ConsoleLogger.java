package mx.utng.pd.factory;

public class ConsoleLogger implements Logger{
    @Override
    public void Logger (String msg){
        System.out.println(msg);
    }
    
}
