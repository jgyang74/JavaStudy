package algo;

class Caesar {
	String caesar(String s, int n) {
		String result = "";
		// �Լ��� �ϼ��ϼ���.
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
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("Fb KdNl EkcLXqrigddzjtnNKHFomENUsHWcwDYLFxrhsnMJXj", 35));
	}
	//caesar("Fb KdNl EkcLXqrigddzjtnNKHFomENUsHWcwDYLFxrhsnMJXj",35)�� ����� Ʋ���ϴ�. expected:<[Ok TmWu NtlUGzarpmmiscwWTQOxvNWDbQFlfMHUOgaqbwVSGs]> but was:<[iii]>
}
