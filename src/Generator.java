public class Generator {
    public int[] generator() {
        int i, m[];
        m = new int[10];
        for (i = 0; i < 10; i++) {
            m[i] = (int) (Math.random() * 100);
        }
        return m;
    }
}
