
public class RecursionExample {
    
    public static void main(String[] args) {
        // Sawako and Kazehaya are avoiding each other again. Another confusion? 
        // Ayane is trying to explain Chizuru the problem they're in.
        // But Chizuru is sluggish as always. Here we go again...

        explain(5);
        System.out.println();
        System.out.println("She finally got it!"); 
        
        // Chizuru: "Ahhhhhh, now I get it... I'M GOING TO TALK TO KAZEHAYA NOW!
        // Ayane: WAIT! WHERE ARE YOU GOING!
        
    }
    
    private static void explain(int attempts){
        
        if (attempts < 1) return;// base case
        System.out.println("Explaining...");
        
        explain(attempts - 1); // recursion step
    }
    
}