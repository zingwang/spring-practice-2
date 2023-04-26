
public class MyDataSoruceEnvConfig {
     private final Enviroment env;

     public MyDataSoruceEnvConfig(Enviroment env){
         this.env=env;
     }

     @Bean
     public MyDataSource myDataSource(){
         String url= env.getProperty("my.datasource.url");
         String username= env.getProperty("my.datasource.username");
         String password= env.getProperty("my.datasource.password");
         int maxConnection= env.getProperty("my.datasource.etc.max-connectioin", Integer.class);
         Duration timeout= env.getProperty("my.datasource.etc.timeout",Duration.class;
         List<String> options= env.getProperty("my.datasource.etc.options",List.class);

        return new myDataSource(url,username,password,maxConnection,timeout,options);
     }
}