import Lectures.Polymorphism.*;

public class Main {

    public static void main(String[] args) {





    }


    /*
        Class: The blueprint of an object.
        Instantiate: Create a copy of blueprint.
        Object: Has own location in memory.
        Reference: Memory address path. Ie; Sharing a home address, same building, multiple references.
                   Can be passed as parameters to constructors and methods.


        Constructors: Used to instantiate object  -> Cannot have both super() and this().
        variables/initialize object/class.           Usable to prevent code duplication
                                                     with chaining.

        Members: variables/methods
        this: Used to call current class members. -> Common in constructors/setters.
                                                     Conflicts without "this" in setters. No conflict with getters.
        super: To access or call the parent class -> Common with method Overriding
               members.                              Calls method with same name from parent class. Without "super",
                                                     it would be recursive calling itself;

        this(): Used to call a constructor from   -> Used for constructor chaining.
                another Overloaded constructor in
                the same class.
        super(): Used to call parent constructor  -> Java uses default call to super() if not added. Always
                                                     the no-args super inserted by the compiler. All classes
                                                     including abstract, use constructors.
                                                     Abstract: Cannot instantiate class with "new";
       *Note: BOTH MUST be first statement, "this" can be used anywhere except static context.


        Overload: Used to create multiple methods -> Can overload static and instance methods. usually within
                  with same name. Reuse code.        single class, but can be within sub-class.
                                                     Must be same name, have different params.
        Override: Used to define a method in a    -> Extending parent class, subclass inherits derived methods.
                  child class that already exists    Also known as "Runtime Polymorphism"/"Dynamic Method Dispatch"
                  in the parent class with the       -Can only Override instance methods. -Must be same name/args
                  same signature(name/args)          -Return can be subclass -Can't have a lower access modifier
                                                     -Only inherited methods -Cannot override constructors/private/final
                                                     -Use super.methodName() to call SUPERCLASS version.
                                                     -IS-A relationship Ie: child/parent
        Covariant Return Type: Return type in a
                  child/parent relationship.

        Inheritance: Objects containing an IS-A.  -> Ie; A car IS-A vehicle.
                     relationship.

        Composition: Deals with objects that      -> Ie; A computer HAS-A motherboard. ** Generally preferred
                     have a HAS-A relationship.

        Encapsulation: Isolating code within the  -> Ie; Using private access modifiers for class properties
                       respective scope.                 w/ getter and setters.

        Polymorphism: The mechanism in OOP that   -> Ie; Overriding allows multiple uses
                      allows actions to behave           using same method.
                      differently based on the
                      object.

     */


}
