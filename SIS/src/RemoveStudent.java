import java.util.*;

public class RemoveStudent {

	protected static Scanner uI = new Scanner (System.in);
	public static void removeTheStudent()
	{
		try 
		{
			System.out.println("Please enter the student's name in which you want to delete");
			System.out.println();
			System.out.println();
			String name = uI.nextLine();
			
			String [] nameSplit = name.split(" ");
			
			for(int i = 0; i < MainMenu.studentList.size(); i++)
			{
				if(MainMenu.studentList.get(i).getFirstName().equals(nameSplit[0]) && MainMenu.studentList.get(i).getLastName().equals(nameSplit[1]))
				{
					MainMenu.studentList.remove(i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong, please try again");
			removeTheStudent();
		}
	}
}
