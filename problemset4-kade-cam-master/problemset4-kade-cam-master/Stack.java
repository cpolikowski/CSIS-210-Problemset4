/**
 * Implements a generic stack in an array.
 * For this implementation, if all of the 
 * array slots are full, then the stack is
 * full and no additional elements can
 * be added.
 * 
 * @author Kade Garrison and Cameron Polikowski
 * @version Spring 2019
 */
public class Stack<E> implements StackInterface<E>
{
    //A constant to represent the value of the
    //top of the stack when the stack is empty.
    public static final int EMPTY = -1;

    //The index of the top of the stack or EMPTY
    //if the stack is empty.
    private int top;

    //An array-based stack.
    private E[] stack;

    /**
     * Construct a new generic stack of the input size.
     * 
     * Precondition:  size >= 1
     * 
     * @param size The size of the stack to create.
     */
    public Stack(int size)
    {
        top = EMPTY;
        stack = (E[]) new Object[size];
    }

    //Implement all of the methods of the StackInterface<E>.
    //YOUR CODE HERE.

    public void push(E element){
        if (top == EMPTY){
            stack[0] = element;
            top = 0;
        }else{
            top++;
            stack[top] = element;
        }

    }
    
    public E pop(){
        E temp = stack[top];
        stack[top] = null;
        top--;
        return temp;
    }

    public E peek() {
        return stack[0];
    }

    public boolean isEmpty() {
        if (stack[0] == null) {
            return true;
        }
        return false;
    }

    public void clear(){
        top = EMPTY;
        stack = (E[]) new Object[stack.length];
    }

    /**
     * Return the index of the object on the stack, if it exists.
     * Otherwise, return -1.
     * 
     * @param obj The object to search for in the stack.
     * @return The index of the object in the stack or -1
     * if the object does not exist.
     */
    public int search(Object obj)
    {
        for (int i = 0; i < stack.length; i++){
            if (obj.equals(stack[i])){
                return i;
            }
        }
        return -1;
    }

    /**
     * Return a string representation of the stack where
     * each each object starts on a new line of output
     * when the string is printed.
     * 
     * @return An string representation of the stack as
     * described.
     */
    @Override
    public String toString()
    {
        String output = "";
        for (int i = top; i >= 0; i--) {
            output = output + String.valueOf(stack[i]) + "\n";
        }
        return output;
    }

}
