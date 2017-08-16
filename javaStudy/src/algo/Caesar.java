package algo;

class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// 함수를 완성하세요.
    int slength = s.length();
	String str[] = new String[slength];
	
	
    
 
    
    
    for(int i=0;i<tmp.length;i++) {
    
    	if(isUpper(tmp[i].toString())) {
        	String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        	//System.out.println(alphabets.indexOf(tmp[i])); 
        	//System.out.println((alphabets.indexOf(tmp[i])+(n%26))%26);
        	int position = (alphabets.indexOf(tmp[i])+(n%26))%26;
        	//System.out.println(alphabets.charAt(position));
        	result += String.valueOf(alphabets.charAt(position))+' ';
        	
        	
        	
    	} else {
        	String alphabets = "abcdefghijklmnopqrstuvwxyz";
        	//System.out.println(alphabets.indexOf(tmp[i]));
        	//System.out.println((alphabets.indexOf(tmp[i])+(n%26)%26);
        	int position = (alphabets.indexOf(tmp[i])+(n%26))%26;
        	//System.out.println(alphabets.charAt(position));
        	result += String.valueOf(alphabets.charAt(position))+' ';
    	} 			
    	
    }
    
		return result;
	}
	
	public static boolean isUpper(String s)
	{
	    for(char c : s.toCharArray())
	    {
	        if(! Character.isUpperCase(c))
	            return false;
	    }

	    return true;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("Fb KdNl EkcLXqrigddzjtnNKHFomENUsHWcwDYLFxrhsnMJXj", 35));
	}
	//caesar("Fb KdNl EkcLXqrigddzjtnNKHFomENUsHWcwDYLFxrhsnMJXj",35)의 결과가 틀립니다. expected:<[Ok TmWu NtlUGzarpmmiscwWTQOxvNWDbQFlfMHUOgaqbwVSGs]> but was:<[iii]>
}
