/*Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3 */
package gfg;
public class Reverse_a_double_Linked_List{
    public static Node reverseDLL(Node  head)
{
    Node curr=head;
    Node front=head;
    int count=0;
    while(curr.next!=null)
    {
        curr=curr.next;
        count++;
    }
    int i=0;
    int div=count/2;
    while(i<=div)
    {
        int num=front.data;
        front.data=curr.data;
        curr.data=num;
        front=front.next;
        curr=curr.prev;
        i++;
        
    }
    return head;
}
}