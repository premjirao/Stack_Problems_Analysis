
package Stack_Problems_Analysis;
import java.util.Stack;

public class Stack_inbuiltM {
    public static void main(String[] args) {

        // String phase implementation operations
        Stack<String> games = new Stack<String>();

        games.add("Call of duty");
        games.add("notation of time");
        games.add("super monkey power");
        games.add("spider range");
        games.add("the free guy");

        int size = games.size();
        System.out.println("the size of games:"+size);
        System.out.println(games.pop());
        System.out.println(games.peek());
        System.out.println(games);

        //character phase implementation operattion
        Stack<Character> tower = new Stack<>();
        tower.add('P');
        tower.add('O');
        tower.add('W');
        tower.add('E');
        tower.add('R');

        System.out.println(tower);
        int charsize = tower.size();
        System.out.println("the size of character in tower:"+charsize);
        System.out.println(tower.get(2));
    }
}
