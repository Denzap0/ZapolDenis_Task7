package Set;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class CargoSet {

    private final static int maxWeight = 1000;
    private final static Random rand = new Random(100);
    private TreeSet<Integer> cargoSet = new TreeSet<>();

    public CargoSet(){
        for(int i = 0; i < 15; i++){
            cargoSet.add((int)(Math.random() * 150.0));
        }
    }

    public void check(){
        Iterator<Integer> it = cargoSet.iterator();
        int sumWeight = 0;
        while(it.hasNext()){
            sumWeight += it.next();
        }
        if(sumWeight > maxWeight){
            System.out.println("Your weight is higher then max weight");
            System.out.println(cargoSet.higher(sumWeight - maxWeight) + " removed");
            cargoSet.remove(cargoSet.higher(sumWeight - maxWeight));
        }
        else {
            System.out.println("Your weight is good");
        }
    }

    public void dumping(){
        while(cargoSet.size() > 0){
            cargoSet.remove(0);
        }
    }

    public TreeSet<Integer> getCargoSet() {
        return cargoSet;
    }

    public void setCargoSet(TreeSet<Integer> cargoSet) {
        this.cargoSet = cargoSet;
    }
}
