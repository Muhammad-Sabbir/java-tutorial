package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
            var placesToVisit = new LinkedList<String>();
            placesToVisit.add("Sydney");
            placesToVisit.add(0, "Canberra");

            addMoreElements(placesToVisit);
            System.out.println(placesToVisit);

//            removeElements(placesToVisit);
//            System.out.println(placesToVisit);

//            gettingElements(placesToVisit);

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);
    }
    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
//        Stack Methods
        list.push("Alice Springs");
    }
    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");



        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");


        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");






    }
    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrived Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());

        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " +  list.lastIndexOf("Melbourne"));

        System.out.println("Element from element() = " + list.element());
        System.out.println("Element from peek()" + list.peek());
        System.out.println("Element from peekFirst()" + list.peekFirst());
        System.out.println("Element from peekLast()" + list.peekLast());

    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for(int i=1; i< list.size(); i++){
            System.out.println(" --> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at" + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town: list){
            System.out.println(" --> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at" + list.getLast());
    }


    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println(" --> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at" + list.getLast());
    }
}
