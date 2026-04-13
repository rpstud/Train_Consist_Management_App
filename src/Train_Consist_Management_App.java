import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("===============================");
        System.out.println("===== Train Consist Management APP =====");
        System.out.println("===============================\n");

        // Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // Initialization Message
        System.out.println("Train initialized successfully...");

        // Display Initial Bogie Count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display Current Train Consist
        System.out.println("Current Train Consist : " + trainConsist);

        // System Ready Message
        System.out.println("\nSystem ready for operations...");
    }
}