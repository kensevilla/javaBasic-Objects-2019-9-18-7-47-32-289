**should_customize_exception**
1. how inheritance works. https://www.tutorialspoint.com/java/java_inheritance.htm
2. at first I tried to throw the exception in the implementation of the method so I created an infinite loop.
3. since the class StringFormatException's parent is Exception which parent is Throwable, and has the same signature as my parameter. I can just use it's implementation since I just need to throw the exception. With the use of super(), I can immediately call the constructor of the parent class. 
4. None

**should_customize_exception_continued**
1. how inheritance works. https://www.tutorialspoint.com/java/java_inheritance.htm
2. 
3. since the class StringFormatException's parent is Exception, and Exception class has a constructor that has the same signature as the one I'm passing and does what I want. Then I can just call it again with super() with the parameters that it needs. 
4. None

**should_be_careful_of_the_order_of_finally_block**
1. the use of finally. https://www.javatpoint.com/finally-block-in-exception-handling
2. since Integer.MAX_VALUE is not the same as the expected output
3. when using finally block, it will always execute after the try and catch block whether there is an exception or not. so in this case, since the parameter's value passed is 2, it will return 0 based on the logic in the finally.  
4. None

**should_use_the_try_pattern**
1. the use of try with resource statement. https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
2. I assumed that the value closableStateReference.isClosed() is false since close() method was never called.
3. since it's using try with resource statement then it will always close the resource after the try block. in this case close() method is overridden to set the reference to close which is why closableStateReference.isClosed() will return true.
4. None

**should_call_closing_even_if_exception_throws**
1. the use of try with resource statement. https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
2. I assumed that it will close the first resource which is ClosableWithoutException so I set the expected variable to be "ClosableWithoutException.close", "ClosableWithException.close"
3. when using multiple resources in try, it will first close the last resource to be included to the first one, so in this case the logger will have {"ClosableWithException.close", "ClosableWithoutException.close"}
4. None

**should_be_derived_from_object_class**
1. all class is a subclass of Object class if there is no specified superclass. https://www.geeksforgeeks.org/inheritance-in-java/
2. At first I set the value of expected to a new Object variable.
3. Since SimpleEmptyClass has no defined superclass, getSuperClass() will get Object class as all classes are subclasses of Object class
4. None

**should_call_super_class_constructor**
1. how constructor works. https://www.dummies.com/programming/java/how-to-use-a-constructor-in-java/
2. 
3. since SuperClassWithDefaultConstructor class has a constructor to add in logs, it will first add "SuperClassWithDefaultConstructor.constructor()" before executing the constructor in DerivedFromSuperClassWithDefaultConstructor which is to add "DerivedFromSuperClassWithDefaultConstructor.constructor()"
4. None

**should_call_super_class_constructor_continued**
1. how constructor works. https://www.dummies.com/programming/java/how-to-use-a-constructor-in-java/
2. 
3. since the constructor of DerivedFromSuperClassWithDefaultConstructor that takes arg as parameter will first call the constructor that will takes no arguments, it will add first "SuperClassWithDefaultConstructor.constructor()" and "DerivedFromSuperClassWithDefaultConstructor.constructor()" as explained in the previous test. But since there is no constructor in DerivedFromSuperClassWithDefaultConstructor that matches the argument, it will then just add "DerivedFromSuperClassWithDefaultConstructor.constructor(int)"
4. None

**should_call_super_class_constructor_more**
1. how constructor works. https://www.dummies.com/programming/java/how-to-use-a-constructor-in-java/
2. 
3. since the constructor of DerivedFromSuperClassWithDefaultConstructor that takes String as parameter will first call it's superclass with String as the parameter, it will add "SuperClassWithDefaultConstructor.constructor(String)" and then will proceed to adding "DerivedFromSuperClassWithDefaultConstructor.constructor(String)"
4. None

**should_call_most_derived_methods**
1. how overriding methods work.https://www.geeksforgeeks.org/overriding-in-java/
2. 
3. since DerivedFromBaseClassForOverriding's parent is BaseClassForOverriding, then method getName() can be overridden. So the getName() of DerivedFromBaseClassForOverriding will be excuted.
4. None

**should_call_super_class_methods**
1. how overriding methods and super class work.https://www.geeksforgeeks.org/overriding-in-java/
2. 
3. since the getName() method of DerivedFromBaseClassForOverridingCallingSuper will concat the return of the getName() method of its parent class (BaseClassForOverriding) which is "BaseClassForOverriding" to the string "->DerivedFromBaseClassForOverridingCallingSuper"
4. None

**should_not_make_you_confused**
1. how overriding methods and super class work.https://www.geeksforgeeks.org/overriding-in-java/
2. 
3. Since the variable nested of type NestedDerivedClassWithName is just set to variable derived of type DerivedFromBaseClassWithName, it already has the value of getName() from NestedDerivedClassWithName which is "NestedDerivedClassWithName"
4. None

