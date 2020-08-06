package Map;

import java.util.HashMap;
import java.util.Random;

public class Users {

    private static final Random rand = new Random();
    private HashMap<String,Long> users;

    public Users(){
        users = new HashMap<>();
    }

    public void registration(String name, long password){
        if(!users.containsKey(name)){
            users.put(name, password);
            System.out.println("You has registered with nick " + name);
        }
        else{
            System.out.println("User with nick " + name + " already registered");
        }
    }

    public void deleteUser(String name){
        if(users.containsKey(name)){
            users.remove(name);
            System.out.println("User with nick " + name + " removed");
        }
        else{
            System.out.println("There is no user with mick " + name + " to remove");
        }
    }

    public HashMap<String, Long> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, Long> users) {
        this.users = users;
    }
}
