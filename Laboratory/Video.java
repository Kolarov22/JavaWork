package Laboratory;
public class Video
{
    private String title;
    private int length;
    private boolean avabile;

    public Video(String title)
    {
        this.title = title;
        this.length = 90;
        this.avabile = true;
    }

    public Video(String title, int length)
    {
        this.title = title;
        this.length = length;
        this.avabile = true;
    }

    public void show()
    {
        System.out.println(this.title + " " + this.length + " " + this.avabile);
    }
}