package DataStructure;
import java.util.*;
import java.lang.*;

public class BalanceBrackets {
	 public boolean isBalanced(String expression) {
		 Stack<Character> stack = new Stack<Character>();
		 for(char c: expression.toCharArray()){
			 	if((c == '(') || (c == '{') || (c == '[')){
			 		stack.push(c);
			 	} else{
                    if(stack.isEmpty())
                         return false;
			 		Character top = stack.peek();
			 		if((top == '(') && ( c == ')')){
			 			stack.pop();
			 		} else if((top == '{') && ( c == '}')){
			 			stack.pop();
			 		} else if((top == '[') && ( c == ']')){
			 			stack.pop();
			 		} else {
			 			return false;
			 		}
			 	}
		 	}
		 if(stack.isEmpty())
			 return true;
		 else 
			 return false;
	    }
}
