package baseball.Dao;

import baseball.Dto.PicherDto;
import baseball.Dto.HumanDto;
import baseball.Dto.BatterDto;
import baseball.Singleton.Singleton;

import java.util.*;

public class BaseballDaoImpl implements BaseballDao{
    Scanner sc = new Scanner(System.in);

    public BaseballDaoImpl() {
    }

    @Override
    public void insertPlayer() {

        System.out.print("타자(1) : 투수(2)를 입력해주십시오 >> ");
        int position = sc.nextInt();

        Singleton sl = Singleton.getInstance();

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

            sl.list.add(new BatterDto(number,name,age,height,"타자",batcount,hit,hitAvg));
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

            sl.list.add(new PicherDto(number,name,age,height,"투수",win,lose,defence));
        }
    }

    @Override
    public void deletePlayer() {
        System.out.print("삭제할 선수 이름을 입력하세요 >> ");
        String name = sc.next();

        Singleton sl = Singleton.getInstance();

        int findindex = -1;
        for (int i = 0; i < sl.list.size(); i++) {
            HumanDto findPlayer = sl.list.get(i);

            if (findPlayer.getName().equals(name)){
                findindex = i;
                break;
            }
        }

        if (findindex != -1){
            sl.list.remove(findindex);
        }
    }

    @Override
    public void selectPlayer() {
        System.out.println("선수검색입니다.");
        System.out.print("검색할 학생 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        Singleton sl = Singleton.getInstance();

        int count = 0;
        for (int i = 0; i < sl.list.size(); i++) {
            HumanDto findSameName = sl.list.get(i);
            if (findSameName != null && !findSameName.getName().isEmpty()) {
                if (name.equals(findSameName.getName())) {
                    count++;
                }
            }
        }

        if (count == 0){
            System.out.println("선수명단에 없습니다.");
            return;
        }

        HumanDto[] findedPlayer = new HumanDto[count];
        int c = 0;
        for (int i = 0; i < sl.list.size(); i++){
            HumanDto findPlayer = sl.list.get(i);
            if (findPlayer != null && !findPlayer.getName().isEmpty()){
                if(name.equals((findPlayer.getName()))){
                    findedPlayer[c] = sl.list.get(i);
                    c++;
                }
            }
        }

        System.out.println("검색된 선수 명단입니다");
        for (int i = 0; i < findedPlayer.length; i++) {
            System.out.println(findedPlayer[i].toString());
        }
    }
    @Override
    public void allData() {
        Singleton sl = Singleton.getInstance();

        for (int i = 0; i < sl.list.size(); i++) {
            HumanDto dto = sl.list.get(i);
            System.out.println(dto.toString());
        }
    }

    @Override
    public void updatePlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 선수 이름을 입력하세요 >> ");
        String name = sc.next();
        System.out.println();

        Singleton sl = Singleton.getInstance();

        int findindex = -1;
        for (int i = 0; i < sl.list.size(); i++) {
            HumanDto findStudent = sl.list.get(i);
            if (findStudent.getName().equals(name)){
                findindex = i;
                break;
            }
        }

        if (findindex != -1){

            if (sl.list.get(findindex) instanceof BatterDto batterDto){

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
                double updateHivAvg = sc.nextDouble();
                batterDto.setHivAvg(updateHivAvg);

            } else if (sl.list.get(findindex) instanceof PicherDto picherDto) {

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
                double updateDefence = sc.nextDouble();
                picherDto.setDefence(updateDefence);

            }

            System.out.println("수정이 끝났습니다.");
        }

        for (HumanDto s : sl.list) {
            System.out.println(s.toString());
        }
    }

    @Override
    public void batAvgDesc() {

        Singleton sl = Singleton.getInstance();

        // 리스트를 내림차순으로 정렬
        sl.list.sort(new Comparator<HumanDto>() {
            @Override
            public int compare(HumanDto obj1, HumanDto obj2) {
                // HumanDto가 BatterDto 타입인지 확인
                if (obj1 instanceof BatterDto && obj2 instanceof BatterDto) {
                    BatterDto batter1 = (BatterDto) obj1;
                    BatterDto batter2 = (BatterDto) obj2;

                    // 타율 비교하여 내림차순 정렬
                    return Double.compare(batter2.getHivAvg(), batter1.getHivAvg());
                }
                return 0; // 다른 타입이면 일단 0 반환
            }
        });

        int rank = 1;
        // 정렬된 리스트 출력
        for (HumanDto dto : sl.list) {
            if (dto instanceof BatterDto batterDto) {
                System.out.println((rank) + "등 이름: " + batterDto.getName() + " 타율: " + batterDto.getHivAvg());
                rank++;
            }
        }
    }

    @Override
    public void defenceDesc() {

        Singleton sl = Singleton.getInstance();
        sl.list.sort(new Comparator<HumanDto>() {
            @Override
            public int compare(HumanDto obj1, HumanDto obj2) {
                // HumanDto가 BatterDto 타입인지 확인
                if (obj1 instanceof PicherDto && obj2 instanceof PicherDto) {
                    PicherDto picher1 = (PicherDto) obj1;
                    PicherDto picher2 = (PicherDto) obj2;

                    // 타율 비교하여 내림차순 정렬
                    return Double.compare(picher1.getDefence(), picher2.getDefence());
                }
                return 0; // 다른 타입이면 일단 0 반환
            }
        });

        // 정렬된 리스트 출력
        int rank = 1;
        for (HumanDto dto : sl.list) {
            if (dto instanceof PicherDto picherDto) {
                System.out.println((rank) + "등 이름: " + picherDto.getName() + " 방어율: " + picherDto.getDefence());
                rank++;
            }
        }
    }
}
//싱글톤 적용으로 인한 주석처리
//    @Override
//    public void save() {
//
//        File f = new File("/Users/rokwon/fileforder/baseball_player.txt");
//
//        String strLine[] = new String[player.size()];
//
//        for (int i = 0; i < player.size(); i++) {
//            HumanDto dto = player.get(i);
//
//            if (dto != null){
//                strLine[i] = dto.getNumber() + "-"
//                        + dto.getName() + "-"
//                        + dto.getAge() + "-"
//                        + dto.getHeight() + "-";
//
//                if (dto instanceof BatterDto batterDto) {
//                    strLine[i] += batterDto.getPosition() + "-"
//                            + batterDto.getBatcount() + "-"
//                            + batterDto.getHit() + "-"
//                            + batterDto.getHivAvg();
//                } else if (dto instanceof PicherDto picherDto) {
//                    strLine[i] += picherDto.getPosition() + "-"
//                            + picherDto.getWin() + "-"
//                            + picherDto.getLose() + "-"
//                            + picherDto.getDefence();
//                }
//            } else {
//                strLine[i] = "";
//            }
//        }
//        try {
//            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
//            for (String s : strLine) {
//                if(s != null && !s.isEmpty()) {
//                    pw.println(s);
//                }
//            }
//            pw.close();
//
//        } catch (IOException e) {
//            System.out.println("파일에 저장되지 않았습니다.");
//            e.printStackTrace();
//        }
//        System.out.println("정상적으로 저장되었습니다.");
//    }
//
//    @Override
//    public void load() {
//
//        player.clear();
//
//        File f = new File("/Users/rokwon/fileforder/baseball_player.txt");
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(f));
//
//            String str = "";
//            while ((str = br.readLine()) != null){
//
//                String data[] = str.split("-");
//
//                int number = Integer.parseInt(data[0]);
//                String name = data[1];
//                int age = Integer.parseInt(data[2]);
//                double height = Double.parseDouble(data[3]);
//                String position = data[4];
//
//                    if (data[4].equals("타자")) {
//                        int batcount = Integer.parseInt(data[5]);
//                        int hit = Integer.parseInt(data[6]);
//                        double hitavg = Double.parseDouble(data[7]);
//
//                        player.add(new BatterDto(number, name, age, height, position, batcount, hit, hitavg));
//
//                    } else if (data[4].equals("투수")) {
//                        int win = Integer.parseInt(data[5]);
//                        int lose = Integer.parseInt(data[6]);
//                        double defence = Double.parseDouble(data[7]);
//
//                        player.add(new PicherDto(number, name, age, height, position, win, lose, defence));
//                    }
//            }
//            br.close();
//
//            System.out.println("모든 데이터를 불러왔습니다");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (NullPointerException e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void saveAnother() {
//
//        //몇개의 데이터 수 파악
//        int count = 0;
//        for (HumanDto h : player) {
//            if (h != null && !h.getName().isEmpty()) {
//                count++;
//            }
//        }
//
//        if (count == 0){
//            System.out.println("데이터가 없습니다.");
//            return;
//        }
//
//        //(String) 배열설정
//        int c = 0;
//        String saveDatas[] = new String[count];
//        for (HumanDto h : player) {
//            if (h != null && !h.getName().isEmpty()){
//                saveDatas[c] = h.toString();
//                c++;
//            }
//        }
//
//        //저장
//        dataProc.dataSave(saveDatas);
//
//        System.out.println("저장되었습니다");
//    }
//
//    @Override
//    public void loadAnother() {
//
//        String datas[] = dataProc.dataLoad();
//
//        for (String data : datas) {
//
//            String[] split = data.split("-");
//
//            if (split[4].equals("타자")){
//                player.add(new BatterDto(
//                        Integer.parseInt(split[0]),
//                        split[1],
//                        Integer.parseInt(split[2]),
//                        Double.parseDouble(split[3]),
//                        split[4],
//                        Integer.parseInt(split[5]),
//                        Integer.parseInt(split[6]),
//                        Double.parseDouble(split[7])
//                ));
//            }
//            else if (split[4].equals("투수")){
//                player.add(new PicherDto(
//                        Integer.parseInt(split[0]),
//                        split[1],
//                        Integer.parseInt(split[2]),
//                        Double.parseDouble(split[3]),
//                        split[4],
//                        Integer.parseInt(split[5]),
//                        Integer.parseInt(split[6]),
//                        Double.parseDouble(split[7])
//                ));
//            }
//        }
//        System.out.println("데이터를 로드하였습니다.");
