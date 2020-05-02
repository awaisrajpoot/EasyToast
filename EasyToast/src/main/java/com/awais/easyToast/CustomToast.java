package com.awais.easyToast;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CustomToast extends Toast {

    public final static int HAPPY_ICON = R.drawable.ic_launcher_background;

    private TextView textView;
    private CardView cardView,imageHolder;
    private ImageView imageView;

    private int defaultDuration = 0;

    Context context;

    public CustomToast(Context context, String str) {
        super(context);

        this.context = context;

        cardView = (CardView)((AppCompatActivity)context).
                getLayoutInflater().inflate(R.layout.toast_layout,null);

        textView = cardView.findViewById(R.id.textView);

        showToast(str, defaultDuration);
    }

    public CustomToast(Context context, String str, int color) {
        super(context);

        this.context = context;

        cardView = (CardView)((AppCompatActivity)context).
                getLayoutInflater().inflate(R.layout.toast_layout,null);

        cardView.setCardBackgroundColor(color);

        textView = cardView.findViewById(R.id.textView);

        showToast(str,defaultDuration);
    }

    public CustomToast(Context context, String str, int bgcolor, int textColor) {
        super(context);

        this.context = context;

        cardView = (CardView)((AppCompatActivity)context).
                getLayoutInflater().inflate(R.layout.toast_layout,null);

        cardView.setCardBackgroundColor(bgcolor);

        textView = cardView.findViewById(R.id.textView);
        textView.setTextColor(textColor);

        showToast(str,defaultDuration);
    }

    public CustomToast(Context context, String str, int bgcolor, int textColor, int duration) {
        super(context);

        this.context = context;

        cardView = (CardView)((AppCompatActivity)context).
                getLayoutInflater().inflate(R.layout.toast_layout,null);

        cardView.setCardBackgroundColor(bgcolor);

        textView = cardView.findViewById(R.id.textView);
        textView.setTextColor(textColor);

        showToast(str,duration);
    }

    public void setIcon(int rs){
        imageHolder = cardView.findViewById(R.id.imageHolder);
        imageHolder.setVisibility(View.VISIBLE);
        imageView = cardView.findViewById(R.id.image_view);
        imageView.setImageResource(rs);
    }

    private void showToast(String s,int duration){
        textView.setText(s);
        if(duration==0){
            setDuration(Toast.LENGTH_SHORT);
        }else {
            setDuration(Toast.LENGTH_LONG);
        }
        setView(cardView);
        show();
    }


}
