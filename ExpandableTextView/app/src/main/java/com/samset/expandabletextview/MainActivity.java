package com.samset.expandabletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.samset.expandabletextview.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {
private ExpandableTextView expandableTextView;


    String str;
    private final String htmlText = "HTTP is the way modern applications network. It’s how we exchange data & media. Doing HTTP efficiently makes your stuff load faster and saves bandwidth.\n" +
            "\n" +
            "OkHttp is an HTTP client that’s efficient by default:\n" +
            "\n" +
            "HTTP/2 support allows all requests to the same host to share a socket.\n" +
            "Connection pooling reduces request latency (if HTTP/2 isn’t available).\n" +
            "Transparent GZIP shrinks download sizes.\n" +
            "Response caching avoids the network completely for repeat requests.\n" +
            "OkHttp perseveres when the network is troublesome: it will silently recover from common connection problems. If your service has multiple IP addresses OkHttp will attempt alternate addresses if the first connect fails. This is necessary for IPv4+IPv6 and for services hosted in redundant data centers. OkHttp initiates new connections with modern TLS features (SNI, ALPN), and falls back to TLS 1.0 if the handshake fails.\n" +
            "\n" +
            "Using OkHttp is easy. Its request/response API is designed with fluent builders and immutability. It supports both synchronous blocking calls and async calls with callbacks.\n" +
            "\n" +
            "OkHttp supports Android 2.3 and above. For Java, the minimum requirement is 1.7." +
            "If you would like to contribute code you can do so through GitHub by forking the repository and sending a pull request.\n" +
            "\n" +
            "When submitting code, please make every effort to follow existing conventions and style in order to keep the code as readable as possible. Please also make sure your code compiles by running mvn clean verify.\n" +
            "\n" +
            "Before your code can be accepted into the project you must also sign the Individual Contributor License Agreement (CLA)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        expandableTextView= (ExpandableTextView) findViewById(R.id.expand_text_view);
        expandableTextView.setText(htmlText);
    }
}
