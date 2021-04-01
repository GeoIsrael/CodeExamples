package core.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {


        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        //only show
        System.out.println(pQueue.peek());
        // delete and show
        System.out.println(pQueue.poll());
        // --
        System.out.println(pQueue.peek());

        System.out.println("==========================");

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Friends");
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
        pq.remove("Geeks");
        System.out.println("After Remove - " + pq);
        System.out.println("Poll Method - " + pq.poll());
        System.out.println("Final PriorityQueue - " + pq);

        System.out.println("==========================");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }




    }






}



