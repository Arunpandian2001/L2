package string1;

public class Program5 {
	public static void main(String[] args) {
		System.out.println(reverseWords( "sj.m.yof.x..mugoza.n....fq.m..qr.v.ibq.d.ukk...kpj.d.....xj.n.zkc.pj.urqk.znnn..rjwc.vuub.ums.fc.dn..met.vvh.k\n"
				+ ".uxqr.wrcdjpcrxkrfec.t.rfdz.urzlcvb..xjagq.m.m..j.c.l.wzttldoud.zc..cw.g.rjmne........q."));
	}
	static String reverseWords(String S)
    {
				
		int length=S.length();
        String [] collection=S.split("\\.");
		StringBuilder builder=new StringBuilder();
		boolean loop=true;
		for(int i=0;i<collection.length;i++) {
			String s=collection[i];
			for(int j=s.length()-1;j>=0;j--) {
				builder.append(s.charAt(j));
			}
			if(i<collection.length-1) {
				builder.append(".");
			}
		
		}
		while(loop){
		    if(S.charAt(length-1)=='.') {
		    	builder.append(".");
		    	length--;
	    	}else{
	    	    loop=false;
	    	}
		}
        return builder.toString();
    } 
}
