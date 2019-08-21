package com.entity;

import lombok.Data;

/**
 * @Author: yuisama
 * @Date: 2019-08-06 10:22
 * @Description:前端发送给后端的信息实体类
 * 群聊:{"msg":"777","type":1}
 * 私聊:{"to":"0-","msg":"33333","type":2}
 */
@Data
public class MessageFromClient {
    // 私聊的对象SessionID
    private String to;
    // 聊天信息
    private String msg;
    // 聊天类别: 1表示群聊 2表示私聊
    private String type;

}
