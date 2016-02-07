/**
 * Creating a library card, issues a card and sets to false if the card is expired 
 * 
 * Sheel Shah

 */


public class LibraryCard
{

    private int borrow, maxBooks;
    private String card;
    
     /*
     * Constructor for objects of class LibraryCard
     */
     public LibraryCard(int card, int maxBooks)
    {
     borrow = 0;
     this.maxBooks = maxBooks; 
     this.card = "CardID" + card;
    }

    /* Incrememets borrow by one
     * 
     */
    public void swipe()
    {  
        borrow++;
    }
      
    /* If borrow is greater than the maxBooks value then it returns card is expired. 
     * 
     */
    public boolean expired()
    {
       return (borrow >= maxBooks);
    }
     
     /* Returns the cardID of card 
     *  
     */  
     public String getCardRef()
    {
       return card;
    }
    
    /* Prints the library card ID and how many books on left the user is allowed to take out
     *
     */ 
    public void describe()
    { 
         System.out.println("Library card" + " " + " " + card + " " +  "with"  + " " + (maxBooks - borrow) + " " + "books left!");
    }      
}
       
