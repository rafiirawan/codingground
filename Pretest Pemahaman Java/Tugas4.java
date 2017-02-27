import java.util.Scanner;
public class Tugas4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan angka pertama : ");
    byte number1 = scanner.nextByte();
    System.out.print("Masukan angka kedua : ");
    byte number2 = scanner.nextByte();
    int hasil = number1+number2;
    System.out.println("jumlah " + number1 + " + " + number2 + " = " + hasil);
  }
}