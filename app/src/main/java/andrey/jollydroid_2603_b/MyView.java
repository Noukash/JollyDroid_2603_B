package andrey.jollydroid_2603_b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyView extends LinearLayout {
    String text;
    private ImageView mImage;
    TextView title;
    String titleText="00";
   Drawable Image;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);


         {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Options, 0, 0);
                 titleText = a.getString(R.styleable.Options_titleText);
                 Image = a.getDrawable(R.styleable.Options_Image);
                 a.recycle();

        }

        inflate(context,R.layout.image_text, this);
        title = (TextView)findViewById(R.id.item_text);
        title.setText(titleText);

        mImage = (ImageView)findViewById(R.id.item_image);
        mImage.setImageDrawable(Image);
    }



    public void setImage(int image) {
        mImage.setImageResource(image);
    }
    public void setText(String text){
        title.setText(text);
    }

} 