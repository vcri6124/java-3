package work2;

public class teacher extends person {
	private Course course; //课程信息

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public teacher(String i, String n, String g, String d) {
		super(i, n, g, d);
		course=new Course();
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String result="*******************\n"+"姓名:"+getName()+'\n'+
				"编号:"+getId()+'\n'+
				"性别:"+getGender()+'\n'+
				"学院:"+getDepartment()+'\n'+
				"授课:"+getCourse().getName()+'\n';
		
        return result;
    }

}
