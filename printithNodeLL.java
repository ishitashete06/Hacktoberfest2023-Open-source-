/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
		int count=0;
     LinkedListNode<Integer> temp=head;
        while(count!=i && temp!=null)
        {
            temp=temp.next;
            count++;
        }
       if( count==i &&temp!=null)
           System.out.println(temp.data);
    }
	}
