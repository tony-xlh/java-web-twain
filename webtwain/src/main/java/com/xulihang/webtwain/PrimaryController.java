package com.xulihang.webtwain;

import java.io.IOException;

import ca.weblite.webview.WebViewCLIClient;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void scanDocuments() throws IOException {
    	 WebViewCLIClient client;
         client = (WebViewCLIClient)new WebViewCLIClient.Builder()
         .url("https://demo.dynamsoft.com/web-twain/")
         .title("Document Scanner")
         .size(800, 600)
         .build();
    }
}
