Local classes can most definitely reference instance variables. The reason they cannot reference non final local variables is because 

the local class instance can remain in memory after the method returns. When the method returns the local variables go out of scope, so <u>a copy of them is needed</u>. 

If the variables weren’t final then the copy of the variable in the method could change, while the copy in the local class didn’t, so they’d be <u>out of sync</u>.

Anonymous inner classes require final variables because of the way they are implemented in Java. An anonymous inner class (AIC) uses local variables by creating a private instance field which holds a copy of the value of the local variable. <u>The inner class isn’t actually using the local variable, but a copy</u>. It should be fairly obvious at this point that a “Bad Thing”™ can happen if either the original value or the copied value changes; there will be some unexpected data synchronization problems. In order to prevent this kind of problem, Java requires you to mark local variables that will be used by the AIC as final (i.e., unchangeable). This guarantees that the inner class’ copies of local variables will always match the actual values.

> https://stackoverflow.com/a/7423059/986966