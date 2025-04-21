import java.util.Arrays;

public class BinarySearchExample {
    
    public static void main(String[] args) {
        // Sawako found a note in her desk: "Search for the book of the Secrets of the Heart".
        // She went looking. Who left that here? Kazehaya?
        
        String[] books = {
            "A Journey Through Numbers",
            "Basic Chemistry Explained",
            "Camping Tips",
            "Chronicles of the Moonlight",
            "Dramas of Youth",
            "Echoes of the Mind",
            "Everything about Mount Fuji",
            "Geometry for Beginners",
            "How to play RPG",
            "Legends of the Old Temple",
            "Poems from the Wind",
            "Secrets of the Heart",
            "Stars and Their Stories",
            "The History of Sakura Town",
            "To the Infinity and Beyond",
            "Understanding Biology",
            "Whispers in the Library", 
            "Why do We Speak?"
        };
        
        // Ayane once said that binary search is useful when dealing with a large, sorted data set.
        
        String target = "Secrets of the Heart";
        int index = binarySearch(books, target);
        
        if (index == -1){
            System.out.println();
            System.out.println(target + " not found.");
        } else {
            System.out.println();
            System.out.println("She found it! And... it's a Horror Stories book!");
        }
        
       // Some students pass near her and think: "Was that a GHOST!?".
        
    }
    
    private static int binarySearch(String[] books, String target){
        
        int low = 0;
        int high = books.length - 1;
        
        while(low <= high){
            int middle = low + (high - low) / 2;
            String value = books[middle];
            
            System.out.println("Middle: " + value);
            
            if (value.compareTo(target) < 0) {
                low = middle + 1;
            } else if (value.compareTo(target) > 0) {
                high = middle - 1;
            } else {
                return middle; // target found
            }
        }
        return -1; // target not found
    }
}