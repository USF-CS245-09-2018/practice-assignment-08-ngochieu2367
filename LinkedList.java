public class LinkedList implements List{
	public Object data;
	Node head;
	Node next;
	int size;

	class Node{
		public Node head;
		public Node next;
		public Object data;

		public Node(){
		head = next = null;
	}
}

	


	public LinkedList(){
		data = new Object();
		size = 0;		
	}

	public void add(Object obj){

		if (size == 0) {
			Node node = new Node();
			node.data = obj;
			head = node;
		}
		Node node = head;
		//int pos = 
		while(node.next != null){
				//node.data = data;
				node = node.next;
				//++size;
			
		}

		//Node previous = getNode(pos-1);
		Node newNode = new Node();
		newNode.data = obj;
		node.next = newNode;

		//newNode.next = previous.next;
		//previous.next = newNode;
		++size;
	}

	public void add(int pos, Object obj){
		if(pos == 0){
			Node node = new Node();
			node.data = obj;
			node.next = head;
			head = node;
			++size;
		}
		else{
			Node previous = getNode(pos-1);
			Node node = new Node();
			node.data = obj;
			node.next = previous.next;
			previous.next = node;
			++size;
		}
	}

	public Node getNode(int pos){
		Node node = head;
		for(int i = 0; i < pos; i++){
			node = node.next;
		}
		return node;
	}

	public Object get(int pos){
		Node current = getNode(pos);
		return current.data;
	}

	public Object remove(int pos){
		if(pos == 0){
			Node current = head;
			head = head.next;
			--size;
			return current.data;
		}
		else{
			Node previous = getNode(pos-1);
			Node current = previous.next;
			previous.next = current.next;
			--size;
			return current.data;
		}
	}

	public int size(){
		return size;
	}
}