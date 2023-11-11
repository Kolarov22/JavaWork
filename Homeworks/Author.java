package Homeworks;

public class Author {
    private String name;
    private Publication[] publications;

    public Author(String name) {
        this.name = name;
        publications = new Publication[0];
    }

    public void addPublication(Publication p) {
        Publication temp[] = new Publication[publications.length + 1];
        for (int i = 0; i < publications.length; i++)
            temp[i] = publications[i];
        temp[publications.length] = p;
        publications = temp;
    }

    public double computeScore() {
        double sum = 0;
        for (Publication publication : publications) {
            sum += publication.computeScore();
        }
        return sum;
    }

}
