# java-3
学生选课模拟系统实验报告
g202 2020322110 王孟宸


一、实验目的

初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；

掌握面向对象的类设计方法（属性、方法）；

掌握类的继承用法，通过构造方法实例化对象；

学会使用super()，用于实例化子类；

掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。


二、实验要求

说明： 学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：

o人员（编号、姓名、性别、学院）

o教师（编号、姓名、性别、所授课程、学院）

o学生（编号、姓名、性别、所选课程、学院）

o课程（编号、课程名称、上课地点、时间、授课教师、最多选课人数、选课学生名单）



三、实验设计及核心代码

package: work3

class: Course 课程类

class: Person 人员类

class: Student 学生类

class: Teacher 教师类

其中程序入口main函数位于person类中的静态方法


1.Course

这是一个课程类，主要存储课程的编号，名称，上课地点，时间，授课教师和学院的信息，并实现空参数的初始化构造方法，和带参数的构造方法，以及对于各个属性的设置，获取方法。重载Object的

toString()方法来打印课程信息。

成员变量：

	private String id;//编号

	private String name;//课程名称
	
	private String place;//上课地点
	
	private String time;//时间
	
	private String teach;//授课教师
	
	private String department;//学院
	
2.Person

这是一个人员类，主要存储人员的编号，姓名，性别，学院的信息，并实现构造方法，以及对于各个属性的设置，获取方法。重载Object的toString()方法来打印人员信息。
成员变量：

	private String id;//编号
	
	private String name;//姓名
	
	private String gender;//性别
	
	private String department;//学院
	
	
3.Teacher

这是一个教师类，主要存储教师的编号，姓名，性别，学院，授课的信息，并实现构造方法，以及对于各个属性的设置，获取方法。重载Object的toString()方法来打印教师信息。

成员变量：
	private String id;//编号
	
	private String name;//姓名
	
	private String gender;//性别
	
	private String department;//学院
	
	private Course course; //课程信息

4.Student

这是一个学生类，主要存储学生的编号，姓名，性别，学院，选课的信息，并实现构造方法，以及对于各个属性的设置，获取方法。重载Object的toString()方法来打印学生信息。

成员变量：

	private String id;//编号
	
	private String name;//姓名
	
	private String gender;//性别
	
	private String department;//学院
	
	private Course course; //课程信息

程序流程图：

![image](https://github.com/vcri6124/java-3/blob/main/1603945521(1).png)

四、实验结果截图
![image](https://github.com/vcri6124/java-3/blob/main/图片1.png)

五、实验感想

重载Object的toString()方法可以方便对类的信息进行打印，格式化输出相应信息。
通过类之间的继承关系可以减少代码复用，增加类与类之间的关联性。
对面向对象的程序设计方法有了进一步的掌握和更深的理解。

