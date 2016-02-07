import java.util.ArrayList;
import java.util.Random;


/**
 * User enteres student size and number of students. It will then go through a random function that will remove the student when they have finished studying an print out conditial statements.
 * 
 * @author (Sheel Shah) 
 * @version (10/12/2015)
  * The Class College.
 */
public class College{

    /** The students. */
    private ArrayList<Student> students;
    private Library libraryName;
    private Random randomNumber;
   
    /**
     * Instantiates a new college. Initializing library with amount of textbooks and adds the students.
     *
     * @param numStudents the num students
     * @param numTextbooks the num textbooks
     */
    public College(int numStudents, int numTextbooks){
        libraryName = new Library(numTextbooks);
        students = new ArrayList<Student>(numStudents);
        randomNumber = new Random();
        for(int i = 0; i < numStudents; i++){
            Student s;
            s = new Student("Student " + (i + 1) , libraryName);
            students.add(s);
        }

    }

    
    private void nextStep(){
        if(students.size() == 0){
            System.out.println("Everything has gone very quiet!");
        }
        else{
            int x = randomNumber.nextInt(students.size());
            Student studentstudy;
            studentstudy = students.get(x);
            if(studentstudy.finishedStudies()){
                //students.set(x, null);
                System.out.println("The student has graduated and left the college!");
                students.remove(x);
            }

            else{
                studentstudy.study();
            }

        }
    }

    /**
     * Run college and calls nextStep where it prints statements. If student size is zero otherwise gets the student 
     * forces them to study till they have finished and removes them from student size.
     *
     * @param nSteps the n steps
     */
    public void runCollege(int nSteps){
        for(int i=0; i <= nSteps ; i++){ 
            System.out.println("Step " +  i);
            describe();
            nextStep();
        }
    }

    /**
     * Prints out the student size along with library describe. This shows amount of borrowers and amount of books.
     */
    public void describe(){
        System.out.println("The college currently has " + students.size() + " hard-working students");
        libraryName.describe();
    }

    /**
     * The main method. User can enter student size, textbooks amount and nsteps. 
     *
     * @param args the arguments
     */
    public static void main(String[] args){
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        College arrayCollege = new College(a,b);
        arrayCollege.runCollege(c);

    }
}