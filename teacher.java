package work2;

public class teacher extends person {
	private Course course; //�γ���Ϣ

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
		String result="*******************\n"+"����:"+getName()+'\n'+
				"���:"+getId()+'\n'+
				"�Ա�:"+getGender()+'\n'+
				"ѧԺ:"+getDepartment()+'\n'+
				"�ڿ�:"+getCourse().getName()+'\n';
		
        return result;
    }

}
