import java.util.HashMap;
class RemovedDuplicates{
    public static void main(String args[]){
       if (args.length != 1) System.out.println("Invalid Input!");
       Node n = new Node(Integer.parseInt(args[0]));
       HashMap<Integer, Boolean> values = new HashMap<Integer, Boolean>();
       Node previous = null;
       while (n != null){
           if (values.get(n.value)) previous.next = n.next;
           else{
               values.put(n.value, true);
               previous = n;
           }
           n = n.next;
       }
    }
}
