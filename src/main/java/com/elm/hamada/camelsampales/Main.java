/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.hamada.camelsampales;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.camel.language.Simple;

/**
 *
 * @author hyousef
 */
public class Main {

    public static void main(String[] args) throws ParseException {
         SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        Date first = df.parse("201902101330");
        Date  second = df.parse("201902091330");
       
        
        
        System.out.println(first.after(second));

    }
}
