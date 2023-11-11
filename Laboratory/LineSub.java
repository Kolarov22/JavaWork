package Laboratory;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public String toString() {
        return "The line begins at " + super.toString() + " and ends at " + end.toString();
    }
    public Point getBegin() {
       Point begin = new Point(this.getX(), this.getY());
       return begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        this.setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.getX();
    }

    public int getBeginY() {
        return this.getY();
    }
    
    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.setX(x);
    }

    public void setBeginY(int y) {
        this.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }
    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public int getLengthSub() {
        int length;
        length = (int) Math.sqrt(Math.pow(this.end.getX() - this.getBeginX(), 2) + Math.pow(this.end.getY() - this.getBeginY(), 2));
        return length;
    }

    public double getGradientSub() {
        double gradient;
        gradient = Math.atan2((this.end.getY() - this.getBeginY()), (this.end.getX() - this.getBeginX()));
        return gradient;
    }



    

    
}
