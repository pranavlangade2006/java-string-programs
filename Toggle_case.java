class demo{
	public static void main(String[]args){
		String s= "PrAnAv";
		StringBuffer sb = new StringBuffer();
		
	for(int i=0 ; i< s.length() ; i++){
		char ch = s.charAt(i);
	if(Character.isUpperCase(ch)){

		ch = Character.toLowerCase(ch);
		sb.append(ch);
	}else
	{
		ch = Character.toUpperCase(ch);
		sb.append(ch);
	}
		}
	
	System.out.println(sb.toString());
}
	}