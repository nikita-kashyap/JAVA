class Outer
{
void f1()
{
System.out.println("Welcome to Outer class!!");
}
class Inner
{
void f2()
{
System.out.println("Welcome to Inner class!!");
}
}
}
class Test
{
public static void main(String args[])
{
Outer o1 = new Outer();
Outer.Inner o2 = o1.new Inner();
o1.f1();
o2.f2();
}
}
//static inner class
/*
class Outer
{
static class Inner
{
void f1()
{
System.out.println("Hello Friends!!");
}
}
}
class Test
{
public static void main(String args[])
{

Outer.Inner o1 = new Outer.Inner(); // to create object of static // inner class
o1.f1();
}

}*/
//will it work or not? won't work.
/*
class Outer
{
static class Inner
{
void f1()
{
System.out.println("Hello Friends!!");
}
}
}
class Test
{
public static void main(String args[])
{
Outer o1 = new Outer();
Outer.Inner o2 = new Outer.Inner();

o1.f1(); // Will it work?
o2.f1();
}
}*/
//Outer class member through Inner class object-not allowed
/*
class Outer
{
void f1()
{
System.out.println("Welcome to Outer class!!");
}
static class Inner
{
void f2()
{
System.out.println("Welcome to Inner class!!");
}
}
}
class Test
{
public static void main(String args[])
{
Outer o1 = new Outer();
Outer.Inner o2 = new Outer.Inner();

o2.f1(); // Outer class member through Inner class object-not allowed
}
}*/

//working
/*class Outer
{
void f1()
{
System.out.println("Welcome to Outer class!!");
}
static class Inner
{
void f2()
{
System.out.println("Welcome to Inner class!!");
}
}
}
class Test
{
public static void main(String args[])
{
Outer o1 = new Outer();
Outer.Inner o2 = new Outer.Inner();
o1.f1();
o2.f2();
}
}*/