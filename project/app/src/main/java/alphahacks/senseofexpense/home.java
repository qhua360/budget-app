package alphahacks.senseofexpense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void expenses(View view) {
        Intent intent = new Intent(this, expenses.class);
        startActivity(intent);
    }

    public void income(View view) {
        Intent intent = new Intent(this, income.class);
        startActivity(intent);
    }
}
