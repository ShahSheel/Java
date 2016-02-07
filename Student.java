
/**
 * Student class forces the student to study and return true or false to show whether they have finished or not.
 * 
 * @author (Sheel Shah) 
 * @version (10/12/2015)
 */
public class Student{
    
    private String studentName;
    private Library studentJoin;
    private LibraryCard studentCard;
    private TextBook studentBookBorrowed;

    
    /**
     * Instantiates a new student, name is passed into studentName along with library being passed into studentJoin and the amount of books is set to null.
     *
     * @param name the name
     * @param library the library
     */
    public Student(String name, Library library){
        studentName = name;
        studentJoin = library;
        studentCard = studentJoin.issueCard();
        studentBookBorrowed = null;

    }

   
    /**
     * Finished studies, returns true if the student has finished otherwise false.
     *
     * @return true, if successful
     */
    public boolean finishedStudies(){
        return(studentBookBorrowed == null)  && (studentCard.expired());
    }      

    /**
     * Invokes Study. Forces the student to study if they do not have a book, read next chapter if they have a book and not finished itor close the book and return it if they 
     * have finished the book.
     *
     */
    public void study(){
        if((studentBookBorrowed == null)){
            studentBookBorrowed = studentJoin.borrowBook(studentCard);
        }
        else if(!studentBookBorrowed.isFinished()){
            studentBookBorrowed.readNextChapter();                
        }
        else{
            studentBookBorrowed.closeBook();
            studentJoin.returnBook(studentBookBorrowed);
            studentBookBorrowed= null;
        }

    }

    /**
     * Prints out a condition statements. If the student does not have a book, a statement if  student has a book  along with a description of the textbook, ie: Title, Chapters left + read. 
     * Otherwise prints out Book has been finished if finished is true.
     * 
     */
    public void describe(){
        if(studentBookBorrowed == null){
            System.out.printf("Student %s does not have a book and",studentName);
            studentCard.describe();
            //+ " " + studentCard.getCardRef() + " " +  "has an allowance of" + " " + studentCard.);             
        }
        else{

            if (studentBookBorrowed != null){
                System.out.printf("Student %s has a book",studentName);
                studentBookBorrowed.describe();

                if (studentBookBorrowed.isFinished()){
                    System.out.println("Book is finished "); 

                }

            }
            System.out.println("The student is reading a book");
        }
    }
}