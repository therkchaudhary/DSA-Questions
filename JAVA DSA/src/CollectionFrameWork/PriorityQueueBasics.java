package CollectionFrameWork;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        //default behaviour -> Integers -> less value -> high priority -> minHeap
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
