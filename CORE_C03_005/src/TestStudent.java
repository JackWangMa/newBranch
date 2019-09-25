
public class TestStudent {
//这个是一次的修改代码
	public static void main(String[] args) {
		student st=new student();
		st.setName("黄世仁");
		st.setAge(23);
		st.setSex("男");
		//st.setSex("dfsaff");
		st.setScore(23);
		System.out.println("该学生的信息：");
		System.out.println("姓名："+st.getName()+"   "+"年纪："+st.getAge()+"  "+"性别："+st.isSex()+"   "+"分数："+st.getScore());
		
		
		
		student st1=new student("黄世仁",23,"男",212);		
		System.out.println("该学生的信息：");
		System.out.println("姓名："+st1.getName()+"   "+"年纪："+st1.getAge()+"  "+"性别："+st1.isSex()+"   "+"分数："+st1.getScore());
	}

}
