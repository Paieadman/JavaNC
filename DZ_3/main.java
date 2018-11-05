import java.lang.Math;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //triangle3(5);
        int[] arr = new int[5];
        for(int i =0; i<5; i++) {arr[i] = (int)(Math.random()*100);}
            for(int i =0; i<5; i++) {
                System.out.print(arr[i] + " ");}
        System.out.println();
            long startTime = System.nanoTime();
            choseSort(arr);
            long estimatedTime1 = System.nanoTime() - startTime;

        long startTime1 = System.nanoTime();
        bubbleSort(arr);
        long estimatedTime2 = System.nanoTime() - startTime1;

        long startTime3 = System.nanoTime();
        Arrays.sort(arr);
        long estimatedTime3 = System.nanoTime() - startTime3;

        int [] array = {(int)estimatedTime1,(int)estimatedTime2,(int)estimatedTime3};
        array = bubbleSort(array);
        System.out.println(array[0]);
        for(int i =0; i<5; i++) {
            System.out.print(arr[i] + " ");}

            Alcohol ask = Alcohol.ABSENT;
        ask.findEnum(ask);
        ask.findEnumSwitch(ask);
    }

    public static int facRec(int n){
        if (n!=1) {return n*facRec(n-1);} else{ return 1;}}

    public static int forRec(int n){
        int res = 1;
        for(int i = 1; i<=n; i++){
            res *= i;}
        return res;}

    public static void recResh(int n){
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                System.out.print("#");}
            System.out.println();
        }
    }

    public static void triangle1(int n){
            for(int i = 0; i<=n; i++){
                for(int j = 0; j<i; j++){
                    System.out.print("#");}
                System.out.println();
            }
    }
    public static void triangle2(int n){
        for(int i = 0; i<=n; i++){
            for(int j = n; j>0; j--) {
                if (i < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void triangle3(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=n; j++) {
                if (i < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
            if(arr[i]<arr[j]){
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
            }
        }
        return arr;
    }

    public static int[] choseSort(int[] arr) {
        int least = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            least = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int a = arr[i];
            arr[i] = arr[least];
            arr[least] = a;
        }
        return arr;
    }

    public static void a4(){
        int[] arr = new int[50];
        int j = 1;
        for(int i = 1; i<=50; i++)
        {
            arr[i] = j;
            j +=2;
        }

        for(int i = 1; i<=50; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        for(int i = 50; i>=1; i++)
        {
            System.out.println(arr[i]);
        }


    }

    public static void b4(){
        int[] arr = new int[20];
        for(int i = 0; i<20;i++){
            arr[i] = (int)(Math.random()*10);
        }

        for(int i = 0; i<20; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        int chet = 0;
        int nechet = 0;
        for(int i = 0; i<20; i++){
            if(arr[i]%2 == 0){
                chet++;
            } else{
                nechet++;
            }
        }
        System.out.println("chet = "+ chet+ " nechet = "+ nechet);
    }

    public  static void c4(){
        int[] arr = new int[10];
        for(int i = 0; i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }

        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        for(int i = 0; i<10; i++)
        {
            if(i%2==1){
                arr[i] = 0;
            }
        }

        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void d4(){
        int[] arr = new int[15];
        for(int i = 0; i<15;i++){
            arr[i] = (int)(Math.random()*100 -50);
        }

        int min = 0;
        int max = 0;
        for(int i = 0; i<15;i++){
            if(arr[i]<= arr[min]){
                min = i;
            }
            if(arr[i]>=arr[max]){
                max = i;
            }
        }

        System.out.println("max -> arr["+max+"] = "+arr[max]+"; min -> arr["+min+"] = "+ arr[max]);
    }


    public static void e4(){
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0; i<10;i++){
            arr1[i] = (int)(Math.random()*10);
            arr2[i] = (int)(Math.random()*10);
        }

        for(int i = 0; i<10; i++)
        {
            System.out.print(arr1[i]+ " ");
        }

        for(int i = 0; i<10; i++)
        {
            System.out.print(arr2[i]+ " ");
        }

        double mean1 = 0d;
        double mean2 = 0d;
        for(int i = 0; i<10; i++){
            mean1+= (double)arr1[i];
            mean2+= (double)arr1[i];
        }
        mean1 = mean1/10;
        mean2 = mean2/10;
        if(mean1>mean2){
            System.out.println("mean1>mean2");
        } else {
            if(mean1>mean2){
                System.out.println("mean1<mean2");
            } else{
                System.out.println("they are equals");
            }
        }
    }

    public static void f4(){
        int[] arr = new int[20];
        for(int i = 0; i<15;i++){
            arr[i] = (int)(Math.random()*2 -1);
        }

        int[] arrr= {0,0,0};
        for(int i = 0; i<20; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        for (int i = 0; i<20; i++){
            arrr[arr[i]+1]++;
        }

        arrr = bubbleSort(arrr);
        System.out.println("moda is "+ (arrr[2]-1)+ " with a number = "+ arrr[2]);
    }

    public static void a5(){
        int[][] arr = new int[8][8];
        for(int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if(i == j ){
                    System.out.print(arr[i][j]);
                }
            }
        }
        for(int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if(i+j == 7 ){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }

    public static void b5(){
        int[][] arr = new int[8][5];
        for(int i = 0; i<8; i++){
            for (int j = 0; j<5; j++){
                arr[i][j] = (int)(Math.random()*200-100);
            }
        }

        for(int i = 0; i<8; i++){
            for (int j = 0; j<5; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int x = 0, y = 0;
        int max = arr[0][0];
        for(int i = 0; i<8; i++) {
            for (int j = 0; j < 5; j++) {
                if(max<arr[i][j]){
                    x=i;
                    y = j;
                    max = arr[x][y];
                }
            }
        }
        System.out.println(x+ " "+y+" "+ arr[x][y]);

    }

    public static void c5(){
        int[][] arr = new int[8][5];
        for(int i = 0; i<8; i++){
            for (int j = 0; j<5; j++){
                arr[i][j] = (int)(Math.random()*20-10);
            }
        }

        for(int i = 0; i<8; i++){
            for (int j = 0; j<5; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        int[] ar = {1,1,1,1,1,1,1,1};
        for(int i = 0; i<8; i++){
            for (int j = 0; j<5; j++){
                if(arr[i][j]>0 && arr[i][j]!=0){
                    ar[i] *= arr[i][j];
                }
                else{
                    if (arr[i][j]<0 && arr[i][j]!=0){
                        ar[i] *= -arr[i][j];
                    }
                }
            }

        }
        int max = 0;
        for(int i = 0; i<8; i++){
            if(ar[max]< ar[i]){
                max = i;
            }
        }

        System.out.println(max);

    }

    public static int[] bubbleSort1(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
    public static void d5(){
        int[][] arr = new int[10][7];
        for(int i = 0; i<10; i++){
            for (int j = 0; j<7; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i = 0; i<10; i++){
            for (int j = 0; j<7; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i<10; i++){
            arr[i] = bubbleSort1(arr[i]);
        }

        for(int i = 0; i<10; i++){
            for (int j = 0; j<7; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void part6() {
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 50; i++) {
            if (arr[i] == 0) {
                arr1[0]++;
            } else {
                if (arr[i] == 1) {
                    arr1[1]++;
                } else {
                    if (arr[i] == 2) {
                        arr1[2]++;
                    } else {
                        if (arr[i] == 3) {
                            arr1[3]++;
                        } else {
                            if (arr[i] == 4) {
                                arr1[4]++;
                            } else {
                                if (arr[i] == 5) {
                                    arr1[5]++;
                                } else {
                                    if (arr[i] == 6) {
                                        arr1[6]++;
                                    } else {
                                        if (arr[i] == 7) {
                                            arr1[7]++;
                                        } else {
                                            if (arr[i] == 8) {
                                                arr1[8]++;
                                            } else {
                                                if (arr[i] == 9) {
                                                    arr1[9]++;
                                                } else {
                                                    if (arr[i] == 10) {
                                                        arr1[10]++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(arr1[i] + " ");
        }

    }

}
