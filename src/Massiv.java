class Massiv {
     int[] generate (){
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

     void min (int m1[]){
        int i,min=m1[0];
        for (i=1; i< m1.length; i++ ){
            if (min>m1[i])
                min=m1[i];
        }
        System.out.println("Минимальное значение элементов массива "+min);
    }

     void max (int m1[]){
        int i,max=m1[0];
        for (i=1; i< m1.length; i++ ){
            if (max<m1[i])
                max=m1[i];
        }
        System.out.println("Максимальное значение элементов массива "+max);
    }

     void min_i (int m1[]){
        int i,min=m1[0],min_i=0;
        for (i=1; i< m1.length; i++ ){
            if (min>m1[i]) {
                min = m1[i];
                min_i = i;
            }
        }
        System.out.println("Индекс минимального элемента массива: "+min_i);
    }

     void max_i (int m1[]){
        int i,max=m1[0],max_i=0;
        for (i=1; i< m1.length; i++ ){
            if (max < m1[i]) {
                max = m1[i];
                max_i = i;
            }
        }
        System.out.println("Индекс максимального элемента массива: "+max_i);
    }

    void sum (int m1[]){
        int sum=0;
        for (int i = 0; i <m1.length ; i++) {
            if (i%2 == 0)
                sum=sum+m1[i];
        }
        System.out.println("Cумма элементов с нечетными индексами равна "+sum);
    }

    int[] revers (int m1[]){
        int m1_r[] = new int[m1.length];
        int j = m1.length-1;

        for (int i = 0; i <m1.length ; i++) {
            m1_r[j] = m1[i];
            j--;
        }

        System.out.println("Реверс исходного массива:");

        for (int i = 0; i <m1_r.length ; i++) {
            System.out.print(m1_r[i]+" ");
        }

        System.out.println();

        return m1_r;
    }

    void move(int m1[]){
        int m1_m[] = new int[m1.length];
        int j=m1.length/2;

        for (int i = 0; i < m1.length/2; i++) {
            m1_m[i] = m1[j];
            j++;
        }
        j=0;
        for (int i = m1.length/2; i < m1.length; i++) {
            m1_m[i] = m1[j];
            j++;
        }

        for (int i = 0; i <m1_m.length ; i++) {
            System.out.print(m1_m[i]+" ");
        }
        System.out.println();
    }

    void bubble(int m1[]){
        int m, pr=0;
        do {
            pr =0;
        for (int i = 0; i <m1.length-1; i++) {
               if (m1[i] > m1[i+1]){
                   m = m1[i];
                   m1[i]= m1[i+1];
                   m1[i+1] = m;
                   pr++;
               }
            }
        }while(pr !=0);

        System.out.println("Сортировка массива пузырьком");

        for (int i = 0; i <m1.length ; i++) {
            System.out.print(m1[i]+" ");
        }
        System.out.println();
    }

    void select(int m1[]){
        int min,index,m;
        for (int i = 0; i < m1.length -1 ; i++) {
            min=m1[i];
            index=i;
            m=0;
            for (int j = i; j < m1.length ; j++) {
                if (min > m1[j]){
                    min=m1[j];
                    index = j;
                }

                if (index != i){
                    m = m1[i];
                    m1[i]=m1[index];
                    m1[index] = m;
                }
            }

        }

        System.out.println("Сортировка массива выбором");

        for (int i = 0; i <m1.length ; i++) {
            System.out.print(m1[i]+" ");
        }
        System.out.println();

    }

    void past (int m1[]){
        int m1_p[] = new int[m1.length];
        int j=0;
        m1_p[0]=m1[0];
        for (int i = 1; i < m1.length-1 ; i++) {
            if (m1[i] > m1_p[i-1]){
                j =i;
                do{
                    m1_p[j]=m1_p[j-1];
                    j--;
                }while (j>0);
            }
        }

        System.out.println("Сортировка массива вставками");

        for (int i = 0; i <m1.length ; i++) {
            System.out.print(m1[i]+" ");
        }
        System.out.println();
    }
}
