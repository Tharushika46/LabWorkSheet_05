package Q_01;

public class Main{
    public static void main(String[] args) {
        int starNum = 10;
        int endNum = 50;
        for(int i = starNum; i < endNum; i++){
            if(i % 10 == 0){
                System.out.println();
                System.out.print(i + ", ");
            }else{
                System.out.print(i+", ");
            }

        }
    }
}
