/**
 * A class that maintains information on a book called Melted Cranberries
 *
 * @author (Matilda Delacourt)
 * @version (09/20/2021)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    //returns the author of this book
    public String getAuthor(){
        return author;
    }
    // returns the title of this book
    public String getTitle(){
        return title;
        
    }
}
