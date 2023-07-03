public final class Randomizer {
    private static Randomizer r = null;
    private Randomizer(){}
    public int getNextRandom(int n){
        return 1 + (int) (Math.random() * n);
    }
    public static Randomizer getRandom(){
        if(r == null)
            r = new Randomizer();
        return r;
    }
}
