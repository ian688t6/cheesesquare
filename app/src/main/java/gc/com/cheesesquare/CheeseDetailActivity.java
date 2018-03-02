package gc.com.cheesesquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CheeseDetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "cheese_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese_detail);
    }
}
