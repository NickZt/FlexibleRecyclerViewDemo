package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main;

import android.view.ViewGroup;

import com.don11995.log.SimpleLog;

import ua.zt.mezon.audiology.hearingtest.presentations.widgets.flexiblerv.FlexibleBaseListAdapterCallback;
import ua.zt.mezon.audiology.hearingtest.presentations.widgets.flexiblerv.FlexibleListViewHolder;
import ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv.IFlexibleAdapterFactory;

/**
 * Created by NickZT on 13.10.2019.
 */
public class FLSpokenFactoryImpl extends IFlexibleAdapterFactory {
    private static final int TYPE_STRING = 0;
    private static final int TYPE_ITEM_OBJECT = 1;
    private static final int TYPE_ITEM_INT = 2;

    //    todo int as resource
    @Override
    public FlexibleListViewHolder newInstance(ViewGroup parent, int viewType,
                                              FlexibleBaseListAdapterCallback callback) {


        switch (viewType) {
            case TYPE_STRING:
                FLStrViewHolderImpl<String> tmp = new FLStrViewHolderImpl<String>(parent, callback);

//                calcColor(tmp);
                return tmp;
            case TYPE_ITEM_OBJECT:
                return new FLItemObjViewHolderImpl(parent, callback);
            default:
                return null;
//        }
        }
    }

//    private void calcColor(FLStrViewHolderImpl tmp) {
//        StaggeredGridLayoutManager.LayoutParams lp =
//                (StaggeredGridLayoutManager.LayoutParams) tmp.itemView.getLayoutParams();
//        if (lp.getSpanIndex() == 0) {
//            tmp.itemView.setBackgroundColor(tmp.itemView.getContext().getResources().getColor(R.color
//            .blue_300));
//        }
//    }


    @Override
    public int getItemViewType(Object o) {
        SimpleLog.d("TODEL GET CLASS getCanonicalName "
                + o.getClass().getCanonicalName()
                + " SNAme "
                + o.getClass().getSimpleName()
                + "  test "
                + (ItemObject.class.equals(o.getClass())));
        if (String.class.equals(o.getClass())) {
            SimpleLog.d("TODEL GET CLASS return TYPE_STRING; ");
            return TYPE_STRING;
        } else if (ItemObject.class.equals(o.getClass())) {
            SimpleLog.d("TODEL GET CLASS return TYPE_ITEM_OBJECT; ");
            return TYPE_ITEM_OBJECT;
        }
        return -1;
    }
}
