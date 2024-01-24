package Singleton_Design;


public class Singleton1 {
    public static void main(String[] args) {
//        Abc ob=new Abc();//Created private constructor sor we can not create id
        //So the Only Way to Create a constructor is to call the getInstance() Methode
        Abc1 ob=Abc1.getInstance();//Same Instance is created again and again
        Abc1 ob1=Abc1.getInstance();//Here also same instance is created
    }
}

class Abc1{
    //Steps to created Singleton class by which we can get only one instance of a class
    public static Abc1 ob;
    private Abc1(){
        System.out.println("Instance Created");
    }
    public static Abc1 getInstance(){//Method is Abc Type because we want to return the object
        if(ob==null)//Checking if it is calling first time or not
        {
            ob=new Abc1();

        }
        return ob;
    }
}
