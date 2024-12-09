import java.util.Random;
import java.util.Scanner;
public class avigail {
	
	 public static  Node<Integer> generateRandomNumbers(int x, int y) {
	        if (y < x) {
	            throw new IllegalArgumentException("הגבול העליון חייב להיות גדול מהגבול התחתון");
	        }

	        Random random = new Random();
	        Node<Integer> head = new Node<Integer>(0); // ראש הרשימה
	        Node<Integer> current = head;

	        for (int i = 0; i < 20; i++) {
	            int randomNumber = random.nextInt(y - x + 1) + x;
	            current = new Node<Integer>(randomNumber);
	            head.setNext(current);
	            current = head;
	        } return head;
	    }
	 
	 
	  public static int countOccurrences(Node<Integer> head, int x) {
	        int count = 0;
	        while(head != null) {
	        	if(head.getValue()==x) {
	                count++;
	            }
	        head= head.getNext();}
	        
	        return count;}
	  
	  
public static Node<Integer> q1s1 (int []arr) {
	
	Node<Integer> head = new Node<>(arr[0]); // ראש הרשימה
    Node<Integer> current = head;
    Node<Integer> next = new Node<>(arr[1]);
    head.setNext(next);
    for (int i = 2; i < arr.length; i++) {
        current = next;
        next = new Node<>(arr[i]);
        current.setNext(next);
    }
return 	head;
}


public Node<Integer> q1s2 (int []arr,int index) {
	
    if (index >= arr.length) {
        return null;
    }

    Node<Integer> node = new Node<>(arr[index]);
    // במקום node.next, נחזיר את הקריאה הרקורסיבית ישירות:
    return node;
}

public static Node<Integer> q1s2(int[] arr) {
    if (arr.length == 0) {
        return null;
    }

    return q1s2(arr, 0);
}


public static void q2(Node<Integer> head) {
	 System.out.println(head.getValue());
	 while(head != null) {
		 
     head= head.getNext();
     System.out.println(head.getValue());
     }
     
}

public static void q3() {
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();

		Node<Integer> head = new Node<>(number);
		if (number== -1) {
			System.out.println("---");}
		
		 Node<Integer> current = head;
		System.out.println("enter");
		int n = scanner.nextInt();
		Node<Integer> next = new Node<>(n);
		if (n== -1) {
			System.out.println("---");}
		head.setNext(next);
		while(next.getValue() !=-1 ) {
			current = next;
			System.out.println("enter");
			int s = scanner.nextInt();
	        next = new Node<>(s);
	        current.setNext(next);
		}
		System.out.println(head);;
}

public static void q4(Node<Integer> head) {
	
	int n= head.getValue();
	if (n%2==0) {
	 System.out.println(head.getValue());}
		 
    head= head.getNext();
    while(head !=null  ) {
    	 n= head.getValue();
    	if (n%2==0) {
    System.out.println(head.getValue());}
    head= head.getNext();}}
  
    
public static boolean q5(Node<Integer> head, int num) {
	
	int n= head.getValue();
	if (n==num) {
	return true;
	}
    head= head.getNext();
    while(head !=null  ) {
    	 n= head.getValue();
    	if (n==num) {
    return  true;}
    head= head.getNext();}
return false;}

public static Node<Integer> q6 (Node<Integer> head, int num) {
	
	int n= head.getValue();
	if (n==num) {
		head.setNext(head.getNext().getNext());
         return head.getNext();		}
	
	Node<Integer> current = head;
    while(head !=null  ) {
    	 n= head.getValue();
    	 if (current.getNext().getValue() == num) {
             // מסירים את החוליה
             current.setNext(current.getNext().getNext());
             return head;  // מחזירים את ראש הרשימה
         }
         current = current.getNext();  // נעים לחוליה הבאה 
         }  return head;  	}



	
public static Node<Integer> q7 (Node<Integer> head, int num) {
	if(num==1) {
	        if (head != null) {
	            return head.getNext();  // מחזירים את החוליה הבאה אחרי הראש
	        }}
	Node<Integer> current = head;
	for (int i=1;i<num-1 ;i++){
		current= current.getNext();}
	
    	int n= head.getValue();
   
             current.setNext(current.getNext().getNext());
             return head;  // מחזירים את ראש הרשימה
}

public static boolean q8(Node<Integer> l1, Node<Integer> l2) {
    if (l1 == null) {
        return true;
    }

    if (l2 == null) {
        return false;
    }

    if (l1.getValue() == l2.getValue()) {
        return q8(l1.getNext(), l2);  // מחפשים את הערך הבא ב-L1 ב-L2
    }

    return q8(l1, l2.getNext());
}
    
public static void q9(Node<Integer> l1, Node<Integer> l2) {
boolean b;

	if (l1 != null) {
		while (l2 != null) {
		b=q5(l1,l2.getValue());
		if( b==true) {
			System.out.println(l2.getValue());
		}
		l2= l2.getNext();
	}
}}



public static void main(String[] args) {
	    int	[] arr = {4,5,6,7,8,};
	    int	[] arr2 = {4,7,8,};
//	    	randomNumbers<Integer> numbers = generateRandomNumbers(1, 100);
	        System.out.println(q1s1(arr));
	    //    q2(q1s1(arr));
	      //q3();
	        q4(q1s1(arr));
	        System.out.println(  q6(q1s1(arr),5));
	        System.out.println(  q5(q1s1(arr),5));
	        System.out.println(  q7(q1s1(arr),4));
	        System.out.println(  q8(q1s1(arr),q1s1(arr2)));
	         q9(q1s1(arr),q1s1(arr2));
	    }
}
