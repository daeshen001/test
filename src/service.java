import java.util.Random;


public class service {
   public static void kongzhi(){
		while(true){  
			int  b=scannerUtils.next("请您出拳:1.石头2.剪刀3.布"); 
		Random ran=new Random(); 
		   int a=ran.nextInt(3);
		   switch(a){
		   case 0:System.out.println("那个家伙出的石头");
		          switch(b){
		          case  1:System.out.println("你出的石头");
		        	  System.out.println("你们打平");break;
		          case  2:System.out.println("你出的剪刀");
                          System.out.println("真蠢这都输了！");break;
		          case  3: System.out.println("你出的是布");
                           System.out.println("恭喜您赢了");break;
		          default: System.exit(0);  break;
		          }break;
		   case 1:System.out.println("那个家伙出的剪刀 ");
		   switch(b){
	          case  1:System.out.println("恭喜你赢了");break;
	          case  2:System.out.println("你们打平");break;
	          case  3:System.out.println("真蠢这都输了");break;
	          default: break;
	          }break;
	         
		   case 2:System.out.println("那个家伙出的布");
		   switch(b){
	          case  1:System.out.println("真蠢这都输了");break;
	          case  2:System.out.println("恭喜您赢了");break;
	          case  3:System.out.println("你们打平了");break;
	          default: break;
	          }break;
		   default:   break;
		   }

}}}
