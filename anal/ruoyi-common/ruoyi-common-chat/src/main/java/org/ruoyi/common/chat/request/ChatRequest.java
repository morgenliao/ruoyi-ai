package org.ruoyi.common.chat.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.ruoyi.common.chat.entity.chat.Content;
import org.ruoyi.common.chat.entity.chat.Message;

import java.util.List;

/**
 * 描述：
 *
 * @author https:www.unfbx.com
 * @sine 2023-04-08
 */
@Data
public class ChatRequest {

    @NotEmpty(message = "传入的模型不能为空")
    private String model;

    @NotEmpty(message = "对话消息不能为空")
    List<Message> messages;

    List<Content> imageContent;

    private String prompt;

    private String userId;

    /**
     * 知识库id
     */
    private String kid;

    /**
     * gpt的默认设置
     */
    private String systemMessage = "";

    private double top_p = 1;

    private double temperature = 0.2;

    /**
     * 上下文的条数
     */
    private Integer contentNumber = 10;

    /**
     * 是否携带上下文
     */
    private Boolean usingContext = Boolean.TRUE;

}
