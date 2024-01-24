package Singleton_Design;

public class Singleton {
    public static void main(String[] args) {
//        Abc ob=new Abc();//Created private constructor sor we can not create id
        //So the Only Way to Create a constructor is to call the getInstance() Methode
        Abc ob=Abc.getInstance();//Same Instance is created again and again
        Abc ob1=Abc.getInstance();//Here also same instance is created
    }
}

class Abc{
    //Steps to created Singleton class by which we can get only one instance of a class
     static Abc ob=new Abc();//Even if i am not using the following object it is loaded in the memory because it is static
    private Abc(){
        System.out.println("Instance Created");
    }
    public static Abc getInstance(){//Method is Abc Type because we want to return the object
        return ob;
    }
}
