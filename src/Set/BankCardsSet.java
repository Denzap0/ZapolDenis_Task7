package Set;

import Classes.CreditCard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;

public class BankCardsSet {

    HashSet<CreditCard> clients = new HashSet<>();

    public BankCardsSet(){
        for(int i = 0; i < 100; i++){
            clients.add(new CreditCard());
        }
    }

    public HashSet<CreditCard> getClients() {
        return clients;
    }

    public void setClients(HashSet<CreditCard> clients) {
        this.clients = clients;
    }
}
