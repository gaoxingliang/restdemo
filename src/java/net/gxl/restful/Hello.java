/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.gxl.restful;

import javax.ws.rs.Path;

/**
 * 该类用于演示jersey的使用
 * @author gaoxingliang
 */
@Path("/hello")
public class Hello {
    
    
    public String sayPlainTextHello(){
        return "Hello Jersey";
    }
}
