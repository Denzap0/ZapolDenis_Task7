package Classes;

import java.util.Random;

public class CreditCard {

    private final Random rand = new Random();
    private long id;
    private String owner;

    public CreditCard(){
        this.owner = "Vasya";
        this.id = rand.nextLong();
    }

    public CreditCard(String owner, long id){
        this.owner = owner;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
