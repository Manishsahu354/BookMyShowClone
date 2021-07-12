package com.chaithanya.bookmyshow.constant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chaithanya.bookmyshow.R;

public class adderView extends LinearLayout implements View.OnClickListener {


    private int value = 1;
    private int minValue = 1;
    private int maxValue = 10;
    private final TextView tvCount;

    public adderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = View.inflate(context, R.layout.fragment_payment_event, this);
        ImageView btn_reduce = (ImageView) view.findViewById(R.id.btnReduce);
        tvCount = (TextView) view.findViewById(R.id.tv_count);
        ImageView btn_add = (ImageView) view.findViewById(R.id.btnIncrease);
        btn_reduce.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        //Set the default value
        int value = getValue();
        setValue(value);
    }

   // @OnClick({R.id.btnReduce, R.id.btnIncrease})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnReduce://Less
                reduce();
                break;
            case R.id.btnIncrease://plus
                add();
                break;
        }
    }

    /**
           * If the current value is greater than the minimum value minus
     */
    private void reduce() {
        if (value > minValue) {
            value--;
        }
        setValue(value);
        if (onValueChangeListene != null) {
            onValueChangeListene.onValueChange(value);
        }
    }

    /**
           * If the current value is less than the minimum value, add
     */
    private void add() {
        if (value < maxValue) {
            value++;
        }
        setValue(value);
        if (onValueChangeListene != null) {
            onValueChangeListene.onValueChange(value);
        }
    }

    //Get specific value
    public int getValue() {
        String countStr = tvCount.getText().toString().trim();
        if (countStr != null) {
            value = Integer.valueOf(countStr);
        }
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        tvCount.setText(value + "");
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnReduce://Less
                reduce();
                break;
            case R.id.btnIncrease://plus
                add();
                break;
        }
    }


    //Monitor callback
    public interface OnValueChangeListener {
        public void onValueChange(int value);
    }

    private OnValueChangeListener onValueChangeListene;

    public void setOnValueChangeListene(OnValueChangeListener onValueChangeListene) {
        this.onValueChangeListene = onValueChangeListene;
    }
}