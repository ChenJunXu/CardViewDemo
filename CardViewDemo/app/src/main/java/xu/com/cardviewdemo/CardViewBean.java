package xu.com.cardviewdemo;

import java.io.Serializable;

/**
 * bean
 *
 * @author chenxuxu
 * @date 2017/6/5
 */
public class CardViewBean implements Serializable {
    /**
     * 图片
     */
    private String pic;
    /**
     * 标题
     */
    private String title;

    public CardViewBean(String pic, String title) {
        this.pic = pic;
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
