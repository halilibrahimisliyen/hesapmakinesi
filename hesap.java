import java.util.Scanner;


public class hesap{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int n1, n2, choise;
        System.out.println("Lütfen ilk sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz (0 değerini alamaz): ");
        n2=input.nextInt();
        
        System.out.println("1-) Toplama \n2-) Çıkarma \n3-) Çarpma \n4-) Bölme");
        System.out.println("Lütfen yapmak istediğiniz işlemi giriniz: ");
        choise=input.nextInt();


        switch(choise){

            case 1:
                System.out.println("Toplama işleminin sonucu: "+(n1+n2));
                break;
            case 2: 
                System.out.println("Çıkarma işleminin sonucu: "+ (Math.abs(n1-n2)));
                break;
            case 3:
                System.out.println("Çarma işleminin sonucu: "+(n1*n2));
                 break;
            case 4:{
                if(n2!=0){
                System.out.println("Bölme işleminin sonucu: "+(n1/n2));
                }else{
                System.out.println("o'a bölme işlemi geçersizdir");
                }
            }
                
                 break;
            default:
                System.out.println("Geçerli bir işlem seçmediniz :(");
                break;
        }

        

    }
}