package baseball.Dao;

public interface BaseballDao {

    //선수추가
    //선수삭제
    //선수검색
    //선수수정 win, lose, defence 만 수정
    //타율순위
    //방어율순위

    //prototype
    public void insertPlayer();
    public void deletePlayer();
    public void selectPlayer();
    public void updatePlayer();
    public void defenceDesc();
    public void batAvgDesc();
//    public void allData();

    public void save();
    public void load();

    public void saveAnother();
    public void loadAnother();
}
