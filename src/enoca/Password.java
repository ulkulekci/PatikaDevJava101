package enoca;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
      String password = "12345";
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen şifrenizi giriniz: ");
        String  password1= input.nextLine();
        System.out.println(password .equals(password1)?"Giriş Başarılı!":"Giriş Başarısız!");
    }
}
