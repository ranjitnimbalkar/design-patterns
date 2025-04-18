# Definition

**Strategy design pattern defines a family of algorithms,
encapsulate each one, and makes them interchangeable.
Strategy lets the algorithm vary independently of client
that uses it.**

# **Design Principle**
1. [x] Identify the aspect of your application that vary and separate
      them what stays same 

     + Take the part that vary and encapsulate them, so that later
       you can alter or extend the part that vary without affecting those
       don't
      
2. [x] Program to an interface, not an implementation

    + "Program to an interface" really means "Program to Supertype"

3. [x] Favour composition over inheritance

    + you can change composed object at runtime
