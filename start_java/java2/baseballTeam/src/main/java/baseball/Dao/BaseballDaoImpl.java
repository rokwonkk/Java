package baseball.Dao;

import baseball.Dto.PicherDto;
import baseball.Dto.HumanDto;
import baseball.Dto.BatterDto;
import baseball.file.FileIO;

import java.io.*;
import java.util.Scanner;

public class BaseballDaoImpl implements BaseballDao{

    Scanner sc = new Scanner(System.in);

    private HumanDto player[];

    private int count;

    private FileIO fio;

    public BaseballDaoImpl() {

//        fio = new FileIO("baseball_player");
//        fio.create();

        count = 0;

        player = new HumanDto[10];
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
            System.out.print("포지션 >> ");
            String batposition = sc.next();
            System.out.print("타수 >> ");
            int batcount = sc.nextInt();
            System.out.print("안타 >> ");
            int hit = sc.nextInt();
            System.out.print("타율 >> ");
            int batavg = sc.nextInt();

            player[count] = new BatterDto(number,name,age,height,batposition,batcount,hit,batavg);
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
            System.out.print("포지션 >> ");
            String pitposition = sc.next();
            System.out.print("승 >> ");
            int win = sc.nextInt();
            System.out.print("패 >> ");
            int lose = sc.nextInt();
            System.out.print("방어율 >> ");
            int defence = sc.nextInt();

            player[count] = new PicherDto(number,name,age,height,pitposition,win,lose,defence);
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
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();
        try {
            for (int i = 0; i < player.length; i++) {
                String findName = player[i].getName();

                if (name.equals(findName)){
                    System.out.println("데이터를 찾았습니다");
                    System.out.println("이름은 : " + player[i].getName() +"입니다" );
                    System.out.println("나이는 : " + player[i].getAge() +"입니다" );
                    System.out.println("신장은 : " + player[i].getHeight() +"입니다" );

                    if (player[i] instanceof BatterDto batterDto){
                        System.out.println("포지션은 : "+ batterDto.getPosition() +"입니다");
                        System.out.println("타수는 : "+ batterDto.getBatcount() +"입니다");
                        System.out.println("안타는 : "+ batterDto.getHit() +"입니다");
                        System.out.println("타율은 : "+ batterDto.getHivAvg() +"입니다");

                    } else if (player[i] instanceof PicherDto picherDto){
                        System.out.println("포지션은 : "+ picherDto.getPosition() +"입니다");
                        System.out.println("승리는 : "+ picherDto.getWin() +"번 입니다");
                        System.out.println("패배는 : "+ picherDto.getLose() +"번 입니다");
                        System.out.println("방어율은 : "+ picherDto.getDefence() +"입니다");
                    }
                    break;
                }
            }
        } catch (NullPointerException e){
            System.out.println("선수 명단에 없습니다.");
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
                        System.out.println("타수는 : "+ batterDto.getBatcount() +"입니다");
                        System.out.print("수정할 타수를 입력하세요 >> ");
                        int updateBatCount = sc.nextInt();
                        batterDto.setBatcount(updateBatCount);
                        System.out.println("안타는 : "+ batterDto.getHit() +"입니다");
                        System.out.print("수정할 안타를 입력하세요 >> ");
                        int updateHit = sc.nextInt();
                        batterDto.setHit(updateHit);
                        System.out.println("타율은 : "+ batterDto.getHivAvg() +"입니다");
                        System.out.print("수정할 타율을 입력하세요 >> ");
                        int updateHivAvg = sc.nextInt();
                        batterDto.setHivAvg(updateHivAvg);

                    } else if (player[i] instanceof PicherDto picherDto){
                        System.out.println("승리는 : "+ picherDto.getWin() +"번 입니다");
                        System.out.print("수정할 승리를 입력하세요 >> ");
                        int updateWin = sc.nextInt();
                        picherDto.setWin(updateWin);
                        System.out.println("패배는 : "+ picherDto.getLose() +"번 입니다");
                        System.out.print("수정할 패배를 입력하세요 >> ");
                        int updateLose = sc.nextInt();
                        picherDto.setLose(updateLose);
                        System.out.println("방어율은 : "+ picherDto.getDefence() +"입니다");
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
        for (int i = 0; i < player.length; i++) {
            if(player[i] instanceof BatterDto batterDto){
                System.out.println((i+1)+"등 이름 : "+batterDto.getName() +" 타율 : " + batterDto.getHivAvg());
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
        for (int i = 0; i < player.length; i++) {
            if(player[i] instanceof PicherDto picherDto){
                System.out.println((i+1)+"등 이름 : "+picherDto.getName() +" 방어율 : " + picherDto.getDefence());
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
//                player[loadCount] = new HumanDto();
//                HumanDto dto = player[loadCount];

                String data[] = str.split("-");

//                dto.setNumber(Integer.parseInt(data[0]));
//                dto.setName(data[1]);
//                dto.setAge(Integer.parseInt(data[2]));
//                dto.setHeight(Double.parseDouble(data[3]));

                if (player[loadCount] instanceof BatterDto batterDto) {
                    batterDto.setNumber(Integer.parseInt(data[0]));
                    batterDto.setName(data[1]);
                    batterDto.setAge(Integer.parseInt(data[2]));
                    batterDto.setHeight(Double.parseDouble(data[3]));
                    batterDto.setPosition(data[4]);
                    batterDto.setBatcount(Integer.parseInt(data[5]));
                    batterDto.setHit(Integer.parseInt(data[6]));
                    batterDto.setHivAvg(Double.parseDouble(data[7]));

                    player[loadCount] = new BatterDto(batterDto.getNumber(),batterDto.getName(),batterDto.getAge(),batterDto.getHeight(),batterDto.getPosition(),batterDto.getBatcount(),batterDto.getHit(),batterDto.getHivAvg());

                } else if (player[loadCount] instanceof PicherDto picherDto){
                    picherDto.setPosition(data[4]);
                    picherDto.setWin(Integer.parseInt(data[5]));
                    picherDto.setLose(Integer.parseInt(data[6]));
                    picherDto.setDefence(Double.parseDouble(data[7]));

                    new PicherDto(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4], Integer.parseInt(data[5]), Integer.parseInt(data[6]), Double.parseDouble(data[7]));
                }
                System.out.println(player[loadCount].toString());
                loadCount++;
            }
            br.close();

            count = loadCount;
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
