package com.example.alumno.socket;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by alumno on 24/11/2016.
 */
public class MiHilo extends Thread {
    private Socket clientSocket;
    private BufferedWriter bw;
    private Handler h;
    private String mensaje;

    public MiHilo(Handler h){
         this.h=h;
    }

    @Override
    public void run() {
        try {
            clientSocket = new Socket("192.168.2.61", 4097);
            OutputStream os = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            InputStream is = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            while (true) {

                String msgStr = br.readLine();
                if (msgStr != null){
                    Log.d("t", "Llego:" + msgStr);
                    Message m = new Message();
                    m.obj = msgStr;
                    h.sendMessage(m);
                }else{
                    Log.d("mensaje:","no cargo");
                    break;

                }


                //break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sendMsg(String s) {
        try {
            if (bw != null) {
                bw.write(s + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
