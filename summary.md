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