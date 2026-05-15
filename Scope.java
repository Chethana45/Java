import java.util.*;
public class Scope
{
    static int classV=100;
    int instanceV=50;
    public void methodScope(){
        int localV=10;
        System.out.println("Local varaiable:"+localV);
        System.out.println("Instance variable:"+instanceV);
        System.out.println("Class Variable:"+classV);
    }
    public static void staticFunc(){
        System.out.println("Class variable from static function:"+classV);
    }
    public static void main(String[] args){
        Scope obj=new Scope();
        obj.methodScope();
        staticFunc();
    }
}

