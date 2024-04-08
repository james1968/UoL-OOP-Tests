public class Rectangle {

    int xLowerLeft;
    int yLowerLeft;
    int width;
    int height;

    int xUpperRight;
    int yUpperRight;



    Rectangle( int xLowerLeft, int yLowerLeft, int width, int height)
    {
        this.xLowerLeft = xLowerLeft;
        this.yLowerLeft = yLowerLeft;
        this.width= width;
        this.height = height;
        this.xUpperRight = this.xLowerLeft + width;
        this.yUpperRight = this.yLowerLeft + height;
    }

    Rectangle( int xUpperRight, int yUpperRight )
    {
        this.xUpperRight = xUpperRight;
        this.yUpperRight = yUpperRight;
        this.xLowerLeft = 0;
        this.yLowerLeft = 0;
    }

    public boolean containsPoint( int x, int y )
    {
        if ((x >= this.xLowerLeft && y >= this.yLowerLeft) && (x <= this.xUpperRight && y <= this.yUpperRight)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
    }
    }

    public boolean containsRectangle( Rectangle r )
    {
        if ((this.xLowerLeft <= r.xLowerLeft && this.yLowerLeft <= r.yLowerLeft) && (this.xUpperRight >= r.xUpperRight && this.yUpperRight >= r.yUpperRight)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    public String toString()
    {
        return "(" + this.xLowerLeft + "," + this.yLowerLeft + "), (" + this.xUpperRight + "," + this.yUpperRight + ")";
    }
}
