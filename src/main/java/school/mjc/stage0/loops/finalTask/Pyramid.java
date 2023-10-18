package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for(int i = 1; i <= cathetusLength; i++){
            //spaces;
            for(int j = 1; j <= cathetusLength -i;j++){
                System.out.print(' ');
            }

            //desc
            for(int k = i; k >= 1; k--){
                System.out.print(k);
            }
            //asce
            for(int d = 2; d <= i; d++){
                System.out.print(d);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
