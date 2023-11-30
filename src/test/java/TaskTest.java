import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void onlyToShowTestingStage() {
        // Arrange
        Task task = new Task();

        // Act
        int result = task.onlyToShowTestingStage(3, 4);

        // Assert
        assertEquals(12, result, "Multiplication result should be 12");
    }
    }
