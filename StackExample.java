import java.util.Stack;

public class StackExample {
    
    public static void main(String[] args) {
        
        // Stack methods = push(), pop(), search(), empty(), peek()
        
        Stack<String> cds = new Stack<>();
        
        cds.push("Empathy");
        cds.push("Squall");
        cds.push("Expectation");
        cds.push("NO HANDS");
        
        System.out.println(cds.search("Squall"));
        
        while (cds.peek() != "Squall"){
            cds.pop();
        }
        System.out.println(cds.peek());
    }
}