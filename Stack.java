public class Stack {
    int top = -1;
    int list [];
    public Stack (int size) {
        list = new int [size];
    }
    
    public void push (int element) {
        top++; //move to the next index
        list[top] = element; //push the element to the array
    }
    
    public void pop () {
        top--; //ignore the last item in the array, save memory and process cycles
    }
    
    public int top () {
        return list[top];
    }
    
    public boolean isEmpty () {
        return top == -1; //if there are no elements in the array, top will be -1.
    }
    
    public static void main(String args[]) {
        Stack list = new Stack(10);
        list.push(1);
        list.push(2);
        
        list.pop();
        System.out.println("list top is: " + list.top());
        System.out.println("list top is: " + list.isEmpty());
        list.pop();
        System.out.println("list top is: " + list.isEmpty());


    }
}
