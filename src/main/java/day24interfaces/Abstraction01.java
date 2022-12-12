package day24interfaces;

public abstract class Abstraction01 {

    /*
     "final" keyword in ver important in Java
      1)- "final" keyword can be used for Variables

       public int age =12;

       if you make a variables "final" you can not change its Value
       "final variables" must be initialized.

       2)- "final keyword can be used for methods
            "final method" body can not be overriden and updated

       3)- "final" key word can be used for classes
       "final classes" can not have child classes

       Note; "abstract classes" have something to do for child classes, if there is no child class,
       having " to do list" is not sensible.
       "final classes " can not have child classes, therefore java does not allow to make an abstract class final.


        Note : "final method" body will be under protection by java, coa it should not be updated.
        But Abstract methods do not have body, Java will look for the body to protect when it could not find it will complain
     */
    public int age;
    public static final double pi = 3.14;

    public  abstract int add();




    }


