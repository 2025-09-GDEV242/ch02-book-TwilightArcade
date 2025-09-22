/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private final boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText){
    



        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = courseText; 
        
    }

     public void bookAuthor() {
        System.out.println (author);
    }
    
     public void bookTitle() {
         System.out.println (title);
     }
     
     public int getPages() {
        return pages;  
     }
     
     public void printDetails() {
         String ref = (refNumber.length() > 0) ? refNumber : "zzz";
         System.out.println ("Title: " + title +
                             ", Author: " + author +
                             ", Pages: " + pages +
                             ", Ref:" + ref +
                             ", Times Borrowed:" + borrowed + 
                             ", Used as Course Text: " + (courseText ? "Yes" : "No"));
     }
     
     public void setRefNumber(String ref) { 
         if (ref.length() >= 3) {
             refNumber = ref;
            } else { 
                System.out.println("Error: Must be atleast 3 characters long.");
                
         }
        }
        
     public String getRefNumber(){
         return refNumber;
     }
     
     public void borrow() {
         borrowed++;
     }
     
     public boolean isCourseText() {
         return courseText;
     }
}    



