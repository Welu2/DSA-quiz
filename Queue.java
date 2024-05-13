package package3;


import package2.Stacks;

import java.util.*;
public class Queue implements Stacks{
static class queue {

            //static Stack<Integer> s1 = new Stack<Integer>();
            static Stack<Integer> s2 = new Stack<Integer>();

            static void enQueue(int x)
            {

                while (!Stacks.isEmpty())
                {
                    s2.push(Stacks.pop());

                }


                Stacks.push(x);


                while (!s2.isEmpty())
                {
                    Stacks.push(s2.pop());

                }
            }


            static int deQueue()
            {

                if (Stacks.isEmpty())
                {
                    return -1;
                }


                int x = Stacks.peek();
                Stacks.pop();
                return x;
            }
        };

        // Driver code
        public static void main(String[] args)
        {
            queue q = new queue();
            queue.enQueue(1);
            queue.enQueue(2);
            queue.enQueue(3);

            System.out.println(queue.deQueue());
            System.out.println(queue.deQueue());
            System.out.println(queue.deQueue());
        }
    }


}
