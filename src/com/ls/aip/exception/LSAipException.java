package com.ls.aip.exception;

public class LSAipException {
    private String errorMsg;
    private int errorCode;
    public LSAipException(int code,String msg){
        this.errorCode=code;
        this.errorMsg=msg;
    }
    public LSAipException(int code,Throwable e){
        this.errorCode=code;
        this.errorMsg=e.getMessage();
    }
    public String getErrorMsg(){
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}
