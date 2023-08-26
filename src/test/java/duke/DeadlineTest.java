package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeadlineTest {
    @Test
    public void testToString() {
        Deadline deadline = new Deadline("Submit report", "2023-08-15");
        assertEquals("[D][ ] Submit report (by: Aug 15 2023)", deadline.toString());
    }

    @Test
    public void testMarkDone() {
        Deadline deadline = new Deadline("Submit report", "2023-08-15");
        deadline.markDone();
        assertEquals(true, deadline.isDone());
    }

    @Test
    public void testMarkUndone() {
        Deadline deadline = new Deadline("Submit report", "2023-08-15");
        deadline.markDone();
        deadline.markUndone();
        assertEquals(false, deadline.isDone());
    }

    @Test
    public void testGetName() {
        Deadline deadline = new Deadline("Submit report", "2023-08-15");
        assertEquals("Submit report", deadline.getName());
    }

    @Test
    public void testToStringWithInvalidDeadline() {
        Deadline deadline = new Deadline("Submit report", "invalid-date");
        assertEquals("[D][ ] Submit report (by: invalid-date)", deadline.toString());
    }
}
