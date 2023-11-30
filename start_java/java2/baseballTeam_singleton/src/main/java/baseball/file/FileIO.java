package baseball.file;

import baseball.Dto.BatterDto;
import baseball.Dto.PicherDto;
import baseball.Singleton.Singleton;

import java.io.*;

public class FileIO {

    public static void save(String filename){
        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");

        Singleton sl = Singleton.getInstance();

        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

            for (int i = 0; i < sl.list.size(); i++) {
                pw.println(sl.list.get(i));
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

            String str = "";

            //데이터의 갯수를 카운터
            while ((str = br.readLine()) != null){

                String[] split = str.split("-");

                if(split[4].equals("타자")){
                    sl.list.add(
                            new BatterDto(Integer.parseInt(split[0]),
                                    split[1],
                                    Integer.parseInt(split[2]),
                                    Double.parseDouble(split[3]),
                                    split[4],
                                    Integer.parseInt(split[5]),
                                    Integer.parseInt(split[6]),
                                    Double.parseDouble(split[7])
                                    )
                    );
                } else if(split[4].equals("투수")){
                    sl.list.add(
                            new PicherDto(Integer.parseInt(split[0]),
                                    split[1],
                                    Integer.parseInt(split[2]),
                                    Double.parseDouble(split[3]),
                                    split[4],
                                    Integer.parseInt(split[5]),
                                    Integer.parseInt(split[6]),
                                    Double.parseDouble(split[7])
                            )
                    );
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
