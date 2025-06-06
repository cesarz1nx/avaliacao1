import java.util.Scanner;
public class avaliacao1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva a temperatura em graus celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		double kelvin =celsius + 273.15;
		
		System.out.println("Temperatura em celsius: " + celsius + " °C"
				+ "\nTemperatura em fahrenheit: " + fahrenheit + " °F" 
                +  "\nTemperatura em kelvin: " + kelvin + " K");
		
		sc.close();
	}

}
