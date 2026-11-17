package OOP;

abstract class ApiClient {
    private String clientName;
    private int requestCount;

    public ApiClient(String clientName){
        this.clientName = clientName;
        this.requestCount = 0;
    }

    public String getClientName(){
        return clientName;
    }

    public int getRequestCount(){
        return requestCount;
    }

    protected void incrementRequestCount(){
        requestCount ++;
    }

    public abstract int getRequestLimit();

    public void sendRequest(){
        if (requestCount < getRequestLimit()){
            incrementRequestCount();
            System.out.println("Request accepted for " + clientName);
        }else {
            System.out.println("Rate limit exceeded for " + clientName);
        }
    }
}
interface Resettable {
    void resetRequests();
}

class FreeApiClient extends ApiClient implements Resettable{
    public FreeApiClient(String clientName){
        super(clientName);
    }

    @Override
    public int getRequestLimit(){
        return 3;
    }

    @Override
    public void resetRequests(){
        System.out.println("Resetting free client requests");
    }
}

class PremiumApiClient extends ApiClient {

    public PremiumApiClient(String clientName){
        super(clientName);
    }

    @Override
    public int getRequestLimit(){
        return 5;
    }
}

public class ApiRateLimitingDemo {
    public static void main(String []args){

        ApiClient[] clients = {
                new FreeApiClient("Student App"),
                new PremiumApiClient("Business App")
        };

        for(ApiClient client : clients) {
            System.out.println("Client: " + client.getClientName());
            System.out.println("Request Limit: " + client.getRequestLimit());

            for (int i = 0; i < 6; i++){
                client.sendRequest();
            }

            System.out.println("Total Accepted Requests: " + client.getRequestCount());

            System.out.println();
        }

        Resettable reset = (Resettable) clients[0];
        reset.resetRequests();
    }
}