package service;

public class WsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebServcieImplService factory=new WebServcieImplService();
    WebServcieImpl wsImpl=factory.getWebServcieImplPort();
    String resResult=wsImpl.sayHello("haha");
    System.out.println("resResult==="+resResult);
	}

}
