package Standard;

import java.util.Objects;

public class Book extends LendingItem {

    private String isbn;
    private String title;
    private String authorFisrtName;
    private String authorlastName;

    public Book(String isbn, String title, String authorFisrtName, String authorlastName) {
        this.isbn = isbn;
        this.title = title;
        this.authorFisrtName = authorFisrtName;
        this.authorlastName = authorlastName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFisrtName() {
        return authorFisrtName;
    }

    public String getAuthorlastName() {
        return authorlastName;
    }

    @Override
    public int getNumCopiesInLib() {
        return 0;
    }

    @Override
    public void setNumCopiesInLib(int numCopiesInLib) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn.equals(book.isbn);

    }

}
