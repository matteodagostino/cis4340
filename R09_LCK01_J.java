private final Boolean initialized = Boolean.FALSE;
 
public void doSomething() {
  synchronized (initialized) {
    // ...
  }
}
