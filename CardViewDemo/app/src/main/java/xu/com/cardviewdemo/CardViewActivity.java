package xu.com.cardviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * CardViewDemo
 * 仿造一加社区的精彩活动页面
 *
 * @author chenxuxu
 * @date 2017/6/5
 */
public class CardViewActivity extends Activity {
    /**
     * 列表
     */
    private RecyclerView rv;
    /**
     * 数据
     */
    private List<CardViewBean> mData;
    /**
     * 适配器
     */
    private CardViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initData();
    }

    private void initUI() {
        rv = (RecyclerView) findViewById(R.id.rv);

        mData = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CardViewAdapter(this, mData);
        rv.setAdapter(adapter);
    }

    private void initData() {
        List<String> titles = new ArrayList<>();
        titles.add("周末加加油168期 五一假期你最想看的电影？");
        titles.add("期末加加班169期 去旅游时你的必带物品有哪些？");
        titles.add("周末加加油母亲节特辑：你将用什么方式陪伴妈妈");
        titles.add("周末加加油172期 你最爱吃什么馅的粽子？");
        titles.add("周末加加油173期 活动之我见");

        List<String> pics = new ArrayList<>();
        pics.add("img1");
        pics.add("img2");
        pics.add("img3");
        pics.add("img4");
        pics.add("img5");

        for (int i = 0; i < pics.size(); i++) {
            mData.add(new CardViewBean(pics.get(i), titles.get(i)));
        }

        adapter.notifyDataSetChanged();
    }

}
