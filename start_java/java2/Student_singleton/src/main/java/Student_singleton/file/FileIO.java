package Student_singleton.file;

import Student_singleton.Dto.StudentDto;
import Student_singleton.Singleton.Singleton;

import java.io.*;

public class FileIO {

    public static void save(String filename) {
        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");

        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

            Singleton sl = Singleton.getInstance();

            for (int i = 0; i < sl.list.size(); i++) {
                StudentDto dto = sl.list.get(i);
                pw.println(dto.toString());
            }
            pw.close();

            System.out.println("성공적으로 저장되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void load(String filename){


        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            Singleton sl = Singleton.getInstance();

            sl.list.clear(); //로드시에 초기화

            //데이터를 읽기.
            String str = "";

            while ((str = br.readLine()) != null){

                String[] split = str.split("-");

                StudentDto dto = new StudentDto(split[0],
                                            Integer.parseInt(split[1]),
                                            Double.parseDouble(split[2]),
                                            split[3],
                                            Integer.parseInt(split[4]),
                                            Integer.parseInt(split[5]),
                                            Integer.parseInt(split[6]));
                sl.list.add(dto);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
