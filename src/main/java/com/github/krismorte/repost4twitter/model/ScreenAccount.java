/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.krismorte.repost4twitter.model;

import com.towel.el.annotation.Resolvable;
import lombok.Data;

/**
 *
 * @author krismorte
 */
@Data
public class ScreenAccount {
    
    @Resolvable(colName = "")
    private boolean selected;
    @Resolvable(colName = "Type")
    private String type;
    @Resolvable(colName = "Account")
    private String username;
    
    public void chooseTwitter(){
        setType("TWITTER");
    }
    
    public boolean isTwitter(){
        return "TWITTER".equals(type);
    }
}
