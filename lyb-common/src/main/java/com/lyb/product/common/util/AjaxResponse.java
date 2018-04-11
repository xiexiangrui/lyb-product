package com.lyb.product.common.util;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-09 17:13
 **/
public class AjaxResponse {
    public AjaxResponse()
    {
        this.success = true;
    }

    public AjaxResponse(boolean success)
    {
        this.success = success;
    }

    public AjaxResponse(boolean success, String message)
    {
        this.success = success;
        this.message = message;
    }

    public AjaxResponse failure(String message)
    {
        this.message = message;
        this.success = false;
        return this;
    }

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static AjaxResponse returnSuccess(Object data, String message){
        AjaxResponse obj = new AjaxResponse();
        obj.setData(data);
        obj.setMessage(message);
        return obj;
    }

    public static AjaxResponse returnError(Object data, String message){
        AjaxResponse obj = new AjaxResponse();
        obj.setData(data);
        obj.setMessage(message);
        obj.setSuccess(false);
        return obj;
    }
}
