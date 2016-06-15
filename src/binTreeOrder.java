import java.util.Stack;


public class binTreeOrder {    
    private char date;    
    private binTreeOrder lchild;    
    private binTreeOrder rchild;    
    
    public binTreeOrder(char c) {    
        date = c;    
    }    
    
    // 先序遍历递归     
    public static void preOrder(binTreeOrder t) {    
        if (t == null) {    
            return;    
        }    
        System.out.print(t.date);    
        preOrder(t.lchild);    
        preOrder(t.rchild);    
    }    
    
    // 中序遍历递归     
    public static void InOrder(binTreeOrder t) {    
        if (t == null) {    
            return;    
        }    
        InOrder(t.lchild);    
        System.out.print(t.date);    
        InOrder(t.rchild);    
    }    
    
    // 后序遍历递归     
    public static void PostOrder(binTreeOrder t) {    
        if (t == null) {    
            return;    
        }    
        PostOrder(t.lchild);    
        PostOrder(t.rchild);    
        System.out.print(t.date);    
    }    
    
    // 先序遍历非递归     
    public static void preOrder2(binTreeOrder t) {    
        Stack<binTreeOrder> s = new Stack<binTreeOrder>();    
        while (t != null || !s.empty()) {    
            while (t != null) {    
                System.out.print(t.date);    
                s.push(t);    
                t = t.lchild;    
            }    
            if (!s.empty()) {    
                t = s.pop();    
                t = t.rchild;    
            }    
        }    
    }    
    
    // 中序遍历非递归     
    public static void InOrder2(binTreeOrder t) {    
        Stack<binTreeOrder> s = new Stack<binTreeOrder>();    
        while (t != null || !s.empty()) {    
            while (t != null) {    
                s.push(t);    
                t = t.lchild;    
            }    
            if (!s.empty()) {    
                t = s.pop();    
                System.out.print(t.date);    
                t = t.rchild;    
            }    
        }    
    }    
    
    // 后序遍历非递归     
    public static void PostOrder2(binTreeOrder t) {    
        Stack<binTreeOrder> s = new Stack<binTreeOrder>();    
        Stack<Integer> s2 = new Stack<Integer>();    
        Integer i = new Integer(1);    
        while (t != null || !s.empty()) {    
            while (t != null) {    
                s.push(t);    
                s2.push(new Integer(0));    
                t = t.lchild;    
            }    
            while (!s.empty() && s2.peek().equals(i)) {    
                s2.pop();    
                System.out.print(s.pop().date);    
            }    
    
            if (!s.empty()) {    
                s2.pop();    
                s2.push(new Integer(1));    
                t = s.peek();    
                t = t.rchild;    
            }    
        }    
    }    
    
    public static void main(String[] args) {    
        binTreeOrder b1 = new binTreeOrder('a');    
        binTreeOrder b2 = new binTreeOrder('b');    
        binTreeOrder b3 = new binTreeOrder('c');    
        binTreeOrder b4 = new binTreeOrder('d');    
        binTreeOrder b5 = new binTreeOrder('e');    
    
        /**  
         *      a   
         *     / /  
         *    b   c  
         *   / /  
         *  d   e  
         */    
        b1.lchild = b2;    
        b1.rchild = b3;    
        b2.lchild = b4;    
        b2.rchild = b5;    
    
        binTreeOrder.preOrder(b1);    
        System.out.println();    
        binTreeOrder.preOrder2(b1);    
        System.out.println();    
        binTreeOrder.InOrder(b1);    
        System.out.println();    
        binTreeOrder.InOrder2(b1);    
        System.out.println();    
        binTreeOrder.PostOrder(b1);    
        System.out.println();    
        binTreeOrder.PostOrder2(b1);    
    }    
}    