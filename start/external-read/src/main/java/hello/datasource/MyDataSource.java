package hello.datasource;

@Sl4j
public class MyDataSource{

    private String url;
    private String username;

    public MyDataSource(String url, String username, String password, int maxConnection, Duration timeout, List<String> options) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.maxConnection = maxConnection;
        this.timeout = timeout;
        this.options = options;
    }

    private String password;
    private int maxConnection;
    private Duration timeout;
    private List<String> options;

    @PostConstruct
    public void init(){
        log.info("url={}",url);
        log.info("username={}",username);
        log.info("password={}",password);
        log.info("maxConnection={}",maxConnection);
        log.info("timeout={}",timeout);
        log.info("options={}",options);
    }

}