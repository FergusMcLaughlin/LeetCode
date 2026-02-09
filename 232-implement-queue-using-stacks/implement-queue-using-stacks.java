class MyQueue {

    private ArrayList<Integer> stackA = new ArrayList();
    private ArrayList<Integer> stackB = new ArrayList();

    public MyQueue() {

    }

    public void push(int x) {
        stackA.add(x);
    }

    public int pop() {
        if (stackA.isEmpty() && stackB.isEmpty())
            return -1;

        int itemToPop = 0;
        if (stackB.size() == 0) {
            for (int i = stackA.size() - 1; i >= 0; i--) {
                stackB.add(stackA.get(i));
            }
            stackA.clear();
            itemToPop = stackB.get(stackB.size() - 1);
            stackB.remove(stackB.size() - 1);
            return itemToPop;
        } else {
            itemToPop = stackB.get(stackB.size() - 1);
            stackB.remove(stackB.size() - 1);
            return itemToPop;
        }
    }

    public int peek() {
        if (stackA.isEmpty() && stackB.isEmpty())
            return -1;

        int itemToPeep = 0;
        if (stackB.size() == 0) {
            for (int i = stackA.size() - 1; i >= 0; i--) {
                stackB.add(stackA.get(i));
            }
            stackA.clear();
            itemToPeep = stackB.get(stackB.size() - 1);
            return itemToPeep;
        } else {
            itemToPeep = stackB.get(stackB.size() - 1);
            return itemToPeep;
        }
    }

    public boolean empty() {
        if (stackA.isEmpty() && stackB.isEmpty()) {
            return true;
        } else {
            return false;
        }

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