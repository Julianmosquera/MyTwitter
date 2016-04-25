
package t4j;

import java.util.List;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author julian
 */
public class T4j {

   
    public static void main(String[] args) throws TwitterException {
        //Creamos el objeto builder de confi

//        ConfigurationBuilder cb = new ConfigurationBuilder();
//        cb.setDebugEnabled(true)
//                .setOAuthConsumerKey("Zlpvsb5q1bDH7EfZLZusgfogf")
//                .setOAuthConsumerSecret("pJjfCDd5b1hsMhVPEmwt4LgAYOBcctjrjdOIofhWI1YNk065f5")
//                .setOAuthAccessToken("184950863-WLuPkOH8BwWRV8c25ASOsXnOMfu340fDhOwymcAI")
//                .setOAuthAccessTokenSecret("03VqDdFGjCkl4od3NGT2MZ0SQYyWwE1SxhskIM2s6z3Mv");
     // TwitterFactory tf = new TwitterFactory(cb.build());
  
       Twitter mitwitter = new TwitterFactory().getInstance();
        
  

   //post
        
//        Status mistatus = mitwitter.updateStatus("Probando en Java");
//    System.out.println("Successfully updated the status to [" + mistatus.getText() + "].");
//        
    //creando via propeties
        
        
        
        
        
        
        
        
        
        
        
    //timeline
    
//    Twitter twitter = TwitterFactory.getSingleton();
    List<Status> statuses = mitwitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status status : statuses) {
        System.out.println(status.getUser().getName() + ":" +
                           status.getText());
    }

     Query query = new Query("hola");
    QueryResult result = mitwitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
    }

    
    
    //DM
    
//    
//    DirectMessage message = mitwitter.sendDirectMessage(, message);
//    System.out.println("Sent: " message.getText() + " to @" + message.getRecipientScreenName());
//        
//    }

}
}