package com.biyun.order.starter;

public enum ApiErrorCode {

    PARAM_ERROR("1000", "参数错误"),

    FILE_NOT_FOUND("1001", "文件不存在"),

    FILE_TYPE_ERROR("1002", "文件类型错误"),

    FILE_SIZE_ERROR("1003", "文件大小错误"),

    FILE_UPLOAD_ERROR("1004", "文件上传失败"),

    FILE_DOWNLOAD_ERROR("1005", "文件下载失败"),

    FILE_NAME_EMPTY("1007", "文件名不能为空"),

    FILE_DELETE_ERROR("1006", "文件删除失败");

    private final String code;
    private final String message;

    // 添加构造函数
    ApiErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
