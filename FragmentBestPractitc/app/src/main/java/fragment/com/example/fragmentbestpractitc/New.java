package fragment.com.example.fragmentbestpractitc;

/**
 * Created by Administrator on 2023/4/20 0020.
 */

public class New {

    public  New(String title, String content){
        this.title = title;
        this.content = content;
    }
    private String title;
    private String content;

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
