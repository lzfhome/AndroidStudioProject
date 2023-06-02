package uilayout_example.com.example.chartlayout;

/**
 * Created by Administrator on 2023/4/19 0019.
 */

public class Message {
    public static final int TYPE_RECCIVER = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;


    public Message(String content, int type){
        this.content = content;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}
