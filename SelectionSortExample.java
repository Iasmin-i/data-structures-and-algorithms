public class SelectionSortExample {

    public static void main(String[] args) {
        // Maru-chan escaped! Sawako, Kazehaya, Ayane, Chizu and Ryu went look for him!
        // On the way they find something stunning: a bunch of dogs that look exactly the same as Maru.
        // Ryu steps in and decides to find the dog.

        String[] dogs = {
            "Kiba",
            "Snoopy",
            "Billy",
            "Pochi",
            "Mario",
            "Shiro",
            "Maru",
            "Taro"
        };

        selectionSort(dogs);
        int index = linearSearch(dogs, "Maru");

        System.out.println("\nSorted dogs: ");
        for (String dog : dogs) {
            System.out.println(dog);
        }

        System.out.println();
        if (index == -1) {
            System.out.println("Sawako: He's not here!");
        } else {
            System.out.println("Ryu: Pedro Martinez!");
        }
    }

    // Chizuru: Why did we take so long if Maru has his collar on?
    // Kazehaya: I think Ryu just wanted to play with the dogs...
    // Ryu: Pedro! -3-

    private static void selectionSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            String temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static int linearSearch(String[] dogs, String target) {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}