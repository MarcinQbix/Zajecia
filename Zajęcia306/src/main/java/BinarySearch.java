
public class BinarySearch {
    public static boolean search(int[]T, int x){
        //zakladamy ze el. w T sa posortowane nierosnaco
        int begin=0;
        int end = T.length-1;
        while(begin <= end){
            //musimy obliczyc indeks srodkowego elementu
            int s = (begin+end)/2;
            if(T[s]==x){
                return true;
            }
            if(x< T[s]){
                begin=s+1;
            }else //gdy x >=T[s]
            {
                end=s-1;
            }
        }
        return false;
    }
}
