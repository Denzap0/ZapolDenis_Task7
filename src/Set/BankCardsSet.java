package Set;

import Classes.CreditCard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;

public class BankCardsSet {

    HashSet<CreditCard> clients;

    public BankCardsSet(){
        clients = new HashSet<>();
    }

    public void addClient( String owner, long id){
        clients.add(new CreditCard(owner, id));
    }

    public HashSet<CreditCard> getClients() {
        return clients;
    }

    public void setClients(HashSet<CreditCard> clients) {
        this.clients = clients;
    }
}
