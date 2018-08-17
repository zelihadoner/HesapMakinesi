package com.example.lenovo.hesap_makinesi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    Button sayi0,sayi1,sayi2,sayi3,sayi4,sayi5,sayi6,sayi7,sayi8,sayi9,topla,cikar,carp,bol,sil,hesapla,fact,us,mod;
        EditText display;
        int sonuc,i=1;
        float ilkdeger=0;
        String islem;
        @SuppressLint({"WrongViewCast"})
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            sayi0=findViewById(R.id.button12);
            sayi1=findViewById(R.id.button2);
            sayi2=findViewById(R.id.button3);
            sayi3=findViewById(R.id.button4);
            sayi4=findViewById(R.id.button5);
            sayi5=findViewById(R.id.button6);
            sayi6=findViewById(R.id.button7);
            sayi7=findViewById(R.id.button8);
            sayi8=findViewById(R.id.button9);
            sayi9=findViewById(R.id.button10);
            topla=findViewById(R.id.button11);
            cikar=findViewById(R.id.button13);
            carp=findViewById(R.id.button14);
            bol=findViewById(R.id.button15);
            sil=findViewById(R.id.button);
            display=findViewById(R.id.editText);
            hesapla=findViewById(R.id.button16);
            fact=findViewById(R.id.button17);
            us=findViewById(R.id.button18);
            mod=findViewById(R.id.button19);

            sayi0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("0"));
                }
            });
            sayi1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("1"));
                }
            });
            sayi2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("2"));
                }
            });
            sayi3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("3"));
                }
            });
            sayi4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("4"));
                }
            });
            sayi5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("5"));
                }
            });
            sayi6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("6"));
                }
            });
            sayi7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("7"));
                }
            });
            sayi8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("8"));
                }
            });
            sayi9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {display.setText(display.getText().append("9"));
                }
            });

            sil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText("");
                }
            });

            topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger= Float.parseFloat(String.valueOf(display.getText()));
                    display.setText("");
                    islem="toplama";
                }
            });
            cikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger= Float.parseFloat(String.valueOf(display.getText()));
                    display.setText("");
                    islem = "cikarma";
                }
            });
            carp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger= Float.parseFloat(String.valueOf(display.getText()));
                    display.setText("");
                    islem = "carpma";
                }
            });
            bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger= Float.parseFloat(String.valueOf(display.getText()));
                    display.setText("");
                    islem = "bolme";
                }
            });
            fact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=Float.parseFloat(String.valueOf(display.getText()));
                    islem="factoriyel";
                }
            });
            us.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=Float.parseFloat(String.valueOf(display.getText()));
                    display.setText("");
                    islem="usalma";
                }
            });
            mod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=Float.parseFloat(String.valueOf(display.getText()));
                    display.setText("");
                    islem="modalma";
                }
            });
            hesapla.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view) {
                        switch (islem) {
                            case "toplama":
                                sonuc = (int) (ilkdeger + Float.parseFloat(valueOf(display.getText())));
                                break;
                            case "cikarma":
                                sonuc = (int) (ilkdeger - Float.parseFloat(valueOf(display.getText())));
                                break;
                            case "carpma":
                                sonuc = (int) (ilkdeger * Float.parseFloat(valueOf(display.getText())));
                                break;
                            case "bolme":
                                sonuc = (int) (ilkdeger / Float.parseFloat(valueOf(display.getText())));
                                break;
                            case "factoriyel":
                                sonuc = factoriyelf((int) ilkdeger);
                                break;
                            case "usalma":
                                sonuc = 1;
                                sonuc = (int) Math.pow(ilkdeger, Float.parseFloat(valueOf(display.getText())));
                                break;
                            case "modalma":
                                sonuc = (int) (ilkdeger % Float.parseFloat(valueOf(display.getText())));
                                break;
                        }
                        display.setText(valueOf(sonuc));
                }
                private int factoriyelf(int ilkdeger) {
                    int i=2,sonuc=1;
                    while(i<=ilkdeger){
                        sonuc*=i;
                        i++;
                    }
                    return sonuc;
                }
            });
    }
}