 
/**
 * Library system, issue a card, borrow a book and return a book. 
 *
 * Sheel Shah
 * 
 */
public class Library
{
    // instance variables - replace the example below with your own
    private TextBook[] bookShelf;
    private int nextBook, borrow;
 
    /* Constructor - User enters the size which sets the array size. Array is then filled up with books using a for loop
     * 
     */
    public Library(int size)
    {
        bookShelf = new TextBook[size];
        borrow = 0;
        for(int i = 0; i < bookShelf.length; i++)
        {
         bookShelf[i] = new TextBook("Book " +( i + 1 ), 10);
        }     
    }
 
    /* Method Issues a card by called the LibraryCard method
     * 
     */
     public LibraryCard issueCard()
    {
       borrow ++;
       LibraryCard newcard;
       newcard = new LibraryCard(borrow, 10);
       return newcard; 
    }
 
    /* Method, borrowing a book by called the Library card method
     * 
     */
    public TextBook borrowBook(LibraryCard card)
    {
        TextBook book = null;       
        if(!card.expired() && (nextBook < bookShelf.length)) 
        {
         book = bookShelf[nextBook];
         bookShelf[nextBook] = null;
         nextBook++;
         card.swipe();
        }
        return book;
    }
   
    /* Returning a book, nextbook decreases and is then passed to book.
     * 
     */
     public void returnBook(TextBook book)
    {
        nextBook--;
        bookShelf[nextBook] = book;
    }
 
    /* Describes how many books and library cards have been taken out.
     * 
     */
    public void describe()
    {  
        System.out.println("The library has" + " " + (bookShelf.length - nextBook) + " " + "books left on the shelf and has issued" + " " +  borrow + " " +  "library cards");        
    }
}