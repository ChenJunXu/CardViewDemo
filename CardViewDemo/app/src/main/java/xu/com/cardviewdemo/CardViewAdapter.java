package xu.com.cardviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * cardview适配器
 *
 * @author chenxuxu
 * @date 2017/6/6
 */
public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private Context mContext;
    private List<CardViewBean> mDatas;

    public CardViewAdapter(Context context, List<CardViewBean> datas) {
        this.mContext = context;
        this.mDatas = datas;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        CardViewBean bean = mDatas.get(position);
        holder.iv_pic.setImageResource(mContext.getResources().getIdentifier(bean.getPic(), "drawable", mContext.getPackageName()));
        holder.tv_title.setText(bean.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mDatas == null) {
            return 0;
        }
        return mDatas.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_pic;
        private TextView tv_title;

        public CardViewHolder(View itemView) {
            super(itemView);
            iv_pic = (ImageView) itemView.findViewById(R.id.iv_pic);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
