package work2;

public class person { //��Ա��
	private String id;//���
	private String name;//����
	private String gender;//�Ա�
	private String department;//ѧԺ
	//���췽��
	public person(String i,String n,String g,String d) {
		this.department=d;
		this.gender=g;
		this.id=i;
		this.name=n;
	}
	//���úͻ�ø�������ֵ
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
	//tostring �����Ϣ
	public String toString() {
		String result="����:"+getName()+'\n'+
				"���:"+getId()+'\n'+
				"�Ա�:"+getGender()+'\n'+
				"ѧԺ:"+getDepartment()+'\n';
		
        return result;
    }
	//�������
	//String i, String n, String g, String d
	//String i,String n,String d,String p ,String t,String te
	public static void main(String args[]) {
		Course cour=new Course("102","Java�������","�����ѧԺ","��ѧ¥5¥208","��һ�ڶ���","������");
		Course nul=new Course();
		student st1=new student("2020110111","����","��","�����ѧԺ");
		teacher tc1=new teacher("2020111000","������","��","�����ѧԺ");
		tc1.setCourse(cour);
		//��ӡѧ����ʦ��Ϣ
		System.out.println('\n'+st1.toString()+'\n');
		System.out.println('\n'+tc1.toString()+'\n');
		//��ӡ�γ���Ϣ
		System.out.println('\n'+cour.toString()+'\n');
		
		
		//ѧ��ѡ�β���
		st1.setCourse(cour);
		System.out.println('\n'+"ѧ��ѡ�ν��:"+'\n'+st1.toString()+'\n');
		//ѧ���˿β���
		st1.setCourse(nul);
		System.out.println('\n'+"ѧ���˿ν��:"+'\n'+st1.toString()+'\n');
	}
	

}
