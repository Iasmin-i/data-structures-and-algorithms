import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    
    public static void main(String[] args) {
        
        // Queue methods: offer(), poll(), peek()
        // Collections methods: isEmpty(), size(), contains(Object o)
        
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("Sawako");
        queue.offer("Chizuru");
        queue.offer("Ayane");
        queue.offer("Kazehaya");
        queue.offer("Ryu");
        
        System.out.println(queue.size());
        
        if (queue.contains("Ryu")){
            while(queue.peek() != "Ryu"){
                queue.poll();
            }
        }
            System.out.println(queue);
    }
    
}