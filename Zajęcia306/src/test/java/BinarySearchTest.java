import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void search(){
        int t[]={100,100,95,78,78,78,69,50,50,25,20,10,9,9,3};

        boolean q = BinarySearch.search(t,9);
        int t2[]={100,100,95,78,78,78,69,50,50,25,20,10,9,9,3};
        boolean q2= BinarySearch.search(t,106);
    }
}
