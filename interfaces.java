public interface Comparable{
    public int compareTo (Book x);
}

public class Book implements Comparable{
    int numberOfPages;
    String title;
    String author;

    @Override
    public int compareTo(Book x) {
        if(this.numberOfPages != x.numberOfPages)
            return this.numberOfPages - x.numberOfPages;
        if(!this.title.equals(x.title))
            return this.title.compareTo(x.title);
        return this.author.compareTo(x.author);
    }
}

// not sure if this is correct
