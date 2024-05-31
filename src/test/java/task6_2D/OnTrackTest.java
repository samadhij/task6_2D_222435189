package task6_2D;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;

public class OnTrackTest {
	
	private OnTrack onTrack;

    @Before
    public void setUp() {
        onTrack = new OnTrack();
    }

    // Right: Authenticate user with correct credentials
    @Test
    public void testAuthenticateUser_Right() {
        assertTrue(onTrack.authenticateUser("emily@deakin.edu.au", "password"));
    }

    // Boundary: Authenticate user with incorrect credentials
    @Test
    public void testAuthenticateUser_Boundary() {
        assertFalse(onTrack.authenticateUser("emily@deakin.edu.au", "wrong_password"));
    }

    // Inverse: Authenticate with invalid user
    @Test
    public void testAuthenticateUser_Inverse() {
        assertFalse(onTrack.authenticateUser("invalid_user", "password"));
    }

    // Cross-check: Authenticate with null parameters
    @Test
    public void testAuthenticateUser_CrossCheck() {
        assertFalse(onTrack.authenticateUser(null, null));
    }

    // Right: Update profile with valid parameters
    @Test
    public void testUpdateProfile_Right() {
        assertEquals("Profile updated successfully.", onTrack.updateProfile("123", "Emily", "Smith", "Em", "emily@deakin.edu.au"));
    }

    // Boundary: Update profile with null parameters
    @Test
    public void testUpdateProfile_Boundary() {
        assertEquals("Invalid parameters for profile update.", onTrack.updateProfile(null, null, null, null, null));
    }

    // Right: View enrolled courses for a valid student ID
    @Test
    public void testViewEnrolledCourses_Right() {
        List<String> courses = onTrack.viewEnrolledCourses("emily@deakin.edu.au");
        assertEquals(2, courses.size());
        assertTrue(courses.contains("Mathematics"));
        assertTrue(courses.contains("Physics"));
    }

    // Boundary: View enrolled courses for an invalid student ID
    @Test
    public void testViewEnrolledCourses_Boundary() {
        assertEquals(0, onTrack.viewEnrolledCourses("invalid_user").size());
    }

    // Cross-check: View enrolled courses with null student ID
    @Test
    public void testViewEnrolledCourses_CrossCheck() {
        assertEquals(0, onTrack.viewEnrolledCourses(null).size());
    }

    // Right: View course details for a valid course ID
    @Test
    public void testViewCourseDetails_Right() {
        List<String> courseDetails = onTrack.viewCourseDetails("Mathematics");
        assertEquals(2, courseDetails.size());
        assertTrue(courseDetails.contains("Assignment1"));
        assertTrue(courseDetails.contains("Assignment2"));
    }

    // Boundary: View course details for an invalid course ID
    @Test
    public void testViewCourseDetails_Boundary() {
        assertEquals(0, onTrack.viewCourseDetails("invalid_course").size());
    }

    // Cross-check: View course details with null course ID
    @Test
    public void testViewCourseDetails_CrossCheck() {
        assertEquals(0, onTrack.viewCourseDetails(null).size());
    }

    // Right: View progress dashboard for a valid course ID
    @Test
    public void testViewProgressDashboard_Right() {
        assertEquals("50%", onTrack.viewProgressDashboard("Mathematics"));
    }

    // Boundary: View progress dashboard for an invalid course ID
    @Test
    public void testViewProgressDashboard_Boundary() {
        assertEquals("0%", onTrack.viewProgressDashboard("invalid_course"));
    }

    // Cross-check: View progress dashboard with null course ID
    @Test
    public void testViewProgressDashboard_CrossCheck() {
        assertEquals("0%", onTrack.viewProgressDashboard(null));
    }

    // Right: Set target grade with valid grade
    @Test
    public void testSetTargetGrade_Right() {
        assertEquals("Complete all tasks.", onTrack.setTargetGrade("Pass"));
    }

    // Boundary: Set target grade with invalid grade
    @Test
    public void testSetTargetGrade_Boundary() {
        assertEquals("Invalid grade selected.", onTrack.setTargetGrade("InvalidGrade"));
    }

    // Cross-check: Set target grade with null grade
    @Test
    public void testSetTargetGrade_CrossCheck() {
        assertEquals("Invalid grade selected.", onTrack.setTargetGrade(null));
    }

    // Right: View task details for a valid task ID
    @Test
    public void testViewTaskDetails_Right() {
        assertEquals("Due on 01/01/2025", onTrack.viewTaskDetails("Assignment1"));
    }

    // Boundary: View task details for an invalid task ID
    @Test
    public void testViewTaskDetails_Boundary() {
        assertEquals("Task details not found.", onTrack.viewTaskDetails("invalid_task"));
    }

    // Cross-check: View task details with null task ID
    @Test
    public void testViewTaskDetails_CrossCheck() {
        assertEquals("Task details not found.", onTrack.viewTaskDetails(null));
    }

    // Right: Request task extension with valid parameters
    @Test
    public void testRequestTaskExtension_Right() {
        assertEquals("Extension request submitted successfully.", onTrack.requestTaskExtension("Assignment1", "Need more time to complete."));
    }

    // Boundary: Request task extension with null parameters
    @Test
    public void testRequestTaskExtension_Boundary() {
        assertEquals("Invalid parameters for extension request.", onTrack.requestTaskExtension(null, null));
    }

    // Right: Update task status with valid parameters
    @Test
    public void testUpdateTaskStatus_Right() {
        assertEquals("Task status updated successfully.", onTrack.updateTaskStatus("Assignment1", "Work in Progress"));
    }
    // Boundary: Update task status with null parameters
    @Test
    public void testUpdateTaskStatus_Boundary() {
    	assertEquals("Invalid parameters for task status update.", onTrack.updateTaskStatus(null, null));
    }

    // Right: Submit task with valid parameters
    @Test
    public void testSubmitTask_Right() {
        assertEquals("Task submitted successfully.", onTrack.submitTask("Assignment1", "Submission details"));
    }

    // Boundary: Submit task with null parameters
    @Test
    public void testSubmitTask_Boundary() {
        assertEquals("Invalid parameters for task submission.", onTrack.submitTask(null, null));
    }

    // Right: Communicate with tutor with valid parameters
    @Test
    public void testCommunicateWithTutor_Right() {
        assertEquals("Message sent successfully.", onTrack.communicateWithTutor("Assignment1", "Please review my submission."));
    }

    // Boundary: Communicate with tutor with null parameters
    @Test
    public void testCommunicateWithTutor_Boundary() {
        assertEquals("Invalid parameters for communication with tutor.", onTrack.communicateWithTutor(null, null));
    }

    // Right: Review submission with valid parameters
    @Test
    public void testReviewSubmission_Right() {
        assertEquals("Submission reviewed successfully.", onTrack.reviewSubmission("emily@deakin.edu.au", "Assignment1", "Well done!", "A+"));
    }

    // Boundary: Review submission with null parameters
    @Test
    public void testReviewSubmission_Boundary() {
        assertEquals("Invalid parameters for submission review.", onTrack.reviewSubmission(null, null, null, null));
    }

    // Right: Message with students with valid parameters
    @Test
    public void testMessageWithStudents_Right() {
        assertEquals("Message sent successfully.", onTrack.messageWithStudents("emily@deakin.edu.au", "Reminder: Assignment due soon."));
    }

    // Boundary: Message with students with null parameters
    @Test
    public void testMessageWithStudents_Boundary() {
        assertEquals("Invalid parameters for communication with students.", onTrack.messageWithStudents(null, null));
    }
    
}
