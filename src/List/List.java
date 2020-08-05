package List;

import java.util.ArrayList;

public class List {

    private ArrayList<Integer> list = new ArrayList<>();

    public List() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                list.add(0, i + 1);
            } else {
                list.add(list.size() - 1, i + 1);
            }
        }
    }

    public void remove() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                list.remove(0);
            } else {
                list.remove(list.size() - 1);
            }
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}
