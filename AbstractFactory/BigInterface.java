// ISP - Interface Segregation Principle

public abstract interface BigInterface extends NotSoBigInterface1, NotSoBigInterface2 {

}


/*      A
     / \
    B   C
    \   /
      D*/

// MRO Inheritance
// Same interface signature implementation
// Purpose of private methods in interface (Java|C#|...)

/*

class A{}
class B extends A{}
class C extends A{}
class D extends B,C {}*/
