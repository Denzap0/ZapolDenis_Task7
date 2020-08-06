package List;

import java.util.ArrayList;

public class Jenga {

    private ArrayList<Integer> list = new ArrayList<>();

    public Jenga(){
        for(int i = 0; i < 15; i++){
            list.add(i);
        }
    }

    public void moving(){
        int reserv;
        for(int i = 0; i < list.size() - 2; i++){
            reserv = list.get(2);
            list.remove(2);
            list.add(list.size(),reserv);
            System.out.println(list);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}
