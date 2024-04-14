class Vector {
    private int x;
    private int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Vector add(int a, int b) {
        Vector addVector;
        this.x = this.getX() + a;
        this.y = this.getY() + b;
        addVector = new Vector(this.x, this.y);
        return addVector;
    }
    public Vector add(Vector v) {
        Vector addVector;
        int x = this.getX() + v.getX();
        int y = this.getY() + v.getY();
        addVector = new Vector(x, y);
        return addVector;
    }

    public Vector sub(int a, int b) {
        Vector addVector;
        this.x = this.getX() - a;
        this.y = this.getY() - b;
        addVector = new Vector(this.x, this.y);
        return addVector;
    }

    public Vector sub(Vector v) {
        Vector addVector;
        int x = this.getX() - v.getX();
        int y = this.getY() - v.getY();
        addVector = new Vector(x, y);
        return addVector;
    }

    public Vector mult(int x) {
        Vector addVector;
        this.x = this.getX() * x;
        this.y = this.getY() * x;
        addVector = new Vector(this.x, this.y);
        return addVector;
    }

    public int dot(Vector v) {
       int ans = (this.getX() * v.getX()) + (this.getY() * v.getY());
       return ans;
    }

    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }


}