package week1.day1;
//assignment-2
public class Mobile {
 private void makecall() {
	 String mobmodel="galaxy";
	 float mobweight=2;
	System.out.println("this is my mobile model="+mobmodel);

}
 private void sendmsg() {
	// boolean isFullyCharged;
	 int mobcost=12000;
	System.out.println("this is my mobile cost="+mobcost);

}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.makecall();
		mob.sendmsg();
		

	}

}

