import java.util.Arrays;

public class ques1 {

    public int findCars(int input1, int[] input2, int[] input3) {
        // Filter out teams with 2 or fewer members
        int totalMembers = 0;
        int[] validCarSeats = new int[input3.length];
        int validCarCount = 0;

        for (int i = 0; i < input1; i++) {
            if (input2[i] > 2) {
                totalMembers += input2[i];
                validCarSeats[validCarCount++] = input3[i];
            }
        }

        // If no valid teams or no valid cars, return -1
        if (totalMembers == 0 || validCarCount == 0) {
            return -1;
        }

        // Resize the validCarSeats array to remove unused slots
        validCarSeats = Arrays.copyOf(validCarSeats, validCarCount);

        // Sort the car capacities in descending order
        Arrays.sort(validCarSeats);
        int carsUsed = 0;

        // Greedily use cars with the highest capacity first
        for (int i = validCarCount - 1; i >= 0; i--) {
            int seats = validCarSeats[i];
            if (totalMembers > 0) {
                totalMembers -= seats;
                carsUsed++;
            }
        }

        // If we exhausted all cars and still have members left
        return totalMembers > 0 ? -1 : carsUsed;
    }
}
