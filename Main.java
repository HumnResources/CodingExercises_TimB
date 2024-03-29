
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

        Autoboxing: Converting a type to that of  -> Ie; Converting type int -> Integer: Integer.valueOf(n);
                    a 'wrapper' class.                   Integer myIntVal = 45;

        Unboxing: Converting a class down to that -> Ie; Converting type Integer -> int: n.intValue();
                  of its primitive type.'Unwrapping'     int myInt = myIntVal;

        Interface: Used to define a common behaviour,
                   between multiple objects. Creates
                   a contract.

        Abstraction: Defining the required        -> Ie; Focusing on WHAT needs to be done not HOW to do it.
                     functionality without               Interfaces.
                     implementing the details.

        Abstract Class: Defines a required method
                        but doesn't define method
                        body.

        Modules: Designed for reliable config    -> Ie; A "container" of packages.  module-info.java
                 while being reliable and include       (open) module academy.learnprogramming.common (name) {
                 encapsulation etc... Java 9            0+ statements:
                 JPMS - JavaModuleSystem                    exports, opens, requires, uses, provides
                                                        }
        Platform Modules: Provide scalable JRE. -> Ie; Java.IO...
                          Prefixed with java.

        Normal Module: Grants access at compile time and run time in only those packages explicitly exported.
                       Has module descriptor file, declared using 'module', does not export by default, basic or open

        Automatic Module: Created after adding JAR file to module path. Not explicitly declared by dev, created by JRE.
                          Requires all platform modules, own modules, and other automatic modules.
                          Exports all packages by default, useful for third-party code && Migration to JAVA 9

        Open Module: Grants access at compile time to types in only those exported, BUT
                    grants access at run time to types in ALL its packages.
                    All packages were exported.
                    Some libs require open module.
                    Reads all modules
                    Open module makes all packages inside accessible for deep reflection.
                    'open' Keyword can also declare packages as open for reflection.
                    Used in JavaFX apps with FXMLLoader class.

        NOTE: Named module CANNOT require unnamed module.

        Aggregator Module: Collect and export contents of their modules. "Aggregate" their modules.
                           Exist for convenience
                           Usually no code, just module descriptor
                           Ie; When a few modules depend on three modules, we can create an aggregator
                           module for those three modules and that way our modules can depend on a
                           single (the aggregator) module. -> Java.se

        Module Path: It can represent;
                     A path to a sequence of folders containing modules.
                     A path to a modular JAR file.
                     A path to a JMOD file (extended JAR)

        Class Path: Represents a sequence of JAR files.
     */


}
