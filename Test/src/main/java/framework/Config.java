package framework;

public class Config {

    private static String url = getEnvVar("url");
    private static String browser = getEnvVar("browser");




    public static String getEnvVar(String name){
       String value = System.getenv(name);
       value = value == null?null : value.trim();
        if (value != null) {
            return value;
        }
        return null;
    }

    public static String getBrowser(){
        if(browser == null){
            browser = "chrome";
        }
        return browser;

    }

    public static String getUrl(){
        if(url == null){
            url = "http://localhost";
        }
        return url;
    }


}
