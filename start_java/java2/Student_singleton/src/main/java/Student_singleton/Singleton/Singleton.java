package Student_singleton.Singleton;

import Student_singleton.Dto.StudentDto;
import Student_singleton.file.FileIO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton sl = null;
    public List<StudentDto> list;
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
