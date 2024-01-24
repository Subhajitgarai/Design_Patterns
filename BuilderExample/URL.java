package BuilderExample;

public class URL {
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;
    public URL(){

    }
    public URL(String protocol){
        this.protocol=protocol;
    }
    public URL(String protocol,String hostname){
       this.protocol=protocol;
       this.hostname=hostname;
    }
    public URL(String protocol,String hostname,String port){
        this.protocol=protocol;
        this.hostname=hostname;
        this.port=port;
    }
    public URL(String protocol,String hostname,String port,String pathParam){
        this.protocol=protocol;
        this.hostname=hostname;
        this.port=port;
        this.pathParam=pathParam;
    }
    public URL(String protocol,String hostname,String port,String pathParam,String queryParam){
        this.protocol=protocol;
        this.hostname=hostname;
        this.port=port;
        this.pathParam=pathParam;
        this.queryParam=queryParam;
    }

    public void setProtocol(String protocol){
        this.protocol=protocol;
    }
    public String getProtocol(){
        return protocol;
    }

    public void setHostName(String hostname){
        this.hostname=hostname;
    }
    public String getHostName(){
        return hostname;
    }

    public void setPort(String port){
       this.port=port;
    }
    public String getPort(){
        return port;
    }
    public void setpathParam(String pathParam){
       this.pathParam=pathParam;
    }
    public String getpathParam(){
        return pathParam;
    }

    public void setqueryParam(String queryParam){
       this.queryParam=queryParam;
    }
    public String getqueryParam(){
        return queryParam;
    }


}
