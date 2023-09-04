package ait.exception;

public class ExceptionAppl {
    public static void main(String[] args) {
        int a = 3;
        int b = 12;
        try {
            int x = solution(a, b);
            System.out.println("Solution = " + x);
        } catch (SolutionAnyNumberException e) {
            System.out.println("Solution any number");
            return;
        } catch (NoSolutionException e) {
            //e.printStackTrace();
            System.out.println("No solution");
            return;
        } catch (Exception e) {
            System.out.println("Unknown exception");
            return;
        } finally {
            System.out.println("Bye bye");
        }
        System.out.println("Math is great");
    }

    public static int solution(int a, int b) throws NoSolutionException{
        if (a == 0 && b != 0) {
            throw new NoSolutionException();
        }
        if (a == 0 && b == 0) {
            throw new SolutionAnyNumberException();
        }
        return b / a;
    }
}
