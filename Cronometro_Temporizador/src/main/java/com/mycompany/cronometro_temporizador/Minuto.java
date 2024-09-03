/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro_temporizador;

/**
 *
 * @author User
 */
public class Minuto implements Runnable {

    @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtMin.getText());
for (;;) {
Tela.txtMin.setText(i+"");
i++;
if(i==59)
i=0;
try
{
Thread.sleep (60000);
} catch (Exception e){
        }
    }
    
}
}
