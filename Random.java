public final class Random {
    private static Random r = null;
    private Random(){}
    public int getNextRandom(int n){
        return 1 + (int) (Math.random() * n);
    }
    public static Random getRandom(){
        if(r == null)
            r = new Random();
        return r;
    }
}
