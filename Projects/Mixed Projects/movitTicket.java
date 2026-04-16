import java.util.Scanner;

public class movitTicket {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Movie name: ");
		String name = sc.nextLine();
		
		System.out.println("Cinema no :");
		int cinemaNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Seat no :");
		int seatNo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Price :");
		Double Price = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("************************************\n" + "         Movie Ticket           " + "\n************************************\n" + "Movie Name :           " + name + "\nCinema Number :        " + cinemaNo +  "\nSeat Number :          " + seatNo + "\nPrice :               R" + Price);
		
	}
	
}