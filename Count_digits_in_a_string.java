class demo{
	public static void main(String[]args){
		String s = "xyz012ab34y5";
		String s1 = "";
		int count = 0;
	for(int i=0 ; i<s.length() ; i++){
		char ch = s.charAt(i);
		if(ch>'0' && ch<'9'){
		s1 = s1+ch;
			count++;
	}
		}
	System.out.println(count);
	}
		}