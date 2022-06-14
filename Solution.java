/* contributed by harish rane */
import java.util.*;
class Solution{
    
    public static boolean isBalanced(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i<s.length();i++)
        {
              if (s.charAt(i) == '(') stack.push('(');
            else if (s.charAt(i) == '{') stack.push('{');
            else if (s.charAt(i) == '[') stack.push('[');
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
            else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
            else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
        
    }
	
	public static void main(String []argh)
	{
        Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
        String line;
		
		while (sc.hasNext()) {
            line = sc.nextLine();
            if(isBalanced(line))
            System.out.println("true");
            else 
            System.out.println("false");
            //Complete the code
		}
		
	}
}



