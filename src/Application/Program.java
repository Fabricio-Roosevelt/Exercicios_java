package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha uma boa viagem.");
		Comment c2 = new Comment("Que bom, boa sorte.");
		Post p1 = new Post(sdf.parse("20/05/2023 13:00:44"), 
				"Viajando para N.Zelandia", 
				"Vou visitar esse pais maravilhoso",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Boa noite, que bom.");
		Comment c4 = new Comment("Estou apostando em você.");
		Post p2 = new Post(sdf.parse("10/10/2022 21:10:54"), 
				"Boa noite galera!!!", 
				"Eu te vejo amanhã",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
