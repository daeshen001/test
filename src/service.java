import java.util.Random;


public class service {
   public static void kongzhi(){
		while(true){  
			int  b=scannerUtils.next("������ȭ:1.ʯͷ2.����3.��"); 
		Random ran=new Random(); 
		   int a=ran.nextInt(3);
		   switch(a){
		   case 0:System.out.println("�Ǹ��һ����ʯͷ");
		          switch(b){
		          case  1:System.out.println("�����ʯͷ");
		        	  System.out.println("���Ǵ�ƽ");break;
		          case  2:System.out.println("����ļ���");
                          System.out.println("����ⶼ���ˣ�");break;
		          case  3: System.out.println("������ǲ�");
                           System.out.println("��ϲ��Ӯ��");break;
		          default: System.exit(0);  break;
		          }break;
		   case 1:System.out.println("�Ǹ��һ���ļ��� ");
		   switch(b){
	          case  1:System.out.println("��ϲ��Ӯ��");break;
	          case  2:System.out.println("���Ǵ�ƽ");break;
	          case  3:System.out.println("����ⶼ����");break;
	          default: break;
	          }break;
	         
		   case 2:System.out.println("�Ǹ��һ���Ĳ�");
		   switch(b){
	          case  1:System.out.println("����ⶼ����");break;
	          case  2:System.out.println("��ϲ��Ӯ��");break;
	          case  3:System.out.println("���Ǵ�ƽ��");break;
	          default: break;
	          }break;
		   default:   break;
		   }

}}}
