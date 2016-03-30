import java.util.Arrays;

public class ZD {

	public static void main(String[]args){
		String nishishui = "wo shi ZD";
		int mingzi = nishishui.length();
		System.out.println("chang du:"+mingzi);
// 1
		int changdu = "wo shi zhoadi".length();
		System.out.println("chang du:"+changdu);
// 2
		String zdZD = " wo shi zhao di";
		int changDu = zdZD.length();
		System.out.println("chang du:"+changDu);
// 3
		String zD1 = "Wo shi IT jing ying";
		String zD2 = "wo shi IT jing ying";
		int zd = zD1.compareTo(zD2);
		if (zd == 0){
			System.out.println("yes");
        }else {
        	System.out.println("no");
        }
// 4      
        if (zd == 0){
        	System.out.println("yes");
        }else if (zd > 0){
            System.out.println("yes or no");
        }else if (zd < 0){
        	System.out.println("no");	
        }
// 5
        if (zD1.compareToIgnoreCase(zD2) == 0) {
        	System.out.println("yes");
        }else if (zD1.compareToIgnoreCase(zD2) > 0){
        	System.out.println("yes or no");
        }else if (zD1.compareToIgnoreCase(zD2) < 0){
        	System.out.println("no");
        }
// 6
        if (zD1.equals(zD2))
        	System.out.println("zD1=zD2");
// 7
        String xing = "zhao zhang";
        int index1 = xing.indexOf("k");
        int index2 = xing.indexOf("zh",2);
        int index3 = xing.lastIndexOf("zh");
        int index4 = xing.lastIndexOf("h",7);
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
// 8
        String xingg = "12345asd6789";
        int inii = xingg.lastIndexOf("s",6);
        System.out.println(inii);
// 9
        String xing2 = "zhao zhang";
        boolean innn = xing2.startsWith("zh");
        boolean innnn = xing2.startsWith("ao",2);
        boolean innnnn = xing2.endsWith("ng");
        System.out.println(innn);
        System.out.println(innnn);
        System.out.println(innnnn);
// 10
        String sub1 = " zhao di ".substring(2);
        String sub2 = " zhao di ".substring(1,3);
        String sub3 = " zhao di ".substring(9);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);
// 11
        String c1 = "zhao";
        String c2 = "di";
        c2 = c1.concat(c2);
        System.out.println(c2);
// 12
        String useValue = String.valueOf(12.365);
        System.out.println(useValue.substring(2));
// 13
        String name = "zhao,zhang,li,wang ";
        String names[] = name.split(",");
        System.out.println(names[2]);
// 14
        String namesAgai[] = "zhao.zhang.li.wang".split("\\.");
        System.out.println(Arrays.toString(namesAgai));
// 15
        String replac = "zhao di".replace('z','d');
        System.out.println(replac);
// 16
        String max = "zhaodi".toUpperCase();
        System.out.println(max);
// 17
        String min = "ZHAODI".toLowerCase();
        System.out.println(min);
// 18      
        String space = "    zhao   di ".trim();
        System.out.println(space);
// 19
        String[] array = {"z","hao","di"};
        System.out.println(array[2]);
// 20
        String[] arrys = new String[2];
        String[] arry = new String[]{"a","b","c"};
        for (String e :arry ) {
			System.out.println(e);
		}
// 21
		int[] list = {1,2,3,1};
        System.out.println(Arrays.toString(list));
// 22
        double[] myList = {1.2,3.9,4.8,7.3};
        for (int k = 1;k < myList.length; k++ ) {
            System.out.println(myList[k]);
        }
// 23
        int total = 0;
        for (int i = 1;i <= 100 ; i++) {
            total += i; 
	    }
            System.out.println(total);
// 24
        double[] maxList = {1,2,9.8,100.6,87,93};
        double max1 = maxList[0];
        for (int j = 1;j<maxList.length ;j++ ) {
            if (maxList[j]>max1) 
                max1 = maxList[j];
        }
            System.out.println("max:"+max1);
// 25
        for (int i =1 ; i < 10 ; i++ ){
        	for (int j=1; j < 10 ; j++ ){
                System.out.print(i+"*"+j+"="+i*j+" ");
                if (i==j){
                	break;
                }
        	}
        	    System.out.print("\n");
        }
//26
        int[] five = {1,8,6,3,7};
        int sum=0;
        for(int i = 0;i < five.length;i++){
             sum+=five[i];
        }
            System.out.println(sum);
       
       int[] p = {9,6,5,7,3,8,2,4};
		for (int i=0;i<p.length;i++) {
			for (int j=0;j<p.length;j++) {
				if(p[i]>p[j]){
					int temp = p[j];
					p[j] = p[i];
					p[i] = temp ;
				}	
			}
		}
		System.out.println(Arrays.toString(p));
 
    }
        

}
 