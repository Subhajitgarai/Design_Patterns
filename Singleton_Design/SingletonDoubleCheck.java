package Singleton_Design;


public class SingletonDoubleCheck{
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

class Abc3{
    //Steps to created Singleton class by which we can get only one instance of a class
    public static Abc3 ob;
    private Abc3(){
        System.out.println("Instance Created");
    }
    public static  Abc3 getInstance(){//Method is Abc Type because we want to return the object
        if(ob==null)//Checking if it is calling first time or not
        {
            synchronized (Abc3.class){
                if(ob==null){
                    ob=new Abc3();
                }
            }

        }
        return ob;
    }
}
