
public class Room {
    private int rno;
    private String type;
    private double area;
    private boolean ac;

    public void setData(int rno, String type, double area, boolean ac) {
        this.rno = rno;
        this.type = type;
        this.area = area;
        this.ac = ac;
    }

    public void displayData() {
        System.out.println(rno);
        System.out.println(type);
        System.out.println(area);
        System.out.println(ac);
    }

    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setData(10, "aa", 5.5, false);
        room1.displayData();
    }
}
