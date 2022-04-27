package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;//imports one static member of that class

//import static day34_GarbageCollection_AccessModifiers.Circle.*;//imports all static members of that class

public class StaticImport {
    public static void main(String[] args) {
        //System.out.println(Circle.pi);
        System.out.println(pi);
    }
}
