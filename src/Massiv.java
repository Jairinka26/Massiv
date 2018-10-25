public class Massiv {
    public int[] generate (){
        int i, m[];
        m = new int [10] ;
        for (i=0; i < 10; i++){
            m[i]= (int) (Math.random() * 100);
        }

        for (i=0; i< m.length; i++ ){
            System.out.print(m[i]+" ");
        }
        System.out.println();

        return m;
    }

    public void min (int m1[]){
        int i,min=m1[0];
        for (i=1; i< m1.length; i++ ){
            if (min>m1[i])
                min=m1[i];
        }
        System.out.println(min);
    }

    public void max (int m1[]){
        int i,max=m1[0];
        for (i=1; i< m1.length; i++ ){
            if (max<m1[i])
                max=m1[i];
        }
        System.out.println(max);
    }

    public void min_i (int m1[]){
        int i,min=m1[0],min_i=0;
        for (i=1; i< m1.length; i++ ){
            if (min>m1[i]) {
                min = m1[i];
                min_i = i;
            }
        }
        System.out.println(min_i);
    }
}
