package sxmxlp.gmail.com.finalapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import sxmxlp.gmail.com.finalapp.dagger.CoffeeComponent;
import sxmxlp.gmail.com.finalapp.dagger.CoffeeMaker;
import sxmxlp.gmail.com.finalapp.dagger.DaggerCoffeeComponent;

public class DaggerActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btn_click).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_click:
                handleClick();
                break;
            default:
                break;
        }
    }

    private void handleClick() {
        CoffeeComponent component = DaggerCoffeeComponent.create();
        CoffeeMaker maker = component.maker();
        maker.brew();
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, DaggerActivity.class);
        context.startActivity(intent);
    }
}
