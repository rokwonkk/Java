package baseball.Singleton;


import baseball.Dto.HumanDto;
import baseball.file.FileIO;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton sl = null;
    public List<HumanDto> list;
    public FileIO file;

    private Singleton() {
        list = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if(sl == null){
            sl = new Singleton();
        }
        return sl;
    }
}
