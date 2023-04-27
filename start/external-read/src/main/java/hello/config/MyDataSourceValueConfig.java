

@Configuration
public class MyDataSoruceValueConfig {

    @Value("$my.datasource.url")
    private String url;

    @Value("$my.datasource.username")
    private String username;

    @Value("$my.datasource.password")
    private String password;

    @Value("$my.datasource.maxConnection")
    private int maxConnection;

    @Value("$my.datasource.timeout")
    private Duration timeout;

    @Value("$my.datasource.options")
    private List<String> options;

    @Bean
    public MyDataSource myDataSource1(){
        return new MyDataSource(url,username,password,maxConnection,timeout,options);
    }

    @Bean
    public MyDataSource myDataSource2(@Value("$my.datasource.url") String url,
                                      @Value("$my.datasource.password") String password){
        return new MyDataSource(url,username,password,maxConnection,timeout,options);
    }
}