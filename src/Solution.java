import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public String LeftRotateString(String str,int n) {
        Queue<Character> queue=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            queue.add(str.charAt(i));
        }
        while(n!=0){
            queue.add(queue.poll());
            n--;
        }
        StringBuilder sb=new StringBuilder();
        while(queue.isEmpty()){
            sb.append(queue.poll());
        }
        return sb.toString();
    }
}
