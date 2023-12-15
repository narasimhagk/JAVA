// Copying an array
/* Syntax:
      public static void main(String[] args){
		  Objectsrc,intsrcPos,objdest,intdestPos,intLnegth
	  }
 */
 class Arr4{
	 public static void main(String[] args){
		 int[] from={1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16,17,18,19,20};
		 int[] to=new int[10];
		 System.arraycopy(from,6,to,0,10);
		//Integer s=to;
		System.out.println(to);
	 }
 } 
 /* class Arr4{
	 public static void main(String[] args){
		 char[] c={'a','b','c','d','e','f','g','h','i'};
		 char[] f=new char[8];
		 System.arraycopy(c,2,f,0,7);
		
		 System.out.println(f);
	 }
 } */