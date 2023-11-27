package baseball.Dao;

import baseball.Dto.PicherDto;
import baseball.Dto.HumanDto;
import baseball.Dto.BatterDto;
import baseball.file.FileIO;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class BaseballDaoImpl implements BaseballDao{

    Scanner sc = new Scanner(System.in);

    private HumanDto player[];

    private int count;

    private FileIO fio;

    public BaseballDaoImpl() {

//        fio = new FileIO("baseball_player");
//        fio.create();

        player = new HumanDto[10];

        count = 0;

    }

    @Override
    public void insertPlayer() {

        System.out.print("타자(1) : 투수(2)를 입력해주십시오 >> ");
        int position = sc.nextInt();

        if (position == 1){
            System.out.println("타자 정보 입력입니다");
            System.out.print("번호 >> ");
            int number = sc.nextInt();
            System.out.print("이름 >> ");
            String name = sc.next();
            System.out.print("나이 >> ");
            int age = sc.nextInt();
            System.out.print("신장 >> ");
            double height = sc.nextDouble();
            System.out.print("타수 >> ");
            int batcount = sc.nextInt();
            System.out.print("안타 >> ");
            int hit = sc.nextInt();
            System.out.print("타율 >> ");
            double hitAvg = sc.nextDouble();

            player[count] = new BatterDto(number,name,age,height,"타자",batcount,hit,hitAvg);
            count++;

        } else if (position == 2){

            System.out.println("투수 정보 입력입니다");
            System.out.print("번호 >> ");
            int number = sc.nextInt();
            System.out.print("이름 >> ");
            String name = sc.next();
            System.out.print("나이 >> ");
            int age = sc.nextInt();
            System.out.print("신장 >> ");
            double height = sc.nextDouble();
            System.out.print("승 >> ");
            int win = sc.nextInt();
            System.out.print("패 >> ");
            int lose = sc.nextInt();
            System.out.print("방어율 >> ");
            double defence = sc.nextDouble();

            player[count] = new PicherDto(number,name,age,height,"투수",win,lose,defence);
            count++;
        }
    }

    @Override
    public void deletePlayer() {
        System.out.print("삭제할 선수 이름을 입력하세요 >> ");
        String name = sc.next();
        try {
            for (int i = 0; i < player.length; i++) {
                String findName = player[i].getName();

                if (name.equals(findName)){
                    for(int j = i; j < player.length - 1; j++){
                        player[j] = player[j + 1];
                    }
                    System.out.println("정상적으로 삭제됐습니다.");
                    count--;
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("선수명단에 없습니다.");
        }
    }

    @Override
    public void selectPlayer() {
        System.out.println("선수검색입니다.");
        System.out.print("검색할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        int count = 0;
        for (int i = 0; i < player.length; i++) {
            HumanDto h = player[i];
            if (h != null && !h.getName().isEmpty()) {
                if (name.equals(h.getName())) {
                    count++;
                }
            }
        }

        if (count == 0){
            System.out.println("선수명단에 없습니다.");
            return;
        }

        HumanDto[] findPlayer = new HumanDto[count];
        int c = 0;
        for (int i = 0; i < player.length; i++){
            HumanDto h = player[i];
            if (h != null && !h.getName().isEmpty()){
                if(name.equals((h.getName()))){
                    findPlayer[c] = player[i];
                    c++;
                }
            }
        }

        System.out.println("검색된 선수 명단입니다");
        for (int i = 0; i < findPlayer.length; i++) {
            System.out.println(findPlayer[i].toString());
        }
    }

    @Override
    public void updatePlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 선수 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();
        try {
            for (int i = 0; i < player.length; i++) {
                String findName = player[i].getName();

                if (name.equals(findName)){

                    System.out.println("데이터를 찾았습니다");
                    System.out.println("이름은 : " + player[i].getName() +"입니다" );

                    if (player[i] instanceof BatterDto batterDto){
                        System.out.println("현재 타수는 : "+ batterDto.getBatcount() +"입니다");
                        System.out.print("수정할 타수를 입력하세요 >> ");
                        int updateBatCount = sc.nextInt();
                        batterDto.setBatcount(updateBatCount);

                        System.out.println("현재 안타는 : "+ batterDto.getHit() +"입니다");
                        System.out.print("수정할 안타를 입력하세요 >> ");
                        int updateHit = sc.nextInt();
                        batterDto.setHit(updateHit);

                        System.out.println("현재 타율은 : "+ batterDto.getHivAvg() +"입니다");
                        System.out.print("수정할 타율을 입력하세요 >> ");
                        int updateHivAvg = sc.nextInt();
                        batterDto.setHivAvg(updateHivAvg);

                    } else if (player[i] instanceof PicherDto picherDto){
                        System.out.println("현재 승리는 : "+ picherDto.getWin() +"번 입니다");
                        System.out.print("수정할 승리를 입력하세요 >> ");
                        int updateWin = sc.nextInt();
                        picherDto.setWin(updateWin);

                        System.out.println("현재 패배는 : "+ picherDto.getLose() +"번 입니다");
                        System.out.print("수정할 패배를 입력하세요 >> ");
                        int updateLose = sc.nextInt();
                        picherDto.setLose(updateLose);

                        System.out.println("현재 방어율은 : "+ picherDto.getDefence() +"입니다");
                        System.out.print("수정할 방어율을 입력하세요 >> ");
                        int updateDefence = sc.nextInt();
                        picherDto.setDefence(updateDefence);
                    }
                    System.out.println("수정이 끝났습니다.");
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("선수 명단에 없습니다.");
        }
    }

    @Override
    public void batAvgDesc() {
        for(int i = 0;i < player.length - 1; i++) {
            for (int j = i + 1; j < player.length; j++) {
                    // player[i], player[j]가 BatterDto 타입인지 확인
                if (player[i] instanceof BatterDto batter1 && player[j] instanceof BatterDto batter2) {
                    //System.out.println("여기탐?");
                    // 타율 비교하여 순서 변경
                    if (batter1.getHivAvg() < batter2.getHivAvg()) {
                        // Swap
                        HumanDto temp = player[i];
                        player[i] = player[j];
                        player[j] = temp;
                    }
                }
            }
        }

        //출력부분
        int rank = 1;
        for (int i = 0; i < player.length; i++) {
            if(player[i] instanceof BatterDto batterDto){
                System.out.println((rank)+"등 이름 : "+batterDto.getName() +" 타율 : " + batterDto.getHivAvg());
                rank++;
            }
        }
    }

    @Override
    public void defenceDesc() {
        for(int i = 0;i < player.length - 1; i++) {
            for (int j = i + 1; j < player.length; j++) {
                // player[i], player[j]가 PicherDto 타입인지 확인
                if (player[i] instanceof PicherDto picher1 && player[j] instanceof PicherDto picher2) {
                    // 방어율을 비교하여 순서 변경
                    if (picher1.getDefence() > picher2.getDefence()) {
                        // Swap
                        HumanDto temp = player[i];
                        player[i] = player[j];
                        player[j] = temp;
                    }
                }
            }
        }

        //출력부분
        int rank = 1;
        for (int i = 0; i < player.length; i++) {
            if(player[i] instanceof PicherDto picherDto){
                System.out.println((rank)+"등 이름 : "+picherDto.getName() +" 방어율 : " + picherDto.getDefence());
                rank++;
            }
        }
    }

    @Override
    public void save() {

        File f = new File("/Users/rokwon/fileforder/baseball_player.txt");

        String strLine[] = new String[player.length];

        for (int i = 0; i < player.length; i++) {
            HumanDto dto = player[i];

            if (dto != null){
                strLine[i] = player[i].getNumber() + "-"
                        + player[i].getName() + "-"
                        + player[i].getAge() + "-"
                        + player[i].getHeight() + "-";

                if (player[i] instanceof BatterDto batterDto) {
                    strLine[i] += batterDto.getPosition() + "-"
                            + batterDto.getBatcount() + "-"
                            + batterDto.getHit() + "-"
                            + batterDto.getHivAvg();
                } else if (player[i] instanceof PicherDto picherDto) {
                    strLine[i] += picherDto.getPosition() + "-"
                            + picherDto.getWin() + "-"
                            + picherDto.getLose() + "-"
                            + picherDto.getDefence();
                }
            } else {
                strLine[i] = "";
            }
        }
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for (String s : strLine) {
                if(s != null && !s.equals("")) {
                    pw.println(s);
                }
            }
            pw.close();

        } catch (IOException e) {
            System.out.println("파일에 저장되지 않았습니다.");
            e.printStackTrace();
        }
        System.out.println("정상적으로 저장되었습니다.");
    }

    @Override
    public void load() {

        File f = new File("/Users/rokwon/fileforder/baseball_player.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            String str = "";

            int loadCount = 0;
            while ((str = br.readLine()) != null){

                String data[] = str.split("-");

                int number = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                double height = Double.parseDouble(data[3]);
                String position = data[4];

                    if (data[4].equals("타자")) {
                        int batcount = Integer.parseInt(data[5]);
                        int hit = Integer.parseInt(data[6]);
                        double hitavg = Double.parseDouble(data[7]);

                        player[loadCount] = new BatterDto(number, name, age, height, position, batcount, hit, hitavg);

                    } else if (data[4].equals("투수")) {
                        int win = Integer.parseInt(data[5]);
                        int lose = Integer.parseInt(data[6]);
                        double defence = Double.parseDouble(data[7]);

                        player[loadCount] = new PicherDto(number, name, age, height, position, win, lose, defence);
                    }
                loadCount++;
            }
            br.close();

            System.out.println("모든 데이터를 불러왔습니다");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
