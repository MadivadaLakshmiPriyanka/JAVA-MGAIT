/*
 * Array Of Object
 */
class Friend
{
	String name;
	String gender;
	String phone;
	String nickname;
	public Friend(String name, String gender, String phone, String nickname) {
		
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.nickname = nickname;
	}
	
	
}
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Friend friends[]=new Friend[5];
friends[0]=new Friend("Ravali","Female","998543756734684","Raavli");
friends[1]=new Friend("Mounika","Female","9985437567684","Mon");
friends[2]=new Friend("Nazia","Female","998556734684","Naz");
friends[3]=new Friend("Sathvika","Female","998756734684","Sat");
friends[4]=new Friend("Preethi","Female","998756734684","papa");
for(Friend f:friends)

	System.out.println(f.name+" "+f.gender+" "+f.phone+" "+f.nickname);

	}

}
