import java.util.*;

public class HashtableExample {
    
    public static void main(String[] args) {
        
        Hashtable<Integer, String> players = new Hashtable<>();
        
        // all of these results will cause collision
        players.put(80, "Sawako");
        players.put(100, "Kazehaya");
        players.put(90, "Ayane");
        players.put(120, "Chizuru");
        players.put(110, "Ryu");
        
     /*  for (Integer key : players.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + players.get(key));
        } */
        
        int highestScore = Integer.MIN_VALUE;
        String winner = "";
        
        for(Map.Entry<Integer, String> entry : players.entrySet()){
            
            if (entry.getKey() > highestScore){
                
                highestScore = entry.getKey();
                winner = entry.getValue();
            }
        }
        
        System.out.println("The winner is: " + winner + "\tScore: " + highestScore);
        
        
    }
    
}