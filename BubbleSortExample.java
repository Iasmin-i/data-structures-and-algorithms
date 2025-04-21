
public class BubbleSortExample {
    
    public static void main(String[] args) {
        // Kazehaya enters the classroom and finds Pin. He already knows something is coming. 
        // Before he can say anything, Pin yells: "SHOTA, put those desks in order!".
        // Apparently, someone shuffled the desk numbers again. 
        // Kazehaya sighs, but smiles: "Alright, alright... let's do this."
        
        int[] desks = {7, 4, 9, 2, 5, 12, 8, 14, 10, 3, 1, 6, 11, 13};
        
        bubbleSort(desks);
        
        for(int i : desks){
            System.out.print(i + " ");
        }
        
    }
    
    public static void bubbleSort(int[] desks){
        for (int i = 0; i < desks.length - 1; i++){
            for (int j = 0; j < desks.length - i - 1; j++){
                if (desks[j] > desks[j +1]){
                    int temp = desks[j]; // Kazehaya: "Let me save this one for later.", "Pin: Correct, correct"
                    desks[j] = desks[j + 1]; // Kazehaya: "This one is bigger than the other? Let me switch.", "Pin: Don't forget to switch the saved one too!"
                    desks[j + 1] = temp; // Kazehaya: "PIN, LET ME DO THIS ALONE!"
                }
            }
        }
    }
    
}