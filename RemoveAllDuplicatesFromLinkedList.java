//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class RemoveAllDuplicatesFromLinkedList {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            RemoveAllDuplicatesFromLinkedList llist = new RemoveAllDuplicatesFromLinkedList();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public Node removeAllDuplicates(Node head) {
        //code here
        Node dummy = new Node(-1);
        Node curr = null;
        if (head == null) return null;
        if (head.next == null) return head;
        
        Node temp = head;
        Node prev = null;
        
        while (temp != null) {
            if ((temp.next == null || temp.next.data != temp.data) && (prev == null || prev.data != temp.data)) {
                if (curr == null) {
                    curr = temp;
                    dummy.next = curr;
                } else {
                    curr.next = temp;
                    curr = curr.next;
                }
            }
            
            prev = temp;
            temp = temp.next;
        }
        
        if (curr != null) {
            curr.next = null;
        }
        
        return dummy.next;
    }
}