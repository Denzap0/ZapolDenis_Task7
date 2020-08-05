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
        int res;
        for(int i = 0; i < list.size(); i++){
            res = list.get(8);
            list.add(list.size(),list.get(8));
            list.remove(res);
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}
