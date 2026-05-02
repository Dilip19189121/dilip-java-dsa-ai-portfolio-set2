// Review complete for Set 2
// Ready for full processor project
public class Main {

    public static void main(String[] args) {
        // Patient vitals array processing*

        int[] patientHR = {72, 85, 92, 78};

        for (int i = 0; i < patientHR.length; i++) {

            String status;

            if (patientHR[i] > 80) {

                status = "High - AI Healthcare Alert";

            } else {

                status = "Normal";

            }

            System.out.println("Patient " + (i+1) + " HR: " + patientHR[i] + " - " + status);

        }

    // Investment returns array processing*

        double[] investmentReturns = {12.5, 8.0, 15.0};

        for (double ret : investmentReturns) {

            if (ret > 10) {

                System.out.println("Investment " + ret + "% - Profitable - AI Modeling Alert!");

            } else {

                System.out.println("Investment " + ret + "% - Normal");

            }

        }
    }

}