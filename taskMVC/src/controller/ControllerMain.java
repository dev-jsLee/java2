package controller;

import model.Student;
import view.StudentView;

public class ControllerMain {

	public static void main(String[] args) {
		Student model = new Student("홍길동");
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("고길동");
		
		controller.updateView();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
