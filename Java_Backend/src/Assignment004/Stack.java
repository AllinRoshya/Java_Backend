package Assignment004;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	 int capacity = 10;
	    ArrayList<WordProcessor> stateOfTheWord = new ArrayList<>();
	    ArrayList<WordProcessor> redoStack = new ArrayList<>();
	  int top = 0;

	    Stack() {
	    }

	    public WordProcessor pop() {
	        if (top > 0) {
	            return this.stateOfTheWord.remove(--top);
	        }
	        return null;
	    }

	    public void push(WordProcessor wp) {
	        if (checkCapacity()) {
	            this.stateOfTheWord.add(new WordProcessor(wp.word));
	            top++;
	        } else {
	            System.out.println("Limited capacity");
	        }
	    }

	    public boolean checkCapacity() {
	        return this.top < this.capacity;
	    }

	    public void pushToRedo(WordProcessor wp) {
	        this.redoStack.add(new WordProcessor(wp.word));
	    }

	    public WordProcessor popFromRedo() {
	        if (!redoStack.isEmpty()) {
	            return redoStack.remove(redoStack.size() - 1);
	        }
	        return null;
	    }
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = sc.nextLine();
		WordProcessor wp = new WordProcessor(word);
		stack.push(wp);

		while (true) {
			System.out.println("Enter the action (undo / redo / bold / italic / underline / stop):");
			String input = sc.nextLine();
			if (input.equals("stop")) {
				break;
			}
			switch (input) {
			case "undo": 
				WordProcessor undoAction = stack.pop();
				if (undoAction != null) {
					stack.pushToRedo(undoAction);
					  wp = stack.top > 0 ? stack.stateOfTheWord.get(stack.top - 1) : new WordProcessor("");
					System.out.println("Action Undo: " + undoAction.word);
				} else {
					System.out.println("Nothing to undo!");
				}
				break;
			
			case "redo": 
				WordProcessor redoAction = stack.popFromRedo();
				if (redoAction != null) {
					stack.push(redoAction);
					wp.word = redoAction.word;
					System.out.println("Action Redo: " + redoAction.word);
				} else {
					System.out.println("Nothing to redo!");
				}
				break;
			
			case "bold": 
                wp.doBold();
                stack.push(wp);
                stack.redoStack.clear(); 
                break;
            
            case "italic": 
                wp.doItalic();
                stack.push(wp);
                stack.redoStack.clear(); 
                break;
            
            case "underline": 
                wp.doUnderline();
                stack.push(wp);
                stack.redoStack.clear(); 
                break;
            
			default:
				break;
			}
			System.out.println("Current State: " + wp.word);
		}
	}

}
