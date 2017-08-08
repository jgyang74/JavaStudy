package javaBasic;

public class BizService {
	public void bizMethod(int i) throws BizException {
		System.out.println("bizMethod starts");
		
		if(i<0)
			throw new BizException("parameter is greater than 0");
		
		System.out.println("bizMethod ends");
	}
}
