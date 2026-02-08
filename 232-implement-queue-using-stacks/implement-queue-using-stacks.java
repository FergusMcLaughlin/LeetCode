class MyQueue {

        private ArrayList<Integer> stackA = new ArrayList();
        private ArrayList<Integer> stackB = new ArrayList();

    public MyQueue() {

    }

    public void push(int x) {
        stackA.add(x);
    }

    public int pop() {
        if (stackB.isEmpty() && stackA.isEmpty()) {
            return -1;
        }

        int toRemove = 0;

        if (stackB.isEmpty()) {
            for (int i = stackA.size() - 1; i >= 0; i--) {
                stackB.add(stackA.get(i));
                stackA.remove(i);
            }
            toRemove = stackB.get(stackB.size() - 1);
            stackB.remove(stackB.size() - 1);
        } else {
            toRemove = stackB.get(stackB.size() - 1);
            stackB.remove(stackB.size() - 1);
        }
        return toRemove;
    }


    public int peek() {
        if (stackB.isEmpty() && stackA.isEmpty()) {
            return -1;
        }

        int toPeek = 0;

        if (stackB.isEmpty()) {
            for (int i = stackA.size() - 1; i >= 0; i--) {
                stackB.add(stackA.get(i));
                stackA.remove(i);
            }
            toPeek = stackB.get(stackB.size() - 1);
        } else {
            toPeek = stackB.get(stackB.size() - 1);
        }
        return toPeek;

    }

    public boolean empty() {
        if(stackA.isEmpty() && stackB.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */