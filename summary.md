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

**should_get_method_name_in_stack_frame**
1. the use of stacktrace to get what class and method the error occurred. https://www.geeksforgeeks.org/method-class-getname-method-in-java/
2. 
3. Throwable class can actually get the class and method of the when throwing an exception with the use of stacktrace, so by using it then I can get expected output