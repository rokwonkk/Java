package Observer.dto;

import java.util.Observable;

public class Human extends Observable {

    private String id;
    private String password;

    private String preArg = null;

    @Override
    public void notifyObservers(Object arg) {

        String str = (String) arg;

        //변화가 없을 때 -> 통지를 안함
        if (str.equals(preArg)) return;

        //변화가 있을 때
        preArg = str;
        setChanged(); //reset

        super.notifyObservers(arg);

        clearChanged();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
