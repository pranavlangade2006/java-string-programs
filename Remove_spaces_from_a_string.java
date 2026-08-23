class demo {
    public static void main(String[] args) {
        String s = "java dsa coures";
        StringBuffer sb = new StringBuffer(); 
        
              String[] a = s.split(" "); 
        
               for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);         
	}	
        
        System.out.println(sb.toString()); 
    }
}