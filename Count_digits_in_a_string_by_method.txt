class demo{
	public static void main(String[]args){
		String s = "xyz012ab34y5";
		StringBuffer sb = new StringBuffer();
		int count = 0;
	for(int i=0 ; i<s.length() ; i++){
		char ch = s.charAt(i);
		if(Character.isDigit(ch)){
			count++;
	}
		}
	System.out.println(count);
	}
		}