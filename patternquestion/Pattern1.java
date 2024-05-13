package patternquestion;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
      //  Patternproblem(n);
//*
//* *
//* * *
//* * * *
//* * * * *

       // Patternproblem2(n);

        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

     //   Patternproblem3(n);
//     *
//    **
//   ***
//  ****
// *****
       // Patternproblem4(n);
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
      //  Patternproblem5(n);
//*****
//****
//***
//**
//*
        // Patternproblem6(n);
// * * * *
//  * * *
//   * *
//    *
       // Patternproblem7(n);

// *
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
    }

    static void Patternproblem(int N){
        for (int i=0; i<N ;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void Patternproblem2(int N){
        for (int i=0; i<N ;i++){
            for (int j=0;j<=N-1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void Patternproblem3(int N){
        for (int i=0; i<N ;i++){
            for (int j=0;j<=N;j++){
                if(j<=N-i-1){
                System.out.print(" ");
            }
                else {
                    System.out.print("* ");
                }

                }
            System.out.println();
        }

    }
    static void Patternproblem5(int N){
        for (int i=0; i<N ;i++){
            for (int j=0;j<=N;j++){
                if(j<=N-i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    static void Patternproblem6(int N){
        for (int i=0; i<N ;i++){
            for (int j=0;j<=N;j++){
                if(j<=i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
    static void Patternproblem7(int N){
        for (int i=0; i<2*N-1 ;i++){

                if(i<2*N-i-1) {
                    for (int j = 0; j <=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                else { for (int j = 0; j <2*N-i-1; j++) {
                    System.out.print("* ");
                }
                    System.out.println(" ");
                }

            }
            System.out.println();
        }


}
