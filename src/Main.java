public class Main {
    public static void main(String[] args)
    {
        init();
    }

    public static void init(){
        Generator g = new Generator();
        Massiv m=new Massiv();
        int gm[]=g.generator();

        int i;
        for (i=0; i< gm.length; i++ ){
            System.out.print(gm[i]+" ");
        }
        System.out.println();

        m.min(gm);
        m.max(gm);
        m.min_i(gm);

    }
}
