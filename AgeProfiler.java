import java.util.Scanner;

// 🛠 Age Profiler Method
public class AgeProfiler {

    // Method to determine recommendations based on age
    public String customizeExperience(int age) {
        if (age < 0) {
            return "Error: Invalid age entered!";
        } else if (age < 5) {
            return "Recommended: Toddler Zone - Soft Play & Mini Rides.";
        } else if (age >= 5 && age < 12) {
            return "Recommended: Kid-Friendly Rides & Interactive Games.";
        } else if (age >= 12 && age < 18) {
            return "Recommended: Adventure Zone, Arcade Games & VR Experiences.";
        } else if (age >= 18 && age < 60) {
            return "Recommended: Thrill Rides, Roller Coasters & Live Shows.";
        } else {
            return "Recommended: Relaxation Areas & Family-Friendly Attractions.";
        }
    }

    // 🎯 Main method to simulate the system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeProfiler ageProfiler = new AgeProfiler();

        // Taking age input from the user
        System.out.print("Enter visitor's age: ");
        int age = scanner.nextInt();

        // Calling the age customization method
        String recommendation = ageProfiler.customizeExperience(age);

        // Displaying the recommendation based on age
        System.out.println(recommendation);

        scanner.close();
    }
}
