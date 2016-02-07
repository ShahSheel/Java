

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void FinishedStudiesTrue()
    {
        Library library1 = new Library(10);
        Library library2 = new Library(1);
        Student student1 = new Student("Ramiz", library2);
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.finishedStudies();
        assertEquals(false, student1.finishedStudies());
        student1.describe();
        student1.study();
        student1.describe();
        assertEquals(false, student1.finishedStudies());
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.describe();
        student1.study();
        student1.describe();
        assertEquals(true, student1.finishedStudies());
        student1.study();
        student1.describe();
        assertEquals(true, student1.finishedStudies());
        student1.study();
        student1.describe();
        assertEquals(true, student1.finishedStudies());
    }

    @Test
    public void FinishedStudiesFalse()
    {
        Library library1 = new Library(1);
        Student student1 = new Student("Bob", library1);
        student1.study();
        student1.study();
        assertEquals(false, student1.finishedStudies());
    }

    @Test
    public void CloseBook()
    {
        Library library1 = new Library(10);
        Student student1 = new Student("Ramiz", library1);
        library1.describe();
        student1.study();
        student1.describe();
        library1.describe();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.describe();
        library1.describe();
        assertEquals(true , student1.finishedStudies());
    }
}





