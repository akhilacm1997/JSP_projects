import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.face.controller.TeamDAO;
import com.face.util.ConnectionManager;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String y;
		do {
		int n;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1.List all Players");
		System.out.println("2.Add new Player");
		System.out.println("3.Search Player");
		n=sc.nextInt();
		TeamDAO dao=new TeamDAO();
//		ConnectionManager con = new ConnectionManager();
		
		
		
		switch(n) {
		
		case 1:
		{
			
			System.out.println("player details");
			Player pl= new Player();
			pl.Player2();//calling player class method to acess details
			
			
			break;
			
			
		}
		
		
		
		case 2:
		{
			Player pl= new Player();
			pl.Player1();//calling player class method to entering details details
			System.out.println("enter player details");
			break;
		}
		
		
		
		case 3:
		{
			Player pl= new Player();
			pl.Player3();//calling player class method to search details
			break;
		}
			
		}
		System.out.println("do you want to continue(y/n)");
		y=sc.next();
		}while(y.equals("y"));
	}

}
