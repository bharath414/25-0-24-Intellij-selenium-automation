import java.util.Arrays;
import java.util.Collections;

public class Sortingofnumbers {
        public void sortno() {
            int [] a = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
System.out.println("Original array is ");
            for(int i=0;i<a.length;i++){
                System.out.println( a[i] + "   ");
            }

            System.out.println("Sorting array is ");
           for (int i = 0; i < a.length; i++) {
//                for (int j = i + 1; j < a.length; j++) {
//                    int tmp = 0;
//                    if (a[i] > a[j]) {
//                        tmp = a[i];
//                        a[i] = a[j];
//                        a[j] = tmp;
//                    }
//                }
                //Arrays.sort(a);
                Arrays.sort(a);

                System.out.println(a[i] +"  ");
            }

        }

        public static void main(String args[]) {
            Sortingofnumbers sn =new Sortingofnumbers();
            sn.sortno();
        }



}
