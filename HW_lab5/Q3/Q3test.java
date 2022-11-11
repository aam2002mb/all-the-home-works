package HW_lab5.Q3;

public class Q3test {
    public static void main(String[] args) {
        Q3 x = new Q3();
        x.click();x.click();
        x.click();x.click();
        x.click();x.undo();
        x.undo();x.undo();

        System.out.println(x.getClick());




    }
}
