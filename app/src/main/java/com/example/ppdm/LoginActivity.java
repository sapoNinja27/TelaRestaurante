package com.example.ppdm;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    String save = "";
    EditText login;
    EditText senha;
    int rev =  Color.rgb(255,165,0);
    int lib = Color.rgb(255,255,0);
    String[] views = {"0","0","0","0","0","0","0","0","0"};
    Usuario users[] = {
            new Usuario("Administrador","Administrador"),
            new Usuario("Adm","Adm123"),
            new Usuario("Administrator","Que3B1eng4ElT0r0"),
            new Usuario("Root","pr0m1uscu0")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null){
            onRestoreInstanceState(savedInstanceState);
        }
        setContentView(R.layout.activity_login);
    }
    public void entrar(View view){
        login = (EditText)findViewById(R.id.user);
        senha = (EditText)findViewById(R.id.psw);
        for (int i =0; i< users.length;i++) {
            if(users[i].auth(login.getText().toString(),senha.getText().toString())){
                setContentView(R.layout.activity_main);
                if(views[0]=="1"){
                    findViewById(R.id.view).setBackgroundColor(rev);
                }else if(views[1]=="1"){
                    findViewById(R.id.view2).setBackgroundColor(rev);
                }else if(views[2]=="1"){
                    findViewById(R.id.view3).setBackgroundColor(rev);
                }else if(views[3]=="1"){
                    findViewById(R.id.view4).setBackgroundColor(rev);
                }else if(views[4]=="1"){
                    findViewById(R.id.view5).setBackgroundColor(rev);
                }else if(views[5]=="1"){
                    findViewById(R.id.view6).setBackgroundColor(rev);
                }else if(views[6]=="1"){
                    findViewById(R.id.view7).setBackgroundColor(rev);
                }else if(views[7]=="1"){
                    findViewById(R.id.view8).setBackgroundColor(rev);
                }else if(views[8]=="1"){
                    findViewById(R.id.view9).setBackgroundColor(rev);
                }
            }
        };
    }
    public void save(View view){

        for (String bi:views) {
            save+=bi;
        }
        System.out.println(save);
        onSaveInstanceState(new Bundle());
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("MyBinary", save);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        save = savedInstanceState.getString("MyBinary");
        views = save.split("");
        attColors("atualizar", 0);
    }
    public void salvar(View view){
        setContentView(R.layout.activity_main);
    }

    public void entrarSemLogin(View view){
        setContentView(R.layout.activity_main);
        attColors("atualizar",0);

    }
    public void reservar1(View view){
        findViewById(R.id.view).setBackgroundColor(rev);
        views[0] = "1";
    }
    public void reservar2(View view){
        findViewById(R.id.view2).setBackgroundColor(rev);
        views[1] = "1";
    }
    public void reservar3(View view){
        findViewById(R.id.view3).setBackgroundColor(rev);
        views[2] = "1";
    }
    public void reservar4(View view){
        findViewById(R.id.view4).setBackgroundColor(rev);
        views[3] = "1";
    }
    public void reservar5(View view){
        findViewById(R.id.view5).setBackgroundColor(rev);
        views[4] = "1";
    }
    public void reservar6(View view){
        findViewById(R.id.view6).setBackgroundColor(rev);
        views[5] = "1";
    }
    public void reservar7(View view){
        findViewById(R.id.view7).setBackgroundColor(rev);
        views[6] = "1";
    }
    public void reservar8(View view){
        findViewById(R.id.view8).setBackgroundColor(rev);
        views[7] = "1";
    }
    public void reservar9(View view){
        findViewById(R.id.view9).setBackgroundColor(rev);
        views[8] = "1";
    }
    public void al(View view){
        lib = Color.rgb(255,255,0);
        rev = Color.rgb(255,165,0);
    }
    public void cl(View view){
        lib = Color.rgb(255,203,219);
        rev = Color.rgb(128,128,128);
    }
    public void vr(View view){
        lib = Color.rgb(0,255,0);
        rev = Color.rgb(255,165,255);
    }
    public void va(View view){
        lib = Color.rgb(0,0,255);
        rev = Color.rgb(255,0,0);
    }
    public void libAll(View view){
        findViewById(R.id.view).setBackgroundColor(lib);
        findViewById(R.id.view2).setBackgroundColor(lib);
        findViewById(R.id.view3).setBackgroundColor(lib);
        findViewById(R.id.view4).setBackgroundColor(lib);
        findViewById(R.id.view5).setBackgroundColor(lib);
        findViewById(R.id.view6).setBackgroundColor(lib);
        findViewById(R.id.view7).setBackgroundColor(lib);
        findViewById(R.id.view8).setBackgroundColor(lib);
        findViewById(R.id.view9).setBackgroundColor(lib);
        for(int i = 0; i< views.length;i++){
            views[i] = "0";
        }
    }
    public void revAll(View view){
        findViewById(R.id.view).setBackgroundColor(rev);
        findViewById(R.id.view2).setBackgroundColor(rev);
        findViewById(R.id.view3).setBackgroundColor(rev);
        findViewById(R.id.view4).setBackgroundColor(rev);
        findViewById(R.id.view5).setBackgroundColor(rev);
        findViewById(R.id.view6).setBackgroundColor(rev);
        findViewById(R.id.view7).setBackgroundColor(rev);
        findViewById(R.id.view8).setBackgroundColor(rev);
        findViewById(R.id.view9).setBackgroundColor(rev);
        for(int i = 0; i< views.length;i++){
            views[i] = "1";
        }
    }
    public void colors(View view){
        setContentView(R.layout.activity_colors);
    }
    public void attColors(String acao, int id){
        if(acao == "liberar"){
            if(id==1){
                findViewById(R.id.view).setBackgroundColor(lib);
                views[0] = "0";
            }else if(id==2){
                findViewById(R.id.view2).setBackgroundColor(lib);
                views[1] = "0";
            }else if(id==3){
                findViewById(R.id.view3).setBackgroundColor(lib);
                views[2] = "0";
            }else if(id==4){
                findViewById(R.id.view4).setBackgroundColor(lib);
                views[3] = "0";
            }else if(id==5){
                findViewById(R.id.view5).setBackgroundColor(lib);
                views[4] = "0";
            }else if(id==6){
                findViewById(R.id.view6).setBackgroundColor(lib);
                views[5] = "0";
            }else if(id==7){
                findViewById(R.id.view7).setBackgroundColor(lib);
                views[6] = "0";
            }else if(id==8){
                findViewById(R.id.view8).setBackgroundColor(lib);
                views[7] = "0";
            }else if(id==9){
                findViewById(R.id.view9).setBackgroundColor(lib);
                views[8] = "0";
            }
        }else if(acao == "atualizar"){
            findViewById(R.id.view).setBackgroundColor(lib);
            findViewById(R.id.view2).setBackgroundColor(lib);
            findViewById(R.id.view3).setBackgroundColor(lib);
            findViewById(R.id.view4).setBackgroundColor(lib);
            findViewById(R.id.view5).setBackgroundColor(lib);
            findViewById(R.id.view6).setBackgroundColor(lib);
            findViewById(R.id.view7).setBackgroundColor(lib);
            findViewById(R.id.view8).setBackgroundColor(lib);
            findViewById(R.id.view9).setBackgroundColor(lib);
            if(views[0]=="1"){
                findViewById(R.id.view).setBackgroundColor(rev);
            }
            if(views[1]=="1"){
                findViewById(R.id.view2).setBackgroundColor(rev);
            }
            if(views[2]=="1"){
                findViewById(R.id.view3).setBackgroundColor(rev);
            }
            if(views[3]=="1"){
                findViewById(R.id.view4).setBackgroundColor(rev);
            }
            if(views[4]=="1"){
                findViewById(R.id.view5).setBackgroundColor(rev);
            }
            if(views[5]=="1"){
                findViewById(R.id.view6).setBackgroundColor(rev);
            }
            if(views[6]=="1"){
                findViewById(R.id.view7).setBackgroundColor(rev);
            }
            if(views[7]=="1"){
                findViewById(R.id.view8).setBackgroundColor(rev);
            }
            if(views[8]=="1"){
                findViewById(R.id.view9).setBackgroundColor(rev);
            }
        }
    }

    public void liberar(View view){
        EditText n = (EditText)findViewById(R.id.numero);
        int id = Integer.valueOf(n.getText().toString());
        attColors("liberar", id);
    }
}