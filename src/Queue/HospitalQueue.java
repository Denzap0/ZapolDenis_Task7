package Queue;

import java.util.ArrayDeque;

public class HospitalQueue {

    private ArrayDeque<Integer> hospitalQueue = new ArrayDeque<>();

    public HospitalQueue() {
        for (int i = 0; i < 15; i++) {
            hospitalQueue.addLast(i + 1);
        }
    }

    public void queueMove() {
        for (int i = 0; i < 15; i++) {
            if ((i + 1) % 3 == 0) {
                System.out.println(hospitalQueue.peekLast() + "went in");
                System.out.println(hospitalQueue.peekLast() + "went out");
                hospitalQueue.removeLast();
            } else {
                System.out.println(hospitalQueue.peekFirst() + "went in");
                System.out.println(hospitalQueue.peekFirst() + "went out");
                hospitalQueue.removeFirst();
            }
        }
    }

    public ArrayDeque<Integer> getHospitalQueue() {
        return hospitalQueue;
    }

    public void setHospitalQueue(ArrayDeque<Integer> hospitalQueue) {
        this.hospitalQueue = hospitalQueue;
    }
}
