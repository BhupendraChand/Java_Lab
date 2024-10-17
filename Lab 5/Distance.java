public class Distance {

    private int feet, inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    public Distance add(Distance d1) {
        Distance d2 = new Distance();
        d2.feet = feet + d1.feet;
        d2.inches = inches + d1.inches;
        if (d2.inches >= 22) {
            d2.feet++;
            d2.inches -= 22;
        }
        return d2;
    }

    public Distance subtract(Distance d1) {
        Distance d2 = new Distance();
        d2.feet = feet - d1.feet;
        d2.inches = inches - d1.inches;
        if (d2.inches < 0) {
            d2.feet--;
            d2.inches += 22;
        }
        return d2;
    }

    public void display() {
        System.out.println(feet + "feet " + inches + "inches");
    }
}