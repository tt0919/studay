import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 作者：刘婷婷
 * 时间：2016/06/14
 * 功能：1
 */

public class Main {
	
	//如果是数字则是true
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
        while (in.hasNext()) {//注意while处理多个case
        	int n=0;
        	
        	//读取数字int
        	//ArrayList<Integer> list=new ArrayList<Integer>();
            String n_str = in.nextLine();//字符串形式读取个数的行
            //String m_str = in.nextLine();//字符串形式读取个数的行
            if(isIntNumeric(n_str))
            {
            	n=Integer.parseInt(n_str.trim());//将行数转换成数字-整形int
            	
            }
            else {
				continue;
			}
            double r=Math.sqrt(n);
            int count=0;
            int y=0;
            //在x大于零的范围找到*4
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