

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTest
{
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
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
    public void LibraryCardIssue()
    {
        Library library1 = new Library(1);
        LibraryCard libraryC1 = library1.issueCard();
    }

    @Test
    public void IssueCardNull()
    {
        Library library1 = new Library(10);
        assertNotSame(null, library1.issueCard());
        library1.describe();
        assertNotSame(null, library1.issueCard());
    }

    @Test
    public void borrowandReturnBook()
    {
        Library library1 = new Library(10);
        TextBook textBook1 = new TextBook("Ramiz", 10);
        LibraryCard libraryC1 = new LibraryCard(10, 10);
        TextBook textBook2 = library1.borrowBook(libraryC1);
        assertNotNull(textBook2);
        library1.returnBook(textBook2);
    }
}









