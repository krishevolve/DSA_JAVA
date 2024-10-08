class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
class Stack{
    Node top;
    Stack(){
        top=null;
    }

    public int length(){
        Node temp=top;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public boolean isFull(int size){
        return(length()==5);
    }

    public boolean isEmpty(){
        return(top==null);
    }


    public void push(int k,int size){
        Node newnode =new Node(k);
        if(isFull(size)){
            System.out.print("Stack Overflow");
            return;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }

    public int pop(){
        int tmp;
        if(isEmpty()){
            System.out.print("Stack Underflow");
            return 0;
        }
        else{
            tmp=top.data;
            top=top.next;
        }
        System.out.print("poped value from the stack is ");
        return tmp;
    }

    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        Stack sk=new Stack();
        int size=5;
        sk.push(10,size);
        sk.push(20,size);
        sk.push(30,size);
        sk.push(40,size);
        sk.push(50,size);
        //sk.push(60,size);
        sk.display();
        //System.out.println("After Popped");
       // System.out.println(sk.pop());
        //sk.display();
        
    }
}
