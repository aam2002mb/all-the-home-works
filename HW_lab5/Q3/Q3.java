package HW_lab5.Q3;

public class Q3 {
    private int num;
    private int udo;

    public Q3(){
        num=0;}

    public void click(){num=num+1;
    udo=num;}

    public int getClick(){return num;}

    public void undo(){
        if(num==udo)
        {num=num-1;

        }

    }

}
