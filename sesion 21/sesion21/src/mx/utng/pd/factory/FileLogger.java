package mx.utng.pd.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    @Override
    public void log(String msg){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(log.txt));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
