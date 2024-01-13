import java.util.Arrays;
import java.util.LinkedList;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
public class Main {
    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(0);
        ListNode node3=new ListNode(0);
        ListNode node34=new ListNode(0);
        ListNode node35=new ListNode(0);
        ListNode node36=new ListNode(0);
        ListNode node37=new ListNode(0);
        ListNode node38=new ListNode(0);
        ListNode node39=new ListNode(0);
        ListNode node310=new ListNode(0);
        ListNode node311=new ListNode(0);
        ListNode node312=new ListNode(0);
        ListNode node313=new ListNode(0);
        ListNode node314=new ListNode(0);
        ListNode node315=new ListNode(0);
        ListNode node316=new ListNode(0);
        ListNode node317=new ListNode(0);
        ListNode node318=new ListNode(0);
        ListNode node319=new ListNode(0);
        ListNode node320=new ListNode(0);
        ListNode node321=new ListNode(0);
        ListNode node322=new ListNode(0);
        ListNode node323=new ListNode(0);
        ListNode node324=new ListNode(0);
        ListNode node325=new ListNode(0);
        ListNode node326=new ListNode(0);
        ListNode node327=new ListNode(0);
        ListNode node328=new ListNode(0);
        ListNode node329=new ListNode(0);
        ListNode node330=new ListNode(0);
        ListNode node331=new ListNode(1);
        node1.next=node2;
        node2.next=node3;
        node3.next=node34;
        node34.next=node35;
        node35.next=node36;
        node36.next=node37;
        node37.next=node38;
        node38.next=node39;
        node39.next=node310;
        node310.next=node311;
        node311.next=node312;
        node312.next=node313;
        node313.next=node314;
        node314.next=node315;
        node315.next=node316;
        node316.next=node317;
        node317.next=node318;
        node318.next=node319;
        node319.next=node320;
        node320.next=node321;
        node321.next=node322;
        node322.next=node323;
        node323.next=node324;
        node324.next=node325;
        node325.next=node326;
        node326.next=node327;
        node327.next=node328;
        node328.next=node329;
        node329.next=node330;
        node330.next=node331;

        ListNode node4=new ListNode(5);
        ListNode node5=new ListNode(6);
        ListNode node6=new ListNode(4);
//        ListNode node7=new ListNode(9);
//        ListNode node8=new ListNode(9);
//        ListNode node9=new ListNode(9);
//        ListNode node10=new ListNode(9);
//        ListNode node11=new ListNode(9);
//        ListNode node12=new ListNode(9);
//        ListNode node13=new ListNode(9);
        node4.next=node5;
        node5.next=node6;
//        node6.next=node7;
//        node7.next=node8;
//        node8.next=node9;
//        node9.next=node10;
//        node10.next=node11;
//        node11.next=node12;
//        node12.next=node13;

        Solution summ=new Solution();

        ListNode sumNode=summ.addTwoNumbers(node1,node4);

//        System.out.println(sumNode.val);

        while (sumNode != null) {
            System.out.println(sumNode.val);
            sumNode = sumNode.next;
        }

//        while (node1 != null) {
//            System.out.println(node1.val);
//            node1 = node1.next;
//        }





    }

}


