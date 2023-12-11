package com.exam.alvarochaparro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Arranque extends AppCompatActivity {
    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }
    ImageView recetas, tureceta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_arranque);
        openLogin();

        //AGREGAR ANIMACIONES
        final Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.bajar);
        final  Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.izquierda);





        recetas = findViewById(R.id.receta);
        tureceta = findViewById(R.id.tureceta);

        recetas.startAnimation(animacion1);
        tureceta.startAnimation(animacion2);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                recetas.startAnimation(animacion1);
                tureceta.startAnimation(animacion2);


               /* Intent siguiente = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(siguiente);
                finish();*/
            }
        }, 4000);
    }

}