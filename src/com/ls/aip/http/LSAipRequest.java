package com.ls.aip.http;

import com.ls.aip.util.LSAipClientConfiguration;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LSAipRequest {
    private HashMap<String, String> headers;
    private HashMap<String, String> params;
    private HashMap<String, Object> body;
    private URI uri;
    private LSHttpMethodName httpMethod;
    private LSEBodyFormat bodyFormat;
    private String contentEncoding;
    private LSAipClientConfiguration config;

    public LSAipRequest() {
        this.headers = new HashMap();
        this.params = new HashMap();
        this.body = new HashMap();
        this.httpMethod = LSHttpMethodName.POST;
        this.bodyFormat = LSEBodyFormat.FORM_KV;
        this.contentEncoding = "UTF8";
        this.config = null;
    }

    public LSAipRequest(HashMap<String, String> header, HashMap<String, String> bodyParams) {
        this.headers = header;
        this.params = bodyParams;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public LSEBodyFormat getBodyFormat() {
        return this.bodyFormat;
    }

    public void setBodyFormat(LSEBodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
        if (key.equals("Content-Encoding")) {
            this.contentEncoding = value;
        }
    }

    public void addParam(String key, String value) {
        this.params.put(key, value);
    }

    public void addBody(String key, Object value) {
        this.body.put(key, value);
    }

    public void addBody(HashMap other) {
        if (other != null) {
            this.body.putAll(other);
        }
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public String getBodyStr() {
        ArrayList<String> arr = new ArrayList();
        if (this.bodyFormat.equals(LSEBodyFormat.FORM_KV)) {
            Iterator var5 = this.body.entrySet().iterator();
            while (true) {
                while (var5.hasNext()) {
                    Map.Entry<String, Object> entry = (Map.Entry<String, Object>) var5.next();
                    if (entry.getValue() != null && !entry.getValue().equals("")) {
//                        arr.add(String.format("%s=%s",))
                    }
                }
            }
        }

        return "123";
    }


}
