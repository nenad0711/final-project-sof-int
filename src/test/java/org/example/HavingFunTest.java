package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HavingFunTest {

    @Test
    void onlyToShowTestingStage() {
        // Arrange
        HavingFun hf = new HavingFun();

        // Act
        int result = hf.multiply(3, 4);

        // Assert
        assertEquals(12, result, "Multiplication result should be 12");
    }
}