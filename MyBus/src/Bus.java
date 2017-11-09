
public class Bus {
	IntegrationClientAPI api = new IntegrationClientAPI("D:\\esbclient.properties");
    
    // �� ���� Ȱ���� ����ó���� �Ѵ�.
    System.out.println("---------------------------------------------");
    api.auth(UserType.USER);

    // �� ���� Ȱ���ڸ� ���� ���� ����Ű�� �����ȴ�. 
    String madesskey = api.makeMobileKey("A12345", "test");

    // �� ���� Ȱ���ڸ� ���� ���� ����Ű(session key)�� ������ �� ���� ������ ����Ѵ�.
    api.sendSessionKey(madesskey);
    
    System.out.println("===========================[Session Key Result]===========================");
    System.out.println("[INFO] made SessionKey : " + madesskey);    
    System.out.println();
    IntegrationClientAPI api = new IntegrationClientAPI("D:\\esbclient.properties");

    // �� ���� Ȱ���� ����ó���� �Ѵ�.
    System.out.println("---------------------------------------------");
    api.auth(UserType.USER);

    // �� ���� Ȱ���ڸ� ���� ���� ����Ű�� �����ȴ�.
    String madesskey = api.makeMobileKey("A12345", "test");

    // �� ���� Ȱ���ڸ� ���� ���� ����Ű(session key)�� ������ �� ���� ������ ����Ѵ�.
    api.sendSessionKey(madesskey);
    
    System.out.println("===========================[Session Key Result]===========================");
    System.out.println("[INFO] made SessionKey : " + madesskey);    
    System.out.println();

    /*-------------------------------------------------------------------------------------*/
    // REST ������ ȣ�� GET
    /*-------------------------------------------------------------------------------------*/
    wstype = WebSvcType.REST; // REST Type


    //�Է°�
    //�����뼱ID busRouteId : 100100223
    URI = "http://ws.bus.go.kr/api/rest/buspos/getBusPosByRtid?busRouteId=100100223"; // URI�� �����Ѵ�.
    filename = null; // GET ��û�� ��û �Ķ���Ͱ� �ʿ����
    reqStr = null;

    // REST �� ��쿡�� Message Header�� �����Ѵ�.
    // SOAP �� ��쿡�� SOAP �޽����� Message Header�� �ۼ��Ѵ�.
    headerCnt = api.setHeaderCnt("serviceKey", "requestTime", "callbackURI", "reqMsgID");

    // REST �� ���񽺸� ȣ���Ѵ�.
    retval = api.send(wstype, URI, reqStr, headerCnt);
    
    // ��ȯ���� ����Ѵ�.
    System.out.println("===========================[REST GET Request Result]===========================");
    System.out.println(retval);
    System.out.println();
                
}
