package Stack_Problems_Analysis;

public class Stack {
    public static void main(String[] args) {
        InnerStack st = new InnerStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("deleted top most element:" + st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println("the check stack is full:" + st.isFull());
        for (int i = st.top; i >= 0; i--) {
            System.out.println(st.arr[i]);
        }

    }
}

/**
 * InnerStack
 */
class InnerStack {

    int arr[];
    int top;

    InnerStack(int n) {
        arr = new int[n];
        top = -1;
    }

    public void push(int ele) {
        top = top + 1;
        arr[top] = ele;
    }

    public int pop() {
        return top = top - 1;
    }

    public boolean isEmpty() {
        if (arr[top] == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        return arr[top];
    }

    public boolean isFull() {
        if (top == arr.length) {
            return true;
        } else {
            return false;
        }
    }
}
