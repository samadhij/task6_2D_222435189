package task6_2D;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnTrack {
	// Simulated data storage
    private Map<String, String> users = new HashMap<>();
    private Map<String, List<String>> enrolledCourses = new HashMap<>();
    private Map<String, List<String>> courseDetails = new HashMap<>();
    private Map<String, String> progressDashboard = new HashMap<>();
    private Map<String, String> targetGrades = new HashMap<>();
    private Map<String, String> taskDetails = new HashMap<>();
    private Map<String, String> taskStatus = new HashMap<>();
    private Map<String, String> taskSubmissions = new HashMap<>();
    private Map<String, String> tutorMessages = new HashMap<>();
    private Map<String, String> submissionReview = new HashMap<>();

    public OnTrack() {
    	// Sample user credentials
        users.put("emily@deakin.edu.au", "password");

        // Sample enrolled courses for a student
        enrolledCourses.put("emily@deakin.edu.au", Arrays.asList("Mathematics", "Physics"));

        // Sample course details
        courseDetails.put("Mathematics", Arrays.asList("Assignment1", "Assignment2"));
        courseDetails.put("Physics", Arrays.asList("Assignment1", "Assignment2"));

        // Sample progress dashboard data
        progressDashboard.put("Mathematics", "50%");
        progressDashboard.put("Physics", "75%");

        // Sample target grades
        targetGrades.put("Pass", "Complete all tasks.");
        targetGrades.put("Credit", "Complete all tasks with at least 70%.");
        targetGrades.put("Distinction", "Complete all tasks with at least 80%.");
        targetGrades.put("High Distinction", "Complete all tasks with at least 90%.");

        // Sample task details
        taskDetails.put("Assignment1", "Due on 01/01/2025");

        // Sample task status
        taskStatus.put("Assignment1", "Not Started");

        // Sample tutor messages
        tutorMessages.put("Assignment1", "Please submit your assignment by the deadline.");

        // Sample submission review
        submissionReview.put("Assignment1", "Feedback: Well done! Your submission meets the requirements.");
    }
 
    // Function to authenticate user
    public boolean authenticateUser(String username, String password) {
        if (username == null || password == null || !users.containsKey(username)) {
            return false;
        }
        String storedPassword = users.get(username);
        return storedPassword.equals(password);
    }

    // Function to manage profile
    public String updateProfile(String studentId, String firstName, String lastName, String preferredName, String email) {
        if (studentId == null || firstName == null || lastName == null || email == null) {
            return "Invalid parameters for profile update.";
        }
        // Simulated profile update logic
        return "Profile updated successfully.";
    }

 // Function to view enrolled courses
    public List<String> viewEnrolledCourses(String studentId) {
        if (studentId == null || !enrolledCourses.containsKey(studentId)) {
            return Collections.emptyList();
        }
        return enrolledCourses.get(studentId);
    }

    // Function to view course details
    public List<String> viewCourseDetails(String courseId) {
        if (courseId == null || !courseDetails.containsKey(courseId)) {
            return Collections.emptyList();
        }
        return courseDetails.get(courseId);
    }

 // Function to view progress dashboard
    public String viewProgressDashboard(String courseId) {
        if (courseId == null || !progressDashboard.containsKey(courseId)) {
            return "0%";
        }
        return progressDashboard.get(courseId);
    }

    // Function to set target grade
    public String setTargetGrade(String grade) {
        if (grade == null || !targetGrades.containsKey(grade)) {
            return "Invalid grade selected.";
        }
        return targetGrades.get(grade);
    }

    /// Function to view task details
    public String viewTaskDetails(String taskId) {
        if (taskId == null || !taskDetails.containsKey(taskId)) {
            return "Task details not found.";
        }
        return taskDetails.get(taskId);
    }

    // Function to request task extension
    public String requestTaskExtension(String taskId, String extensionDetails) {
        if (taskId == null || extensionDetails == null) {
            return "Invalid parameters for extension request.";
        }
        // Simulated extension request logic
        return "Extension request submitted successfully.";
    }

 // Function to update task status
    public String updateTaskStatus(String taskId, String status) {
        if (taskId == null || status == null || !taskStatus.containsKey(taskId)) {
            return "Invalid parameters for task status update.";
        }
        // Simulated task status update logic
        taskStatus.put(taskId, status);
        return "Task status updated successfully.";
    }

    // Function to submit task
    public String submitTask(String taskId, String submissionDetails) {
        if (taskId == null || submissionDetails == null || !taskDetails.containsKey(taskId)) {
            return "Invalid parameters for task submission.";
        }
        // Simulated task submission logic
        taskSubmissions.put(taskId, submissionDetails);
        taskStatus.put(taskId, "Ready for Feedback");
        return "Task submitted successfully.";
    }

    // Function to communicate with tutor
    public String communicateWithTutor(String taskId, String message) {
        if (taskId == null || message == null) {
            return "Invalid parameters for communication with tutor.";
        }
        // Simulated communication logic
        tutorMessages.put(taskId, message);
        return "Message sent successfully.";
    }

    // Function to review submission (tutor function)
    public String reviewSubmission(String studentId, String taskId, String feedback, String mark) {
        if (studentId == null || taskId == null || feedback == null || mark == null) {
            return "Invalid parameters for submission review.";
        }
        // Simulated submission review logic
        submissionReview.put(taskId, "Feedback: " + feedback + ", Mark: " + mark);
        return "Submission reviewed successfully.";
    }

    // Function to message with students (tutor function)
    public String messageWithStudents(String studentId, String message) {
        if (studentId == null || message == null) {
            return "Invalid parameters for communication with students.";
        }
        // Simulated messaging logic
        tutorMessages.put(studentId, message);
        return "Message sent successfully.";
    }

}

