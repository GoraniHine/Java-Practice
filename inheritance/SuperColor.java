package min.inheritance;

class PointC {
    private int x, y;

    public PointC() {
        this.x = 0; this.y = 0;
    }

    public PointC(int x, int y) {
        this.x = x; 
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class SuperC extends PointC {
    private String color;

    public SuperC(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color + ": ");
        showPoint();
    }
}

public class SuperColor {
    public static void main(String[] args) {
        SuperC cp = new SuperC(5, 6, "blue");
        cp.showColorPoint();
    }
}

//여기까지