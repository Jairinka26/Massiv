public class Massiv {
    public void min (int m1[]){
        int i,min=m1[0];
        for (i=1; i< m1.length; i++ ){
            if (min>m1[i])
                min=m1[i];
        }
        System.out.println("Минимальный элемент массива: " + min);
    }

    public void max (int m1[]){
        int i,max=m1[0];
        for (i=1; i< m1.length; i++ ){
            if (max<m1[i])
                max=m1[i];
        }
        System.out.println("Максимальный элемент массива: " + max);
    }

    public void min_i (int m1[]){
        int i,min=m1[0],min_i=0;
        for (i=1; i< m1.length; i++ ){
            if (min>m1[i]) {
                min = m1[i];
                min_i = i;
            }
        }
        System.out.println("Индекс минимального элемента массива: " + min_i);
    }
}
