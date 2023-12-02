package Addressbook.file;

import Addressbook.dto.MemberDto;
import Addressbook.member.AddressMember;

import java.io.*;

public class FileIO {

    public static void save(String filename) {
        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");

        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

            AddressMember am = AddressMember.getInstance();

            for (int i = 0; i < am.list.size(); i++) {
                MemberDto dto = am.list.get(i);
                pw.println(dto.toString());
            }
            pw.close();

            System.out.println("성공적으로 저장되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void load(String filename){

        AddressMember am = AddressMember.getInstance();
        am.list.clear(); //로드시에 초기화

        File file = new File("/Users/rokwon/fileforder/"+filename+".txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            //데이터를 읽기.
            String str = "";

            while ((str = br.readLine()) != null){

                String[] split = str.split(",");

                MemberDto dto = new MemberDto(split[0],
                                            Integer.parseInt(split[1]),
                                            split[2],
                                            split[3],
                                            split[4]);
                am.list.add(dto);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
