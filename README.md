# Practical9

###Focused on Performance Testing on various Programs

####**Practical9_1**: Iteration vs Recursion performance 
Here we are testing on Iteration and Recursion with the help of nanoTime() method from System class. we test it with the random values generated using nanoTime() itself within the range of 1-100. Calculated their average time and compared to them. Check this multiple times so can come up to final conclusion. Most of the time Iteration come faster and only in some cases recusrion. But the margin was too large so we can conclude that Iteration is faster than Recursion. 

####**Practical9_2**: String Concatenation Performance
Here we are testing the performace of String, StringBuffer, and StringBuilder class. We are concating randomly generated characters to String and appending them to StringBuffer and StringBuilder and checking there average time. Since String is immutable at each concatenation creates new string which is time consuming and for StringBuffer as it is thread safe for this it requires extra time for safety checking and in case of StringBuilder it is not thread safe it avoids safety checking this is why we get StringBuilder as the fastest.  


