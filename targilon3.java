class targilon3 {
    private int bar = 0;
    public void baz() {
    bar++;
    }
    public int getBar() {
    return bar;
    }
    public static void main(String[] args) throws InterruptedException {
    targilon3 f = new targilon3();
    Thread[] arr = new Thread[2];
    for (int i = 0; i < arr.length; i++) {
    arr[i] = new Thread(() -> {
    for (int j = 0; j < 10000; j++) {
    f.baz();
    }
    });
    arr[i].start();
    }
    for (int i = 0; i < arr.length; i++) {
    arr[i].join();
    }
    System.out.println(f.getBar());
    }
   }