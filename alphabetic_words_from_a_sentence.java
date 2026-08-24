class demo{
	public static void main(String[]args){
		String s = "abc 123 xyz";
		String s1 = "";
	for(int i=0 ; i<s.length() ; i++){
		char ch = s.charAt(i);
	if(ch >='a' && ch <= 'z'){
		s1 = s1+ch;
	}
		}
	System.out.println(s1);	
	}
		}	