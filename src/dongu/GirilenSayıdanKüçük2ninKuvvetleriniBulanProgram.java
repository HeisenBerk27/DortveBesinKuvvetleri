package dongu;
import java.util.Scanner;
public class GirilenSayıdanKüçük2ninKuvvetleriniBulanProgram 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sinir sayisi giriniz ");
		int sayi = scanner.nextInt();
		
		for(int i=1; i<sayi; i *=4)
		{
			System.out.println(i);
		}
		
		for (int j = 1; j <sayi; j *= 5) 
		{
            System.out.println(j);
		}



	}
}
