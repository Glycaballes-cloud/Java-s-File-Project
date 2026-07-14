public class Example {
    public String publicVar;
    private String privateVar;
    protected String protectedVar;

    public String getPublicVar(){
        return publicVar;
    }
    public void setPublicVar(String publicVar){
        this.publicVar = publicVar;
    }
    
    public String getProtectedVar(){
        return protectedVar;
    }
    public void setProtectedVar(String protectedVar){
        this.protectedVar = protectedVar;
    }

    public void setPrivateVar(String value) {
        this.privateVar = value;
    }

    public String getPrivateVar() {
        return this.privateVar;
    }

}
