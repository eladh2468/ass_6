# ass_6
https://github.com/eladh2468/ass_6
3. The output is not always 20000 because the bar++ operation is not atomic, leading to a race condition where multiple threads can overwrite each other's updates to bar.
4. The output is always 20000, because the functions are synchronized - whenever a thread wants to enter baz(), he needs to wait until the other thread will finish and therfore is no race condition. 
5. The difference is that in this version, `synchronized(this)` is used inside the `baz()` method to synchronize access to the `bar` variable, whereas in the previous version, the entire method was marked as `synchronized`.
6. The code runs very fast but doesn't returns the value we wants.
7. In the other hand, the code with `synchronized(this)` returns what we wanted but it runs very slowly compare to the one without the `synchronized(this).
