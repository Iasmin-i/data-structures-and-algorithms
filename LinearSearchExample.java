
public class LinearSearchExample {
    
    public static void main(String[] args) {
        // Pin-sensei is looking for Ryu to play baseball, which desk number is he in?
        
        String [] students = {"Sawako", "Ayane", "Chizuru", "Kazehaya", "Ryu", "Ekko", "Tomo", "Joe", "Andy"};
        
        int index = linearSearch(students, "Ryu");
        
        if (index != -1){
            System.out.println("Element found at index: " + index);
        } else{
            System.out.println("Element not found! He's probably sleeping outside!");
        }
    }
    
    
    private static int linearSearch(String[] students, String value){
        
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
}