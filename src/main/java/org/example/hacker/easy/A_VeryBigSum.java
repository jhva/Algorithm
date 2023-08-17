import java.util.*;

public class A_VeryBigSum{

    
    public static void main(String[] args) {
            solution(List.of(1000000001 ,1000000002 ,1000000003,1000000004,,1000000005));
    }

    public static int solution(List<Integer> ar){
        long ans = 0;
    
        for(int i=0; i<ar.size(); i++){
            ans += ar.get(i);
        }
        
        return ans;
    }
}