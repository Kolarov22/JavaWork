package Homeworks;

public class University {
    private String name;
    private String location;
    private Author[] authors;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
        this.authors = new Author[0];
    }

    public void addAuthor(Author a) {
        Author temp[] = new Author[authors.length + 1];
        for (int i = 0; i < authors.length; i++)
            temp[i] = authors[i];
        temp[authors.length] = a;
        authors = temp;
    }

    public double computeScore() {
        double sum = 0;
        for (Author author : authors) {
            sum += author.computeScore();
        }
        return sum;
    }
}