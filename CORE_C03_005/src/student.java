
public class student {
   String name;
   int age;
   boolean sex;
   int score;
	 public student(String name,int age,String sex,int score) {
		this.name=name;
		this.age=age;
		if("男".equals(sex)){
			this.sex=true;
			
		}
		else if("女".equals(sex)){
			this.sex=false;
		}
		else
		{
			System.out.println("性别不能输入人妖！默认为男");
			this.sex=true;
		}
      this.score=score;
		
		
		
	}
	 public student() 
	 {
		System.out.println("这个是无参的构造函数");
	}
	public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}


public String isSex() {
	if(sex)
	{
		return "男";
	}
	
	else
		return "女";
	
}




public void setSex(String sex) {
	if("男".equals(sex)){
		this.sex=true;
	}
	else if("女".equals(sex)){
		this.sex=false;
	}
	else
	{
		
		System.out.println("性别不能输入人妖！但会默认为男");
		this.sex=true;
		
	}
}




public int getScore() {
	return score;
}




public void setScore(int score) {
	this.score = score;
}

}
