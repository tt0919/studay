import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ���ߣ�������
 * ʱ�䣺2016/06/14
 * ���ܣ�1
 */

public class Main {
	
	//�������������true
	public static boolean isIntNumeric(String str)
    {
          Pattern pattern = Pattern.compile("[0-9]+");
          Matcher isNum = pattern.matcher(str);
          if( !isNum.matches() )
          {
                return false;
          }
          return true;
    }
	
	
	public static void read_int(){
		Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//ע��while������case
        	int n=0;
        	
        	//��ȡ����int
        	//ArrayList<Integer> list=new ArrayList<Integer>();
            String n_str = in.nextLine();//�ַ�����ʽ��ȡ��������
            //String m_str = in.nextLine();//�ַ�����ʽ��ȡ��������
            if(isIntNumeric(n_str))
            {
            	n=Integer.parseInt(n_str.trim());//������ת��������-����int
            	
            }
            else {
				continue;
			}
            double r=Math.sqrt(n);
            int count=0;
            int y=0;
            //��x������ķ�Χ�ҵ�*4
            for(int x=1;x<=Math.ceil(r);x++){
            	y=(int)Math.sqrt(n-x*x);
            	if (x*x+y*y==n) {
					count++;
				}
            }
            	
            System.out.println(count*4);
        }
	}
	
	public static void main(String[] args) {
		read_int();		
    }
}