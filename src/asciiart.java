import java.util.Scanner;
public class asciiart {
    public static void main(String[] args) {
        art();
    }
    public static void art(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez indiquer la hauteur");
        int a = sc.nextInt();
        System.out.println("Veuillez indiquer la longeur");
        int b = sc.nextInt();
        if((a<3)||(b<3)){
            throw new RuntimeException("Votre chat est trop petit");
        }
        for(int i = 1;i<a+1;i++){
            if(i==1){
                System.out.print("|\\");
                for(int j = 0;j<b;j++){
                    System.out.print("-");
                }
                System.out.println("/|");
            }
            if(i>1 && i<a){
                if(i==(a+1)/2){
                    System.out.print("| O");
                    for (int j = 0; j < b-2; j++) {
                        System.out.print("_");
                    }
                    System.out.println("O |");
                }else {
                    System.out.print("|");
                    for (int j = 0; j < b+2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("|");
                }
            }
            if(i==a){
                System.out.print(" \\_");
                for(int j = 0;j<b-2;j++){
                    System.out.print("^");
                }
                System.out.println("_/ ");
            }
        }
    }
}
