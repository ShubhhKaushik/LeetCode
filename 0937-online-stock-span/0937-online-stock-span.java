import java.util.*;

class StockSpanner {
    class Pair {
        int price;
        int span;
        Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }

    Stack<Pair> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;  // every stock has at least span 1
        // pop smaller/equal prices and add their spans
        while (!stack.isEmpty() && stack.peek().price <= price) {
            span += stack.pop().span;
        }
        stack.push(new Pair(price, span));
        return span;
    }
}
