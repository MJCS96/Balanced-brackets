package edu.codingkata;

public class Solver {
    private String remainingBrackets;

    public boolean firstCase(String brackets){
        int charNumber = 1;
        for (int i = 0; i < brackets.length() / 2; i++) {
            char bracket = brackets.charAt(i);
            char bracketPair = brackets.charAt(brackets.length()-charNumber);
            if(bracket == '(' && bracketPair == ')' || bracket == '[' && bracketPair == ']' || bracket == '{' && bracketPair == '}'){
                charNumber++;
            }
            else {
                return false;
            }

        }
        return true;
    }
    aa

    public boolean secondCase(String brackets){
        int i=0,j=1;
        while(j <= brackets.length()){
            char bracket = brackets.charAt(i);
            char bracketPair = brackets.charAt(j);

            if(bracket == '(' && bracketPair == ')' || bracket == '[' && bracketPair == ']' || bracket == '{' && bracketPair == '}'){
                removeCorrectChars(brackets,i,j);
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    public void removeCorrectChars(String brackets, int firstPos, int lastPos){
        StringBuilder sb = new StringBuilder(brackets).deleteCharAt(firstPos);
        sb.deleteCharAt(lastPos-1);
        this.remainingBrackets = sb.toString();
    }

    public String getRemainingBrackets(){
        return this.remainingBrackets;
    }
}
