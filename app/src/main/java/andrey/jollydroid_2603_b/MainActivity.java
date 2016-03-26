package andrey.jollydroid_2603_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // пример изменения картинки текста через код
        /*
        MyView MyView=(MyView)findViewById(R.id.MyView);
       MyView.setImage(R.drawable.yagoda);
        MyView.setText("yagoda");
        */
    }
}
