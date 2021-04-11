

ThreadLocal allows us to store data that will be **accessible only** by **a specific thread**.

## Storing User Data in a Map

`com.d.multithreading.threadlocal.baeldung.ThreadLocalIntegrationTest` shows how we could implement this **without** ThreadLocal.

As you can see, thread can access other threads' data.





> The content and code in this package is base on baelung's tutorial https://www.baeldung.com/java-threadlocal