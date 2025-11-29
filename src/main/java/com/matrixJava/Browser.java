package main.java.com.matrixJava;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Browser {
    public static void main(String[] args) {
        String url = "http://www.desmos.com/api/v1.3/calculator.js?apiKey=dcb31709b452b1cf9dc26972add0fda6";

        if(Desktop.isDesktopSupported()){
        	System.out.println("if(Desktop.isDesktopSupported()");
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
            	System.out.println("print stack trace");
                e.printStackTrace();
            }
        }else{
        	System.out.println("else (Desktop.isDesktopSupported()");
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}