package myPack;

public class Exercise_09 {
    public static void main(String[] args) {
        //Имитация игры в рулетку: целое число от 1 до 36 чет/нечет красное/черное
    roulette();
    }
    public static void roulette(){
        int x =(int) (Math.random() * (36 - 1 + 1) + 1);
        int y = (int) (Math.random() * 2);
        if (y == 1){
            System.out.println("Число: " + x + " , красное");
        } else if(y == 0) {
            System.out.println("Число: " + x + " , черное");
        }
    }
}
