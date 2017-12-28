package hu.nyirszikszi.holapont;

public class HolAPont {
    private int x;
    private int y;

    public HolAPont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String hely() {
        String helye = "";

        if (this.x == 0 && this.y == 0) {
            helye += "A pont (" + getX() + ", "+ getY() + ") az origón szerepel.";
        }
        else if (this.x > 0 && this.y > 0) {
            helye += "A pont (" + getX() + ", "+ getY() + ") az 1. negyedben szerepel.";
        }
        else if (this.x < 0 && this.y > 0) {
            helye += "A pont (" + getX() + ", "+ getY() + ") a 2. negyedben szerepel.";
        }
        else if (this.x < 0 && this.y < 0) {
            helye += "A pont (" + getX() + ", "+ getY() + ") a 3. negyedben szerepel.";
        }
        else if (this.x > 0 && this.y < 0) {
            helye += "A pont (" + getX() + ", "+ getY() + ") a 4. negyedben szerepel.";
        }

        return helye;
    }
}