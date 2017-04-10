

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sortedlinks.Link;
import sortedlinks.SortedLinks;

/**
 *
 * @author JJ
 */
public class LinkTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testLink()
    {
       Link link = new Link("https://www.kiekko.tk/player/first");
       for(int i = 0; i < link.getRoutes().length; i++)
       {
           System.out.println(link.getRoutes()[i]);
       }
        Assert.assertFalse("dns: " + link.getDns() + " query: " + link.getQueryString()
        +" has ssl " + link.hasSSL(), true);
    }
    @Test
    public void testList()
    {
        String[] links = {"https://www.testi.tk", "http://www.testi.tk/player/1",
        "https://www.testi.tk/moi", "https://www.testi.tk", "https://www.testi.tk"};
                SortedLinks sl = new SortedLinks();
        for(int i = 0; i < links.length; i++)
        {
            sl.addToList(links[i]);
        }
        System.out.println(sl.amountUniqueDns());
        System.out.println(sl.amountUniqueLinks());
    }
}
