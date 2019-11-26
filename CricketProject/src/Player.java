import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.face.bo.PlayerBO;
import com.face.bo.SkillBO;
import com.face.bo.TeamBO;
import com.face.controller.PlayerDAO;
import com.face.controller.SkillDAO;
import com.face.controller.TeamDAO;
import com.face.util.ConnectionManager;


public class Player {
	
	ConnectionManager con= new ConnectionManager();
	 public void  Player1() throws ClassNotFoundException, IOException, SQLException 
	 {
		 
		 	Scanner sc= new Scanner(System.in);
		 	System.out.println("enterskillname");
			String skillName=sc.next();
		    System.out.println("enter playerName");
			String playerName=sc.next();
			System.out.println("enter countryName");
			String countryName=sc.next();
			System.out.println("enter teamName");
			String teamName=sc.next();
			TeamBO tb= new TeamBO();
			tb.setTeamName(teamName);
			TeamDAO tdao= new TeamDAO();
			int tid=TeamDAO.save(con.getConnection(),tb);  //convert team name into team id through teamdao
			
			SkillBO sb=new SkillBO();
			sb.setSkillName(skillName);
			SkillDAO sdao= new SkillDAO();
			int id=SkillDAO.save(con.getConnection(),sb); //convert team name into skill id through skilldao
			
			System.out.println(id);
			
			
			
			PlayerBO pb=new PlayerBO();
			pb.setPlayerName(playerName);//encaspulate all the by playerbo class
			pb.setCountry(countryName);
			pb.setTeamName(teamName);
			pb.setSkillid(id);
			pb.setTeamid(tid);
			
			PlayerDAO pdao = new PlayerDAO();
			PlayerDAO.save(con.getConnection(),pb);
			
	 
	

}
	public void Player2() throws ClassNotFoundException, SQLException, IOException {
		
		PlayerDAO pdao = new PlayerDAO();
		PlayerDAO.display(con.getConnection());
		
		
	}
	public void Player3() throws ClassNotFoundException, IOException, SQLException
	{
		
		PlayerDAO pdao = new PlayerDAO();
		System.out.println("enter skillname");
		PlayerBO pb=new PlayerBO();

	 	Scanner sc= new Scanner(System.in);
		String skillName=sc.next();
		SkillBO sb=new SkillBO();
		sb.setSkillName(skillName);
		SkillDAO sdao= new SkillDAO();
		int id=SkillDAO.save(con.getConnection(),sb);
		//int id=SkillDAO.search(con.getConnection(),sb);
		pb.setSkillid(id);
		System.out.println(id);
		PlayerDAO pd = new PlayerDAO();
		PlayerDAO.search(con.getConnection(),pb);
		
	}
}
