class targilon6 {
    private int bar = 0;
    public void baz() { bar++; }
    public int getBar() { return bar; }
    public static void main(String[] args) throws InterruptedException {
    final long start = System.currentTimeMillis();
    targilon6 f = new targilon6();
    Thread[] arr = new Thread[10];
    for (int i = 0; i < arr.length; i++) {
    arr[i] = new Thread(() -> {
    for (int j = 0; j < 10000000; j++) {
    f.baz();
    }
    });
    arr[i].start();
    }
    for (int i = 0; i < arr.length; i++) {
    arr[i].join();
    }
    System.out.println(f.getBar() + " " + (System.currentTimeMillis() - start));
    }
   }