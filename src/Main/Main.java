package Main;

import Classes.*;
import Queue.*;
import List.*;
import Set.*;
import Map.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HospitalQueue res1 = new HospitalQueue();
        System.out.println("Hospital queue begin: ");
        res1.queueMove();
        System.out.println("Hospital queue end: " + res1.getHospitalQueue());

        DropOutQueue res2 = new DropOutQueue();
        System.out.println("Drop out begin: ");
        res2.DropOut();
        System.out.println("Drop out end");
        System.out.println(res2.getPeople());

        System.out.println("List begin: ");
        ListOfElements res3 = new ListOfElements();
        res3.remove();
        System.out.println("List end");
        System.out.println(res3.getList());

        Jenga res4 = new Jenga();
        System.out.println("Jenga begin: ");
        System.out.println(res4.getList());
        res4.moving();
        System.out.println("Jenga end ");

        BankCardsSet res5 = new BankCardsSet();
        res5.addClient("Vasya", 123456789);
        res5.addClient("Petya", 987654321);
        System.out.println("Credit cards set: ");
        System.out.println(res5.getClients());

        CargoSet res6 = new CargoSet();
        System.out.println("Cargo set: ");
        System.out.println(res6.getCargoSet());
        res6.check();

        Users res7 = new Users();
        System.out.println("Users begin:");
        res7.registration("Deni", 1574425235);
        res7.registration("Tanya", 214145135);
        res7.registration("Deni", 543346);
        res7.deleteUser("Misha");

        List<String> stNames = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            stNames.add(new Student("Vasya" + Math.random() * 22, 8, 15).getName());
            Collections.sort(stNames);
        }
        System.out.println("Nicks list: ");
        for(String name: stNames){
            System.out.print(name + " ");
        }

        List<Student> stMarks = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            stMarks.add(new Student("Vasya", 30 - i, 10));
            Collections.sort(stMarks, new MarkComparator());
        }
        System.out.println("\nMarks list: ");
        for(Student i: stMarks){
            System.out.print(i.getMark() + " ");
        }

        List<Student> stAges = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            stAges.add(new Student("Vasya", 10, 18 - i));
            Collections.sort(stAges, new AgesComparator());
        }
        System.out.println("\nAges list: ");
        for(Student i : stAges){
            System.out.print(i.getAge() + " ");
        }
    }
}
