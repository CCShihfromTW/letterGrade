package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.letterGrade.letterGrade;
public class TestTest {
    @org.junit.jupiter.api.Test
    public void TestEquivalencePartitioning() {
        char level = letterGrade(-1);
        assertEquals('X', level);
        level = letterGrade(101);
        assertEquals('X', level);
        level = letterGrade(0);
        assertEquals('F', level);
        level = letterGrade(10);
        assertEquals('F', level);
        level = letterGrade(20);
        assertEquals('F', level);
        level = letterGrade(30);
        assertEquals('F', level);
        level = letterGrade(40);
        assertEquals('F', level);
        level = letterGrade(50);
        assertEquals('F', level);
        level = letterGrade(60);
        assertEquals('D', level);
        level = letterGrade(70);
        assertEquals('C', level);
        level = letterGrade(80);
        assertEquals('B', level);
        level = letterGrade(90);
        assertEquals('A', level);
        level = letterGrade(100);
        assertEquals('A', level);
    }
    @org.junit.jupiter.api.Test
    public void TestboundaryValue() {
        char level = letterGrade(-1);
        assertEquals('X', level);
        level = letterGrade(101);
        assertEquals('X', level);
        level = letterGrade(0);
        assertEquals('F', level);
        level = letterGrade(10);
        assertEquals('F', level);
        level = letterGrade(59);
        assertEquals('F', level);
        level = letterGrade(60);
        assertEquals('D', level);
        level = letterGrade(69);
        assertEquals('D', level);
        level = letterGrade(70);
        assertEquals('C', level);
        level = letterGrade(79);
        assertEquals('C', level);
        level = letterGrade(80);
        assertEquals('B', level);
        level = letterGrade(89);
        assertEquals('B', level);
        level = letterGrade(90);
        assertEquals('A', level);
        level = letterGrade(99);
        assertEquals('A', level);
        level = letterGrade(100);
        assertEquals('A', level);
    }
}