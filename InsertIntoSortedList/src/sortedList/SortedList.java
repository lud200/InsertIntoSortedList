package sortedList;

import java.util.Scanner;
import java.util.Stack;

public class SortedList {

}
class List{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
	public void insertSorted(){
		Node node=new Node();
		Scanner sc=new Scanner(System.in);
		node.data=sc.nextInt();
		Node temp=head;
		if(head==null){
			head=node;
			head.data=node.data;
			head.next=null;
		}
		else if(node.data<head.data){
			node.next=head;
			head=node;
		}
		else{
			while(temp!=null){
				if(temp.data<node.data){
					temp=temp.next;
				}
				else{
					temp.next=node;
					node.next=temp.next;
				}
			}
		}
	}
}