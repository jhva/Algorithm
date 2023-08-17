import java.util.*;

public class simpleArraySum{

    
    public static void main(String[] args) {
            solution(List.of(1 ,2 ,3 ,4 ,10 ,11));
    }

    public static int solution(List<Integer> ar){
        int ans= 0; 
        for(int i=0; i<ar.size(); i++){
            ans+=ar.get(i);
        }
        
        
        return ans;
    }
}