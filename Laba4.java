import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int N = input.nextInt();
        int[] muss = new int[N];
        System.out.println("Введите сам массив");
        for(int i = 0; i < N; i++){
            muss [i] = input.nextInt();
        }
        combSort(muss);
        for(int F : muss){
            System.out.println(F);
        }
    }
    public static void combSort(int [] muss) {
        double factor = 1.247;
        int step = muss.length - 1;
        while (step >= 1) {
            for (int i = 0; i + step < muss.length; i++) {
                if (muss[i] < muss[i + step]) {
                    swap(muss, i, i + step);
                }
            }
            step /= factor;
        }
    }
    public static void swap (int [] sortArr, int i, int j){
        int swap = sortArr[i];
        sortArr[i] = sortArr[j];
        sortArr[j] = swap;
    }
}