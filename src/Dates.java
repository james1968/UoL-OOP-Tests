public class Dates {
    public int day;
    public int month;

    int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 01};

    Dates( int d, int m )
    {
        this.day = d;
        this.month = m;
    }

    void addDays( int n )
    {
        if (this.month > 12) {
            this.day = 1;
            this.month = 1;
        }
        this.day += n;
        if (this.day > daysInMonth[this.month -1]) {
            this.day = this.day % daysInMonth[this.month -1];
            this.month += 1;
        }
        if (this.month > 12) {
            this.day = 01;
            this.month = 01;
        }
    }

    public String toString()
    {
        String ans = String.format("%02d", this.day) + "/" + String.format("%02d", this.month);
        return ans;
    }
}
