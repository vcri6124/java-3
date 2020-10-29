package work2;

public class person { //人员类
	private String id;//编号
	private String name;//姓名
	private String gender;//性别
	private String department;//学院
	//构造方法
	public person(String i,String n,String g,String d) {
		this.department=d;
		this.gender=g;
		this.id=i;
		this.name=n;
	}
	//设置和获得各个属性值
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	//tostring 输出信息
	public String toString() {
		String result="姓名:"+getName()+'\n'+
				"编号:"+getId()+'\n'+
				"性别:"+getGender()+'\n'+
				"学院:"+getDepartment()+'\n';
		
        return result;
    }
	//程序入口
	//String i, String n, String g, String d
	//String i,String n,String d,String p ,String t,String te
	public static void main(String args[]) {
		Course cour=new Course("102","Java程序设计","计算机学院","教学楼5楼208","周一第二节","赵卫国");
		Course nul=new Course();
		student st1=new student("2020110111","张三","男","计算机学院");
		teacher tc1=new teacher("2020111000","赵卫国","男","计算机学院");
		tc1.setCourse(cour);
		//打印学生老师信息
		System.out.println('\n'+st1.toString()+'\n');
		System.out.println('\n'+tc1.toString()+'\n');
		//打印课程信息
		System.out.println('\n'+cour.toString()+'\n');
		
		
		//学生选课操作
		st1.setCourse(cour);
		System.out.println('\n'+"学生选课结果:"+'\n'+st1.toString()+'\n');
		//学生退课操作
		st1.setCourse(nul);
		System.out.println('\n'+"学生退课结果:"+'\n'+st1.toString()+'\n');
	}
	

}
