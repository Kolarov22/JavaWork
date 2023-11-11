package Laboratory;
public class Movie extends Video 
{
    private String director;
    private String rating;

    public Movie (String title, int length, String director, String rating)
    {
        super(title, length);
        this.rating = rating;
        this.director = director;
    }

    public void show()
    {
        System.out.println(this.director + " " + this.rating);
        super.show();
    }
}
