package Laboratory;

public class MovieTest 
{
    public static void main(String[] args) 
    {
        Video video = new Video("Freestyle tiganesc", 10);
        Movie movie = new Movie("Home Alone", 24, "Peter Hewitt", "9/10");
        video.show();
        movie.show();
    }    
}
