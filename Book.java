/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Trevor McQueen)
 * @version (9/22/2025)
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
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
    



        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        this.courseText = courseText;
        
    }
        
    

     public String getAuthor() {
        return author;
    }
    
     public String bookTitle() {
         return title; 
     }
     
     public int getPages() {
        return pages;  
     }
     
     public void printDetails() {
         String ref;
         if (refNumber.length() > 0) {
             ref = refNumber;
            } else { 
                ref ="zzz";
    
            }
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
            System.out.println("Ref: " + ref);
            System.out.println("Times Borrowed: " + borrowed);
            
            if (courseText) {
                System.out.println("Used as Course Text: Yes");
            } else {
                System.out.println("Used as Course Text: NO");
            }
                
                
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



