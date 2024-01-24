package AdapterDesign;

public class School {
    public static void main(String[] args) {
        Pen p=new PenAdapter();
        AssingmentWork aw=new AssingmentWork();
        aw.setP(p);
        aw.writeAssigment("I am bit tried to write on Assingment");
    }
}
