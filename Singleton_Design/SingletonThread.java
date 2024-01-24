package Singleton_Design;


public class SingletonThread {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Abc2 ob=Abc2.getInstance();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Abc2 ob=Abc2.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}

class Abc2{
    //Steps to created Singleton class by which we can get only one instance of a class
    public static Abc2 ob;
    private Abc2(){
        System.out.println("Instance Created");
    }
    public static synchronized Abc2 getInstance(){//Method is Abc Type because we want to return the object
        if(ob==null)//Checking if it is calling first time or not
        {
            ob=new Abc2();

        }
        return ob;
    }
}
