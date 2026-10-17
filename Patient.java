// Mandatory Exercise 4 - entity from my semester project (MediQueue)
public class Patient {
    String name;
    String reason;
    String status = "Waiting";
    boolean urgent;
    String assignedDoctor = "";

    // Moves the patient to the next stage of a visit (same order as MediQueue)
    void advanceStatus() {
        if (status.equals("Waiting")) {
            status = "In Triage";
        } else if (status.equals("In Triage")) {
            status = "Waiting for Doctor";
        } else if (status.equals("Waiting for Doctor")) {
            status = "With Doctor";
        } else if (status.equals("With Doctor")) {
            status = "Completed";
        } else {
            System.out.println(name + " has already completed their visit.");
        }
    }

    // Flips the urgent flag on or off
    void toggleUrgent() {
        urgent = !urgent;
    }

    void assignDoctor(String doctor) {
        if (doctor.isEmpty()) {
            System.out.println("Doctor's name cannot be blank. Assignment cancelled.");
        } else {
            assignedDoctor = doctor;
        }
    }

    void displayPatient() {
        String doctor = assignedDoctor.isEmpty() ? "Not yet assigned" : assignedDoctor;
        System.out.println(name + " | " + reason + " | " + status
                + " | Urgent: " + (urgent ? "Yes" : "No") + " | Doctor: " + doctor);
    }
}