**should_not_make_you_confused_2**
1. how superclass works. https://www.w3schools.com/java/java_inheritance.asp
2. 
3. Since DerivedFromBaseClassWithName's superclass is BaseClassWithName and it has getName() method and DerivedFromBaseClassWithName does not override it, executing getName() will directly execute the code in BaseClassWithName
4. None

**should_use_instance_of_to_determine_inheritance_relationship**
1. how superclass works. https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch06s01.html
2. 
3. Since NestedDerivedClassWithName is the subclass of DerivedFromBaseClassWithName and DerivedFromBaseClassWithName is the subclass of BaseClassWithName then the variable of type  NestedDerivedClassWithName will be seen as a instance of all the other 2 classes
4. None


**should_use_instance_of_only_in_inheritance_relationship**
1. how superclass works. https://www.oreilly.com/library/view/learning-java-4th/9781449372477/ch06s01.html
2. 
3. Long and Integer classes are both subclasses of Number class but they are not related, therefore variable integer is not an instance of Long
4. None

**should_write_perfect_equals_1**
1. how to use own class declaration
2. 
3. Since PersonForEquals requires name and yearOfBirth, then we can compare the obj being passed to equal() by those fields
4. None

**should_write_perfect_equals_2**
1. how to use own class declaration
2. 
3. Since PersonForEquals requires name and yearOfBirth, then we can compare the obj being passed to equal() by those fields
4. None

**should_write_perfect_equals_3**
1. how to use own class declaration
2. 
3. Since PersonForEquals requires name and yearOfBirth, then we can compare the obj being passed to equal() by those fields
4. None

**should_write_perfect_equals_4**
1. how to use own class declaration
2. 
3. Since PersonForEquals requires name and yearOfBirth, then we can compare the obj being passed to equal() by those fields
4. None

**should_write_perfect_equals_5**
1. how to use own class declaration
2. 
3. Since PersonForEquals requires name and yearOfBirth, then we can compare the obj being passed to equal() by those fields
4. None

**should_write_perfect_equals_6**
1. how to use own class declaration
2. 
3. Since PersonForEquals requires name and yearOfBirth, then we can compare the obj being passed to equal() by those fields
4. None

**should_write_perfect_equals_7**
1. the use of hashcode(). https://www.baeldung.com/java-hashcode
2. At first I do not know how hashcode works
3. since String already has a predefined method hashCode(), I just used that and added it to the yearOfBirth to get the correct value when comparing
4. None

**should_point_to_the_same_object**
1. passing by value or passing by reference. https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
2. 
3. since the Object variable is declared and just set as the value of another Object variable, then the value should just be the same.
4. None

**should_point_to_different_object**
1. passing by value or passing by reference. https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
2. I assumed that it compares the value.
3. since the two variables have different reference, even if it has the same value it will be seen as not equal by assertEquals
4. None

**should_initialized_to_default_value**
1. default value. https://www.tutorialspoint.com/java/java_variable_types.htm
2. 
3. since the default value of String is null, int is 0 and LocalData is null
4. None

**should_pass_by_value**
1. passing by value or passing by reference. https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
2. i expected the value to be 7 since the method is static
3. since it is a primitive type, you have to store the value in order to see the change
4. None

**should_pass_by_value_continued**
1. passing by value or passing by reference. https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
2. 
3. you have to store the value in order to see the change
4. None

**should_modify_internal_state**
1. passing by value or passing by reference. https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
2. 
3. since the variable's value is changed through it's setter, then it will change internally
4. None

**should_choose_method_at_compile_time**
1. use of polymorphism in constructors. https://www.tutorialspoint.com/java/java_polymorphism.htm
2. 
3. since the class has multiple constructors with different arguments, it will automatically execute the constructor that matches the parameter passed
4. None

**should_choose_the_most_specific_overload**
1. use of polymorphism in constructors. https://www.tutorialspoint.com/java/java_polymorphism.htm
2. 
3. since the class has multiple constructors with different arguments, it will automatically execute the constructor that matches the parameter passed
4. None

**should_calling_another_constructor**
1. use of polymorphism in constructors. https://www.tutorialspoint.com/java/java_polymorphism.htm
2. 
3. since the class has multiple constructors with different arguments, it will automatically execute the constructor that matches the parameter passed
4. None

**should_get_initialization_ordering**
1. global variables can initialize methods. https://stackoverflow.com/questions/32558900/are-java-global-variables-guaranteed-to-initialize-first
2. I assumed that the values in logger are those values going through the constructor
3. since the class has global variables that get its values from methods, then those methods will be excuted before the constructor
4. None


**should_get_message_of_var_length_parameters**
1. object with multiple arguments. https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/arguments
2. 
3. since passing multiple objects that can be successfully casted to string. then it will just append the value
4. None

**should_get_message_of_var_length_parameters_2**
1. object with multiple arguments. https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/arguments
2. 
3. since passing multiple objects that can be successfully casted to string. then it will just append the value
4. None


