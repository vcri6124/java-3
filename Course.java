package work2;

public class Course {
	private String id;//���
	private String name;//�γ�����
	private String place;//�Ͽεص�
	private String time;//ʱ��
	private String teach;//�ڿν�ʦ
	private String department;//ѧԺ
	//�չ��췽��
	public Course() {
		this.id="";
		this.name="";
		this.department="";
		this.place="";
		this.time="";
		this.teach="";
	}
	//���췽��
	public Course(String i,String n,String d,String p ,String t,String te) {
		this.id=i;
		this.name=n;
		this.department=d;
		this.place=p;
		this.time=t;
		this.teach=te;
	}
	
	//���Ե�set�� get ����
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
	
	//toString �����Ϣ
	public String toString() {
		String result="*******************\n"+"�γ���:"+getName()+'\n'+
				"���:"+getId()+'\n'+
				"�Ͽεص�:"+getPlace()+'\n'+
				"ʱ��:"+getTime()+'\n'+
				"�ڿν�ʦ:"+getTeach()+'\n'+
				"����ѧԺ:"+getDepartment()+'\n';
		
        return result;
    }
	
	

}
