import javax.swing.tree.TreeNode;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        LinkedList<Integer> l1_1=new LinkedList<>();
        LinkedList<Integer> l2_1=new LinkedList<>();

        while (l1 != null) {
            l1_1.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            l2_1.add(l2.val);
            l2 = l2.next;
        }

        StringBuilder num1= new StringBuilder();
        StringBuilder num2= new StringBuilder();


        for (int i = 0; i < l1_1.size(); i++) {
            num1.append(l1_1.get(l1_1.size() - i - 1).toString());
        }

        for (int i = 0; i < l2_1.size(); i++) {
            num2.append(l2_1.get(l2_1.size() - i - 1).toString());
        }

        BigInteger n1=new BigInteger(num1.toString());
        BigInteger n2=new BigInteger(num2.toString());
        BigInteger sum=n1.add(n2);



        String sum1=sum.toString();
        char[] chars = sum1.toCharArray();
        int[] arr=new int[chars.length];

        for(int i=0;i<chars.length;i++){
            arr[i]=Character.getNumericValue(chars[i]);
        }

        ListNode node1=new ListNode(arr[chars.length-1]);
        ListNode nextNode;
        nextNode=node1;


        for (int j = 1; j <arr.length; j++) {

           ListNode node;
           node = new ListNode(arr[arr.length-1-j]);
           nextNode.next=node;
           nextNode=nextNode.next;

        }

        return node1;


//




    }
}
