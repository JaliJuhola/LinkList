/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedlinks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JJ
 */
public class SortedLinks {
    private Map<String, List<Link>> listOfLinks;
    private int uniqueDns;
     
     public SortedLinks()
     {
         this.listOfLinks = new HashMap<String, List<Link>>();
         this.uniqueDns = 0;
     }
     public SortedLinks(String[] links)
     {
         for(int i = 0; i < links.length; i++) {
             
         }
     }
     public boolean addToList(String list)
     {
         return true;
     }
    
}
