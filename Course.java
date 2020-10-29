package work2;

public class Course {
	private String id;//编号
	private String name;//课程名称
	private String place;//上课地点
	private String time;//时间
	private String teach;//授课教师
	private String department;//学院
	//空构造方法
	public Course() {
		this.id="";
		this.name="";
		this.department="";
		this.place="";
		this.time="";
		this.teach="";
	}
	//构造方法
	public Course(String i,String n,String d,String p ,String t,String te) {
		this.id=i;
		this.name=n;
		this.department=d;
		this.place=p;
		this.time=t;
		this.teach=te;
	}
	
	//属性的set和 get 方法
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeach() {
		return teach;
	}
	public void setTeach(String teach) {
		this.teach = teach;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//toString 输出信息
	public String toString() {
		String result="*******************\n"+"课程名:"+getName()+'\n'+
				"编号:"+getId()+'\n'+
				"上课地点:"+getPlace()+'\n'+
				"时间:"+getTime()+'\n'+
				"授课教师:"+getTeach()+'\n'+
				"开课学院:"+getDepartment()+'\n';
		
        return result;
    }
	
	

}
