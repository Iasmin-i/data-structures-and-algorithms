import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {
        
        //https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html?utm_source=chatgpt.com
        
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.offer("John");
        linkedList.offer("Paul");
        linkedList.offer("George");
        linkedList.offer("Ringo");
        // how to simplify this code?
        
        if(linkedList.peek() == "John"){
            System.out.println(linkedList.peek() + " is not in the band anymore.");
            linkedList.pollFirst();
        }
        if(linkedList.peek() == "Paul"){
            System.out.println(linkedList.peek() + " is not in the band anymore.");
            linkedList.pollFirst();
        }
        if(linkedList.peek() == "George"){
            System.out.println(linkedList.peek() + " is not in the band anymore.");
            linkedList.pollFirst();
        }
        if(linkedList.peek() == "Ringo"){
            System.out.println(linkedList.peek() + " changed bands.");
            linkedList.pollFirst();
        }
        
    }
}