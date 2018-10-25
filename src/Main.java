public class Main {
    public static void main(String[] args)
    {
        init();
    }

    public static void init(){
        Massiv m=new Massiv();
        m.min(m.generate());
        m.max(m.generate());
        m.min_i(m.generate());

    }
}
