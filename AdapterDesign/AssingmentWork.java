package AdapterDesign;

public class AssingmentWork {
    private Pen p;
    public Pen getP(){
        return p;
    }
    public void  setP(Pen p){
        this.p=p;
    }
    public void writeAssigment(String str)
    {
            p.write(str);
    }
}
