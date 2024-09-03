/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometro_temporizador;

/**
 *
 * @author User
 */
public class Segundo implements Runnable {

    @Override
    public void run() {
         int i = Integer.parseInt(Tela.txtSeg.getText());
for (;;) {
Tela.txtSeg.setText(i+"");
i++;
if(i==1000)
i=0;
try
{
Thread.sleep (1000);
} catch (Exception e){
        }
    }
    
}
}
