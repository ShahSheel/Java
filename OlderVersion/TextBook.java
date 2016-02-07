
/**
 * Creating a textbook - returning the title, chapters and chapters read
 * 
 * Sheel Shah
 *
 */
public class TextBook
{
    // instapce variables
    private String title;
    private int chapters, nextChapter;
   
    /*
     * Constructor for objects of class TextBook
     */
    public TextBook(String title, int chapters)
    {
        this.title = title;
        this.chapters = chapters;
        nextChapter = 0;
        
    }

    /* Returns the book title
     * 
     */
    public String getTitle()
    {
       return title;
    }

    /* Increases chapter read by one till it is finished. (Calls the method isFinished()
     * 
     */ 
     public void readNextChapter()
    {  
        if(!isFinished()) 
        {
            nextChapter++;
        }
        
        else 
        {
            System.out.printf("Book has been completed");
        }
    }
    
   
    /* If nextChapter == chapters, then returns true
     * 
     */ 
     public boolean isFinished()
    {
      return (nextChapter == chapters);
    }
    
    /* Closes book and sets nextChapter to 0
     * 
     */ 
      
     public void closeBook()
    {
        nextChapter = 0;
    }
    
    /* Prints the title and chapters read
     *
     */
     public void describe()
    {
    System.out.println(title + " " + "with"  + " " + (chapters-nextChapter) + " " + "chapters" + " " + "left to read!");    
    }
}
