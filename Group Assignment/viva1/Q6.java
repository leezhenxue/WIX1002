package viva;

public class Q6 {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 8; j++) {
                switch(j) {
                    //M
                    case 0: 
                        switch(i){
                            case 1:
                                System.out.printf("%-5s%s","**","**");
                                break;
                            case 2:
                                System.out.printf("%-4s%s","* *","* *");
                                break;
                            case 3:
                                System.out.printf("%-3s%s%3s","*","*","*");
                                break;
                            default:
                                System.out.printf("%-6s%s","*","*");
                        }
                        break;
                    //A
                    case 1:
                    case 3:
                    case 7:
                        switch(i){
                            case 0:
                                for(int k = 0; k < 7; k++){
                                    System.out.printf("*");
                                }
                                break;
                            case 3:
                                for(int k = 0; k < 7; k++){
                                    System.out.printf("*");
                                }
                                break;
                            default:
                                System.out.printf("%-6s%s","*","*");
                        }
                        break;
                    //L
                    case 2:
                        switch(i){
                            case 6:
                                for(int k = 0; k < 7; k++){
                                    System.out.printf("*");
                                }
                                break;
                            default:
                                System.out.printf("%-7s","*");
                        }
                        break;
                    //Y
                    case 4:
                        switch(i){
                            case 0:
                                System.out.printf("%-6s%s","*","*");
                                break;
                            case 1:
                                System.out.printf("%-5s%s"," *","* ");
                                break;
                            case 2:
                                System.out.printf("%-4s%s","  *","*  ");
                                break;
                            default:
                                System.out.printf("%3s%s%3s"," ","*"," ");
                                break;
                        }
                        break;
                    //S
                    case 5:
                        switch(i){
                            case 0:
                            case 3:
                            case 6:
                                for(int k = 0; k < 7; k++){
                                    System.out.printf("*");
                                }
                                break;
                            case 1:
                            case 2:
                                System.out.printf("%-7s","*");
                                break;
                            case 4:
                            case 5:
                                System.out.printf("%7s","*");
                                break;
                        }
                        break;
                    //I
                    case 6:
                        switch(i){
                            case 0:
                            case 6:
                                for(int k = 0; k < 7; k++){
                                    System.out.printf("*");
                                }
                                break;
                            default:
                                System.out.printf("%3s%s%3s"," ","*"," ");
                                break;
                        }
                        break;
                        
                
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
