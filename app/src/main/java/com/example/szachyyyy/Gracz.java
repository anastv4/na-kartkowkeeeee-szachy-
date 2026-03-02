package com.example.szachyyyy;

import android.os.CountDownTimer;
import android.widget.Button;

public class Gracz {
    private int ileSekund = 180;
    private boolean czyaktywny;
    private CountDownTimer countDownTimer;
    private Button button;

    public Gracz(boolean czyaktywny, Button button) {
        this.czyaktywny = czyaktywny;
        this.button = button;
        if(czyaktywny){
            uruchomZegar();
        }
    }
    private void uruchomZegar(){
        countDownTimer = new CountDownTimer(ileSekund*1000,1000) {
            @Override
            public void onTick(long l) {
                ileSekund =(int)l/1000;
                button.setText(""+ileSekund);
            }
            @Override
            public void onFinish() {

            }


        };
    }
}
