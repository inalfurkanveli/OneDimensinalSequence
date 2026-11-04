public class Stack<E> {
    protected Stack<E> stack;
    int stackDepth;
    public Stack() {

    }

    public Stack(Stack<E> stack) {
        this.stack = stack;
    }

    public void push(E e){
        stack.push(e);
        stackDepth++;
    }

    public void pop(){
        stack.pop();
        stackDepth--;
    }

    public E peek(){
        return stack.peek();
    }
    public boolean isEmpty(){
        if (stackDepth == 0){
            return true;
        }
        return false;
    }
    public int size(){
        return stackDepth;
    }


}
