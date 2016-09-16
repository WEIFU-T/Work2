package cn.edu.gdmec.s07150836.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("work2","我启动了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("work2","加塞");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("work2","我现形了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("work2","暂停");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("work2","结束");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("work2","重启");
    }
}
