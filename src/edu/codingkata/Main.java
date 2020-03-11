package edu.codingkata;

public class Main {

    public static void main(String[] args) {
        Solver solver = new Solver();

        String problem = "[]()()((([])))";

        if(problem.length() % 2 != 0){
            System.out.println("False");
            return;
        }

        while (true){
            boolean firstAnswere;
            boolean secondAnswere;
            try {
                firstAnswere = solver.firstCase(problem);
                secondAnswere = solver.secondCase(problem);
            }
            catch (StringIndexOutOfBoundsException ex){
                System.out.println("False");
                break;
            }

            if(!firstAnswere && !secondAnswere){
                System.out.println("False");
                break;
            }

            if(firstAnswere){
                System.out.println("True");
                break;
            }

            problem = solver.getRemainingBrackets();
        }
    }
}
