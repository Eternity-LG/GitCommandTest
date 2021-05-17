package mian.java;

public class TestException3
{
	public static void main(String[] args) throws MyException {
		//实列化一个老师
		Teacher t = new Teacher("胡杨");

		//实列化学生
		Student s = new Student("候文桌");

		//老师 在 教学生上课

		//网管说我来处理

		t.teach(s);

	}
}

class Teacher {
	
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	//老师正在给学生上课
	public void teach(Student s) throws MyException {
		//老师正在给学生上课 是一个持续的状态
		int i = 0;
		while (true) {
			System.out.println(this.name + " 给 " + s.getName() + " 上课 ");
			i++;
			try {
				Thread.sleep(1000);
				if (i == 5) {
					//突然某个学生说网络断了
					//抛出一个异常
					//老师你来帮助处理一下
					throw new MyException("突然" + s.getName() + "说网络断了");

				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Student {
	
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class MyException extends Exception {
	private String message;
	public MyException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}