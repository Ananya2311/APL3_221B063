
import java.io.*;
class Singleton {

    private static Singleton instance;
    private Singleton()
    {
        System.out.println("Singleton is Instantiated.");
    }
    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}
class Main {
    public static void main(String[] args)
    {
        Singleton.getInstance().doSomething();
    }
}
