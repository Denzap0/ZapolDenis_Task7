package Queue;

import java.util.ArrayDeque;

public class DropOutQueue {

    private ArrayDeque<Integer> people = new ArrayDeque<>();

    public DropOutQueue() {
        for (int i = 0; i < 15; i++) {
            people.addFirst(i + 1);
        }
    }

    public void DropOut() {
        for (int i = 0; i < 14; i++) {
            System.out.print(people.peekFirst() + " ");
            people.removeFirst();
        }
    }

    public ArrayDeque<Integer> getPeople() {
        return people;
    }

    public void setPeople(ArrayDeque<Integer> people) {
        this.people = people;
    }
}
