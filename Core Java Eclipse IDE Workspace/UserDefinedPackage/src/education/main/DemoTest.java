package education.main;
import education.school.Attendance;
//import education.college.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		
		Attendance att1 = new Attendance();
		att1.display();
		education.college.Attendance att2 = new education.college.Attendance();
		att2.display();
	}

}
