package bestiu;

public class SwitchDemo {

	public static void main(String[] args) {
		    String day="funday";
		    
		    switch(day)
		    {
		    case "Monday":
		    case "monday":
		    	System.out.println("attend the meeting");
		    	break;
		    	
		    case "Tuesday":
		    case "tuesday":
		    	System.out.println("Word on project task");
		    	break;
		    	
		    case "Wednesday":
		    case "wednesday":
		    	System.out.println("Submit the progress report");
		    	break;
		    	
		    case "Thursday":
		    case "thursday":
		    	System.out.println("Client call and review");
		    	break;
		    	
		    case "Friday":
		    case "friday":
		    	System.out.println("Wrap up weekly task");
		    	break;
		    	
		    case "Saturday":
		    case "saturday":
		    case "Sunday":
		    case "sunday":
		    	System.out.println("Enjoy the weekend");
		    	break;
		    	
		    	default :
		    		System.out.println("inavalid day");
		    		

		    }

	}

}
