import java.util.*;

public class PriorityQueueExample {
    
    public static void main(String[] args) {
        
        Queue<Double> points = new PriorityQueue(Collections.reverseOrder());
        
        points.offer(5.0);
        points.offer(7.0);
        points.offer(6.0);
        points.offer(10.0);
        points.offer(9.0);
        
        while(!points.isEmpty()){
            System.out.println(points.poll());
        }
        
}
}