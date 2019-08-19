
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SONY
 */
public class Puzzle2048 extends javax.swing.JFrame {

    /**
     * Creates new form Puzzle2048
     */
    public Puzzle2048() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("xyz");
        int index1=(int)(8*Math.random())+1;
        int index2=(int)(8*Math.random())+9;
        int n1=2*((int)(2*Math.random())+1);
        int n2=2*((int)(2*Math.random())+1);
        if(index1==1)
            jButton1.setText(n1+"");
        if(index1==2)
            jButton2.setText(n1+"");
        if(index1==3)
            jButton3.setText(n1+"");
        if(index1==4)
            jButton4.setText(n1+"");
        if(index1==5)
            jButton5.setText(n1+"");
        if(index1==6)
            jButton6.setText(n1+"");
        if(index1==7)
            jButton7.setText(n1+"");
        if(index1==8)
            jButton8.setText(n1+"");
        if(index2==9)
            jButton9.setText(n2+"");
        if(index2==10)
            jButton10.setText(n2+"");
        if(index2==11)
            jButton11.setText(n2+"");
        if(index2==12)
            jButton12.setText(n2+"");
        if(index2==13)
            jButton13.setText(n2+"");
        if(index2==14)
            jButton14.setText(n2+"");
        if(index2==15)
            jButton15.setText(n2+"");
        if(index2==16)
            jButton16.setText(n2+"");
    }
        public class Shift{
        String txt1=jButton1.getText();
        String txt2=jButton2.getText();
        String txt3=jButton3.getText();
        String txt4=jButton4.getText();
        String txt5=jButton5.getText();
        String txt6=jButton6.getText();
        String txt7=jButton7.getText();
        String txt8=jButton8.getText();
        String txt9=jButton9.getText();
        String txt10=jButton10.getText();
        String txt11=jButton11.getText();
        String txt12=jButton12.getText();
        String txt13=jButton13.getText();
        String txt14=jButton14.getText();
        String txt15=jButton15.getText();
        String txt16=jButton16.getText();
        void leftShift(int index1,String val1,int index2,String val2,int index3,String val3,int index4,String val4){    
        
         if(index1==4){
            if(txt3.equals("")&&txt2.equals("")&&txt1.equals("")){
                jButton1.setText(val1);
                jButton4.setText("");
            }
            else if(txt3.equals("")&&txt2.equals("")){
                if(txt1.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton4.setText("");
                }
                else{
                    jButton2.setText(val1);
                    jButton4.setText("");
                } 
            }
            else if(txt3.equals("")&&txt1.equals("")){
                if(txt2.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton4.setText("");
                    jButton2.setText("");
                }
                else{
                    jButton1.setText(txt2);
                    jButton4.setText("");
                    jButton2.setText(val1);
                } 
            }
            else if(txt2.equals("")&&txt1.equals("")){
                if(txt3.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton4.setText("");
                    jButton3.setText("");
                }
                else{
                    jButton1.setText(txt3);
                    jButton4.setText("");
                    jButton3.setText("");
                    jButton2.setText(val1);
                } 
            }
            else if(txt3.equals("")){
                if(txt1.equals(txt2)){
                    jButton1.setText(2*Integer.parseInt(txt1)+"");
                   jButton2.setText(val1);
                   jButton4.setText("");
                }
                else if(txt2.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton2.setText(val1);
                   jButton4.setText("");
                }
                else{
                    jButton3.setText(val1);
                   jButton4.setText("");
                }
            }
            else if(txt2.equals("")){
                if(txt1.equals(txt3)){
                    jButton1.setText(2*Integer.parseInt(txt1)+"");
                    jButton2.setText(val1);
                    jButton3.setText("");
                   jButton4.setText("");
                }
                else if(txt3.equals(val1)){
                    jButton2.setText(2*Integer.parseInt(val1)+"");
                    jButton3.setText("");
                    jButton4.setText("");
                }
                else{
                    jButton2.setText(txt3);
                    jButton3.setText(val1);
                    jButton4.setText("");
                }
            }
            else if(txt1.equals("")){
                if(txt2.equals(txt3)){
                    jButton1.setText(2*Integer.parseInt(txt2)+"");
                    jButton2.setText(val1);
                    jButton3.setText("");
                    jButton4.setText("");
                }
                else if(txt3.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(txt2);
                    jButton2.setText(val1);
                    jButton3.setText("");
                    jButton4.setText("");
                }
                else{
                    jButton1.setText(txt2);
                    jButton2.setText(txt3);
                    jButton3.setText(val1);
                    jButton4.setText("");
                }
            }
            else {
                if((txt1.equals(txt2))&&(txt3.equals(val1))){
                    jButton1.setText(2*Integer.parseInt(txt2)+"");
                    jButton2.setText(2*Integer.parseInt(val1)+"");
                    jButton3.setText("");
                    jButton4.setText("");
                }
               else if((txt1.equals(txt2))&&(!txt3.equals(val1))){
                    jButton1.setText(2*Integer.parseInt(txt2)+"");
                    jButton2.setText(txt3);
                    jButton3.setText(val1);
                    jButton4.setText("");
                }
               else if(txt2.equals(txt3)){
                   jButton2.setText(2*Integer.parseInt(txt2)+"");
                   jButton3.setText(val1);
                   jButton4.setText("");
               }
               else if((!txt1.equals(txt2))&&(txt3.equals(val1))){
                    jButton3.setText(2*Integer.parseInt(val1)+"");
                    jButton4.setText("");
                }
               
            }
            
        }
         
          if(index1==3){
            if(txt2.equals("")&&txt1.equals("")){
                jButton1.setText(val1);
                jButton3.setText("");
            }
            else if(txt2.equals("")){
                if(txt1.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton3.setText("");
                }
                else{
                    jButton2.setText(val1);
                    jButton3.setText("");
                } 
            }
            else if(txt1.equals("")){
                if(txt2.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton3.setText("");
                    jButton2.setText("");
                }
                else{
                    jButton1.setText(txt2);
                    jButton3.setText("");
                    jButton2.setText(val1);
                } 
            }
            else {
                if(txt1.equals(txt2)){
                    jButton1.setText(2*Integer.parseInt(txt2)+"");
                    jButton2.setText(val1);
                    jButton3.setText("");
                    jButton4.setText("");
                }
                else if(txt2.equals(val1)){
                    jButton2.setText(2*Integer.parseInt(val1)+"");
                    jButton3.setText("");
                    jButton4.setText("");
                }
            }
        }
         
          if(index1==2){
            if(txt1.equals("")){
                jButton1.setText(val1);
                jButton2.setText("");
            }
            else if(txt1.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton2.setText("");
                }
            
        }
         
         
         if(index2==8){
            if(txt7.equals("")&&txt6.equals("")&&txt5.equals("")){
                jButton5.setText(val2);
                jButton8.setText("");
            }
            else if(txt7.equals("")&&txt6.equals("")){
                if(txt5.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(val2);
                    jButton8.setText("");
                }
                else{
                    jButton6.setText(val2);
                    jButton8.setText("");
                } 
            }
            else if(txt7.equals("")&&txt5.equals("")){
                if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(val2);
                    jButton8.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton5.setText(txt6);
                    jButton7.setText("");
                    jButton8.setText("");
                    jButton6.setText(val2);
                } 
            }
            else if(txt6.equals("")&&txt5.equals("")){
                if(txt7.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(val2);
                    jButton8.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton5.setText(txt7);
                    jButton7.setText("");
                    jButton8.setText("");
                    jButton6.setText(val2);
                } 
            }
            else if(txt7.equals("")){
                if(txt5.equals(txt6)){
                    jButton5.setText(2*Integer.parseInt(txt5)+"");
                   jButton6.setText(val2);
                   jButton8.setText("");
                }
                else if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton6.setText(val2);
                   jButton8.setText("");
                }
                else{
                    jButton7.setText(val2);
                   jButton8.setText("");
                }
            }
            else if(txt6.equals("")){
                if(txt5.equals(txt7)){
                    jButton5.setText(2*Integer.parseInt(txt5)+"");
                    jButton6.setText(val2);
                   jButton7.setText("");
                   jButton8.setText("");
                }
                else if(txt7.equals(val2)){
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton7.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton6.setText(txt7);
                    jButton7.setText(val2);
                    jButton8.setText("");
                }
            }
            else if(txt5.equals("")){
                if(txt6.equals(txt7)){
                    jButton5.setText(2*Integer.parseInt(txt6)+"");
                    jButton6.setText(val2);
                    jButton7.setText("");
                    jButton8.setText("");
                }
                else if(txt7.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(txt6);
                    jButton6.setText(val2);
                    jButton7.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton5.setText(txt6);
                    jButton6.setText(txt7);
                    jButton7.setText(val2);
                    jButton8.setText("");
                }
            }
            else {
                if((txt5.equals(txt6))&&(txt7.equals(val2))){
                    jButton5.setText(2*Integer.parseInt(txt6)+"");
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton7.setText("");
                    jButton8.setText("");
                }
               else if((txt5.equals(txt6))&&!(txt7.equals(val2))){
                    jButton5.setText(2*Integer.parseInt(txt5)+"");
                    jButton6.setText(txt7);
                    jButton7.setText(val2);
                    jButton8.setText("");
                }
               else if(txt6.equals(txt7)){
                   jButton6.setText(2*Integer.parseInt(txt6)+"");
                   jButton7.setText(val2);
                   jButton8.setText("");
            }
               else if(!(txt5.equals(txt6))&&(txt7.equals(val2))){
                    jButton7.setText(2*Integer.parseInt(val2)+"");
                    jButton8.setText("");
                }
                
          }
        }
         
          if(index2==7){
            if(txt6.equals("")&&txt5.equals("")){
                jButton5.setText(val2);
                jButton7.setText("");
            }
            else if(txt6.equals("")){
                if(txt5.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(val2);
                    jButton7.setText("");
                }
                else{
                    jButton6.setText(val2);
                    jButton7.setText("");
                } 
            }
            else if(txt5.equals("")){
                if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(val2);
                    jButton7.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton5.setText(txt6);
                    jButton7.setText("");
                    jButton6.setText(val2);
                } 
            }
            else {
                if(txt5.equals(txt6)){
                    jButton5.setText(2*Integer.parseInt(txt6)+"");
                    jButton6.setText(val2);
                    jButton7.setText("");
                    jButton8.setText("");
                }
               else if(txt6.equals(val2)){
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton7.setText("");
                    jButton8.setText("");
                }
            }
        }
         
          if(index2==6){
            if(txt5.equals("")){
                jButton5.setText(val2);
                jButton6.setText("");
            }
            else if(txt5.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton5.setText(val2);
                    jButton6.setText("");
                }
             
        }
         
         
         if(index3==12){
            if(txt11.equals("")&&txt10.equals("")&&txt9.equals("")){
                jButton9.setText(val3);
                jButton12.setText("");
            }
            else if(txt11.equals("")&&txt10.equals("")){
                if(txt9.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(val3);
                    jButton12.setText("");
                }
                else{
                    jButton10.setText(val3);
                    jButton12.setText("");
                } 
            }
            else if(txt11.equals("")&&txt9.equals("")){
                if(txt10.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(val3);
                    jButton12.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton9.setText(txt10);
                    jButton12.setText("");
                    jButton10.setText(val3);
                } 
            }
            else if(txt10.equals("")&&txt9.equals("")){
                if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(val3);
                    jButton12.setText("");
                    jButton11.setText("");
                }
                else{
                    jButton9.setText(txt11);
                    jButton11.setText("");
                    jButton12.setText("");
                    jButton10.setText(val3);
                } 
            }
            else if(txt11.equals("")){
                if(txt9.equals(txt10)){
                    jButton9.setText(2*Integer.parseInt(txt9)+"");
                   jButton10.setText(val3);
                   jButton12.setText("");
                }
                else if(txt10.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton10.setText(val3);
                   jButton12.setText("");
                }
                else{
                    jButton11.setText(val3);
                   jButton12.setText("");
                }
            }
            else if(txt10.equals("")){
                if(txt9.equals(txt11)){
                    jButton9.setText(2*Integer.parseInt(txt9)+"");
                    jButton10.setText(val3);
                   jButton11.setText("");
                   jButton12.setText("");
                }
                else if(txt11.equals(val3)){
                    jButton10.setText(2*Integer.parseInt(val3)+"");
                    jButton11.setText("");
                    jButton12.setText("");
                }
                else{
                    jButton10.setText(txt11);
                    jButton11.setText(val3);
                    jButton12.setText("");
                }
            }
            else if(txt9.equals("")){
                if(txt10.equals(txt11)){
                    jButton9.setText(2*Integer.parseInt(txt10)+"");
                    jButton10.setText(val3);
                    jButton11.setText("");
                    jButton12.setText("");
                }
                else if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(txt10);
                    jButton10.setText(val3);
                    jButton11.setText("");
                    jButton12.setText("");
                }
                else{
                    jButton9.setText(txt10);
                    jButton10.setText(txt11);
                    jButton11.setText(val3);
                    jButton12.setText("");
                }
            }
            else {
                if((txt9.equals(txt10))&&(txt11.equals(val3))){
                    jButton9.setText(2*Integer.parseInt(txt10)+"");
                    jButton10.setText(2*Integer.parseInt(val3)+"");
                    jButton11.setText("");
                    jButton12.setText("");
                }
                else if((txt9.equals(txt10))&&!(txt11.equals(val3))){
                    jButton9.setText(2*Integer.parseInt(txt9)+"");
                    jButton10.setText(txt11);
                    jButton11.setText(val3);
                    jButton12.setText("");
                }
                else if(txt10.equals(txt11)){
                   jButton10.setText(2*Integer.parseInt(txt10)+"");
                   jButton11.setText(val3);
                   jButton12.setText("");}
                else if(!(txt9.equals(txt10))&&(txt11.equals(val3))){
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton12.setText("");
                }
                
            }
        }
         
          if(index3==11){
            if(txt10.equals("")&&txt9.equals("")){
                jButton9.setText(val3);
                jButton11.setText("");
            }
            else if(txt10.equals("")){
                if(txt9.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(val3);
                    jButton11.setText("");
                }
                else{
                    jButton10.setText(val3);
                    jButton11.setText("");
                } 
            }
            else if(txt9.equals("")){
                if(txt10.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(val3);
                    jButton11.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton9.setText(txt10);
                    jButton11.setText("");
                    jButton10.setText(val3);
                } 
            }
            else {
                if(txt9.equals(txt10)){
                    jButton9.setText(2*Integer.parseInt(txt10)+"");
                    jButton10.setText(val3);
                    jButton11.setText("");
                    jButton12.setText("");
                }
               else if(txt10.equals(val3)){
                    jButton10.setText(2*Integer.parseInt(val3)+"");
                    jButton11.setText("");
                    jButton12.setText("");
                }
            }
        }
         
          if(index3==10){
            if(txt9.equals("")){
                jButton9.setText(val3);
                jButton10.setText("");
            }
            else if(txt9.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton9.setText(val3);
                    jButton10.setText("");
                }
             
        }
         
         
         
         if(index4==16){
            if(txt15.equals("")&&txt14.equals("")&&txt13.equals("")){
                jButton13.setText(val4);
                jButton16.setText("");
            }
            else if(txt15.equals("")&&txt14.equals("")){
                if(txt13.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(val4);
                    jButton16.setText("");
                }
                else{
                    jButton14.setText(val4);
                    jButton16.setText("");
                } 
            }
            else if(txt15.equals("")&&txt13.equals("")){
                if(txt14.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(val4);
                    jButton16.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton13.setText(txt14);
                    jButton16.setText("");
                    jButton14.setText(val4);
                } 
            }
            else if(txt14.equals("")&&txt13.equals("")){
                if(txt15.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(val4);
                    jButton16.setText("");
                    jButton15.setText("");
                }
                else{
                    jButton13.setText(txt15);
                    jButton15.setText("");
                    jButton16.setText("");
                    jButton14.setText(val4);
                } 
            }
            else if(txt15.equals("")){
                if(txt13.equals(txt14)){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                   jButton14.setText(val4);
                   jButton16.setText("");
                }
                else if(txt14.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton14.setText(val4);
                   jButton16.setText("");
                }
                else{
                    jButton15.setText(val4);
                   jButton16.setText("");
                }
            }
            else if(txt14.equals("")){
                if(txt13.equals(txt15)){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                    jButton14.setText(val4);
                   jButton15.setText("");
                   jButton16.setText("");
                }
                else if(txt15.equals(val4)){
                    jButton14.setText(2*Integer.parseInt(val4)+"");
                    jButton15.setText("");
                    jButton16.setText("");
                }
                else{
                    jButton14.setText(txt15);
                    jButton15.setText(val4);
                    jButton16.setText("");
                }
            }
            else if(txt13.equals("")){
                if(txt14.equals(txt15)){
                    jButton13.setText(2*Integer.parseInt(txt14)+"");
                    jButton14.setText(val4);
                    jButton15.setText("");
                    jButton16.setText("");
                }
                else if(txt15.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(txt14);
                    jButton14.setText(val4);
                    jButton15.setText("");
                    jButton16.setText("");
                }
                else{
                    jButton13.setText(txt14);
                    jButton14.setText(txt15);
                    jButton15.setText(val4);
                    jButton16.setText("");
                }
            }
            else {
                if((txt13.equals(txt14))&&(txt15.equals(val4))){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                    jButton14.setText(2*Integer.parseInt(val4)+"");
                    jButton15.setText("");
                    jButton16.setText("");
                }
               else if((txt13.equals(txt14))&&!(txt15.equals(val4))){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                    jButton14.setText(txt15);
                    jButton15.setText(val4);
                    jButton16.setText("");
                }
               else if(txt14.equals(txt15)){
                   jButton14.setText(2*Integer.parseInt(txt14)+"");
                   jButton15.setText(val4);
                   jButton16.setText("");}
               else if(!(txt13.equals(txt14))&&(txt15.equals(val4))){
                    jButton15.setText(2*Integer.parseInt(val4)+"");
                    jButton16.setText("");
                }
                
            }
        }
         
          if(index4==15){
            if(txt14.equals("")&&txt13.equals("")){
                jButton13.setText(val4);
                jButton15.setText("");
            }
            else if(txt14.equals("")){
                if(txt13.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(val4);
                    jButton15.setText("");
                }
                else{
                    jButton14.setText(val4);
                    jButton15.setText("");
                } 
            }
            else if(txt13.equals("")){
                if(txt14.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(val4);
                    jButton15.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton13.setText(txt14);
                    jButton15.setText("");
                    jButton14.setText(val4);
                } 
            }
            else {
                if(txt13.equals(txt14)){
                    jButton13.setText(2*Integer.parseInt(txt14)+"");
                    jButton14.setText(val4);
                    jButton15.setText("");
                    jButton16.setText("");
                }
               else if(txt14.equals(val4)){
                    jButton14.setText(2*Integer.parseInt(val4)+"");
                    jButton15.setText("");
                    jButton16.setText("");
                }
            }
        }
         
          if(index4==14){
            if(txt13.equals("")){
                jButton13.setText(val4);
                jButton14.setText("");
            }
            else if(txt13.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton13.setText(val4);
                    jButton14.setText("");
                }
             
        }
         
         setIndex();
       }
        
        void rightShift(int index1,String val1,int index2,String val2,int index3,String val3,int index4,String val4){    
        
         if(index1==1){
            if(txt3.equals("")&&txt2.equals("")&&txt4.equals("")){
                jButton4.setText(val1);
                jButton1.setText("");
            }
            else if(txt3.equals("")&&txt2.equals("")){
                if(txt4.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(val1);
                    jButton1.setText("");
                }
                else{
                    jButton3.setText(val1);
                    jButton1.setText("");
                } 
            }
            else if(txt3.equals("")&&txt4.equals("")){
                if(txt2.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(val1);
                    jButton1.setText("");
                    jButton2.setText("");
                }
                else{
                    jButton4.setText(txt2);
                    jButton1.setText("");
                    jButton2.setText("");
                    jButton3.setText(val1);
                } 
            }
            else if(txt2.equals("")&&txt4.equals("")){
                if(txt3.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(val1);
                    jButton1.setText("");
                    jButton3.setText("");
                }
                else{
                    jButton4.setText(txt3);
                    jButton1.setText("");
                    jButton3.setText(val1);
                } 
            }
            else if(txt3.equals("")){
                if(txt4.equals(txt2)){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                   jButton3.setText(val1);
                   jButton1.setText("");
                   jButton2.setText("");
                }
                else if(txt2.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton3.setText(val1);
                   jButton1.setText("");
                   jButton2.setText("");
                }
                else{
                    jButton3.setText(txt2);
                    jButton2.setText(val1);
                   jButton1.setText("");
                }
            }
            else if(txt2.equals("")){
                if(txt4.equals(txt3)){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                    jButton3.setText(val1);
                   jButton1.setText("");
                }
                else if(txt3.equals(val1)){
                    jButton3.setText(2*Integer.parseInt(val1)+"");
                    jButton1.setText("");
                }
                else{
                    jButton2.setText(val1);
                    jButton1.setText("");
                }
            }
            else if(txt4.equals("")){
                if(txt3.equals(txt2)){
                    jButton4.setText(2*Integer.parseInt(txt3)+"");
                    jButton3.setText(val1);
                    jButton1.setText("");
                    jButton2.setText("");
                }
                else if(txt2.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(txt3);
                    jButton3.setText(val1);
                    jButton1.setText("");
                    jButton2.setText("");
                }
                else{
                    jButton4.setText(txt3);
                    jButton3.setText(txt2);
                    jButton2.setText(val1);
                    jButton1.setText("");
                }
            }
            
            else {
                if((txt4.equals(txt3))&&(txt2.equals(val1))){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                    jButton3.setText(2*Integer.parseInt(val1)+"");
                    jButton2.setText("");
                    jButton1.setText("");
                }
               else if((txt4.equals(txt3))&&(!txt2.equals(val1))){
                    jButton4.setText(2*Integer.parseInt(txt3)+"");
                    jButton3.setText(txt2);
                    jButton2.setText(val1);
                    jButton1.setText("");
                }
               else if(txt2.equals(txt3)){
                   jButton3.setText(2*Integer.parseInt(txt3)+"");
                   jButton2.setText(val1);
                   jButton1.setText("");}
               else if((!txt4.equals(txt3))&&(txt2.equals(val1))){
                    jButton2.setText(2*Integer.parseInt(val1)+"");
                    jButton1.setText("");
                }
                
            }
            
        
        }
         
          if(index1==2){
            if(txt3.equals("")&&txt4.equals("")){
                jButton4.setText(val1);
                jButton2.setText("");
            }
            else if(txt3.equals("")){
                if(txt4.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(val1);
                    jButton2.setText("");
                }
                else{
                    jButton3.setText(val1);
                    jButton2.setText(txt1);
                } 
            }
            else if(txt4.equals("")){
                if(txt3.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(val1);
                    jButton3.setText("");
                    jButton2.setText("");
                }
                else{
                    jButton4.setText(txt3);
                    jButton2.setText("");
                    jButton3.setText(val1);
                } 
            }
            else {
                if(txt4.equals(txt3)){
                    jButton4.setText(2*Integer.parseInt(txt3)+"");
                    jButton3.setText(val1);
                    jButton2.setText("");
                    jButton1.setText("");
                }
                else if(txt3.equals(val1)){
                    jButton3.setText(2*Integer.parseInt(val1)+"");
                    jButton4.setText("");
                    jButton1.setText("");
                }
            }
        }
         
         else if(index1==3){
            if(txt4.equals("")){
                jButton4.setText(val1);
                jButton3.setText("");
            }
            else if(val1.equals(txt4)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton4.setText(val1);
                    jButton3.setText("");
                }
            
        }
         
          if(index2==5){
            if(txt7.equals("")&&txt6.equals("")&&txt8.equals("")){
                jButton8.setText(val2);
                jButton5.setText("");
            }
            else if(txt7.equals("")&&txt6.equals("")){
                if(txt8.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(val2);
                    jButton5.setText("");
                }
                else{
                    jButton7.setText(val2);
                    jButton5.setText("");
                } 
            }
            else if(txt7.equals("")&&txt8.equals("")){
                if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(val2);
                    jButton5.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton8.setText(txt6);
                    jButton5.setText("");
                    jButton6.setText("");
                    jButton7.setText(val2);
                } 
            }
            else if(txt6.equals("")&&txt8.equals("")){
                if(txt7.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(val2);
                    jButton5.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton8.setText(txt7);
                    jButton5.setText("");
                    jButton7.setText(val2);
                } 
            }
            else if(txt7.equals("")){
                if(txt8.equals(txt6)){
                    jButton8.setText(2*Integer.parseInt(txt8)+"");
                   jButton7.setText(val2);
                   jButton5.setText("");
                   jButton6.setText("");
                }
                else if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton7.setText(val2);
                   jButton5.setText("");
                   jButton6.setText("");
                }
                else{
                    jButton7.setText(txt6);
                    jButton6.setText(val2);
                   jButton5.setText("");
                }
            }
            else if(txt6.equals("")){
                if(txt8.equals(txt7)){
                    jButton8.setText(2*Integer.parseInt(txt8)+"");
                    jButton7.setText(val2);
                   jButton5.setText("");
                }
                else if(txt7.equals(val2)){
                    jButton7.setText(2*Integer.parseInt(val2)+"");
                    jButton5.setText("");
                }
                else{
                    jButton6.setText(val2);
                    jButton5.setText("");
                }
            }
            else if(txt8.equals("")){
                if(txt6.equals(txt7)){
                    jButton8.setText(2*Integer.parseInt(txt7)+"");
                    jButton7.setText(val2);
                    jButton5.setText("");
                    jButton6.setText("");
                }
                else if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(txt7);
                    jButton7.setText(val2);
                    jButton5.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton8.setText(txt7);
                    jButton7.setText(txt6);
                    jButton6.setText(val2);
                    jButton5.setText("");
                }
            }
            else {
                if((txt8.equals(txt7))&&(txt6.equals(val2))){
                    jButton8.setText(2*Integer.parseInt(txt8)+"");
                    jButton7.setText(2*Integer.parseInt(val2)+"");
                    jButton6.setText("");
                    jButton5.setText("");
                }
               else if((txt8.equals(txt7))&&!(txt6.equals(val2))){
                    jButton8.setText(2*Integer.parseInt(txt8)+"");
                    jButton7.setText(txt6);
                    jButton6.setText(val2);
                    jButton5.setText("");
                }
               else if(txt6.equals(txt7)){
                   jButton7.setText(2*Integer.parseInt(txt7)+"");
                   jButton6.setText(val2);
                   jButton5.setText("");}
               else if(!(txt8.equals(txt7))&&(txt6.equals(val2))){
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton5.setText("");
                }
                
            }
            
        }
         
          if(index2==6){
            if(txt7.equals("")&&txt8.equals("")){
                jButton8.setText(val2);
                jButton6.setText("");
            }
            else if(txt7.equals("")){
                if(txt8.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(val2);
                    jButton6.setText("");
                }
                else{
                    jButton7.setText(val2);
                    jButton6.setText("");
                    
                } 
            }
            else if(txt8.equals("")){
                if(txt7.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(val2);
                    jButton6.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton8.setText(txt7);
                    jButton6.setText("");
                    jButton7.setText(val2);
                } 
            }
            
            else {
                if(txt8.equals(txt7)){
                    jButton8.setText(2*Integer.parseInt(txt7)+"");
                    jButton7.setText(val2);
                    jButton6.setText("");
                    jButton5.setText("");
                }
               else if(txt7.equals(val2)){
                    jButton7.setText(2*Integer.parseInt(val2)+"");
                    jButton6.setText("");
                    jButton5.setText("");
                }
            }
        }
         
         else if(index2==7){
            if(txt8.equals("")){
                jButton8.setText(val2);
                jButton7.setText("");
            }
            else if(val2.equals(txt8)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton8.setText(val2);
                    jButton7.setText("");
                }
            
        }
          
          
         
         if(index3==9){
            if(txt11.equals("")&&txt10.equals("")&&txt12.equals("")){
                jButton12.setText(val3);
                jButton9.setText("");
            }
            else if(txt11.equals("")&&txt10.equals("")){
                if(txt12.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(val3);
                    jButton9.setText("");
                }
                else{
                    jButton11.setText(val3);
                    jButton9.setText("");
                } 
            }
            else if(txt11.equals("")&&txt12.equals("")){
                if(txt10.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(val3);
                    jButton9.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton12.setText(txt10);
                    jButton9.setText("");
                    jButton10.setText("");
                    jButton11.setText(val3);
                } 
            }
            else if(txt10.equals("")&&txt12.equals("")){
                if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(val3);
                    jButton9.setText("");
                    jButton11.setText("");
                }
                else{
                    jButton12.setText(txt11);
                    jButton9.setText("");
                    jButton11.setText(val3);
                } 
            }
            else if(txt11.equals("")){
                if(txt12.equals(txt10)){
                    jButton12.setText(2*Integer.parseInt(txt12)+"");
                   jButton11.setText(val3);
                   jButton9.setText("");
                   jButton10.setText("");
                }
                else if(txt10.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton11.setText(val3);
                   jButton9.setText("");
                   jButton10.setText("");
                }
                else{
                    jButton11.setText(txt10);
                    jButton10.setText(val3);
                   jButton9.setText("");
                }
            }
            else if(txt10.equals("")){
                if(txt12.equals(txt11)){
                    jButton12.setText(2*Integer.parseInt(txt12)+"");
                    jButton11.setText(val3);
                   jButton9.setText("");
                }
                else if(txt11.equals(val3)){
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton9.setText("");
                }
                else{
                    jButton10.setText(val3);
                    jButton9.setText("");
                }
            }
            else if(txt12.equals("")){
                if(txt10.equals(txt11)){
                    jButton12.setText(2*Integer.parseInt(txt11)+"");
                    jButton11.setText(val3);
                    jButton9.setText("");
                    jButton10.setText("");
                }
                else if(txt10.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(txt11);
                    jButton11.setText(val3);
                    jButton9.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton12.setText(txt11);
                    jButton11.setText(txt10);
                    jButton10.setText(val3);
                    jButton9.setText("");
                }
            }
            else {
                if((txt12.equals(txt11))&&(txt10.equals(val3))){
                    jButton12.setText(2*Integer.parseInt(txt12)+"");
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton10.setText("");
                    jButton9.setText("");
                }
                else if((txt12.equals(txt11))&&!(txt10.equals(val3))){
                    jButton12.setText(2*Integer.parseInt(txt12)+"");
                    jButton11.setText(txt10);
                    jButton10.setText(val3);
                    jButton9.setText("");
                }
                else if(txt10.equals(txt11)){
                   jButton11.setText(2*Integer.parseInt(txt11)+"");
                   jButton10.setText(val3);
                   jButton9.setText("");}
                else if(!(txt12.equals(txt11))&&(txt10.equals(val3))){
                    jButton10.setText(2*Integer.parseInt(val3)+"");
                    jButton9.setText("");
                }
                
            }
            
        }
         
          if(index3==10){
            if(txt11.equals("")&&txt12.equals("")){
                jButton12.setText(val3);
                jButton10.setText("");
            }
            else if(txt11.equals("")){
                if(txt12.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(val3);
                    jButton10.setText("");
                }
                else{
                    jButton11.setText(val3);
                    jButton10.setText("");
                } 
            }
            else if(txt12.equals("")){
                if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(val3);
                    jButton11.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton12.setText(txt11);
                    jButton10.setText("");
                    jButton11.setText(val3);
                } 
            }
            else {
                if(txt12.equals(txt11)){
                    jButton12.setText(2*Integer.parseInt(txt11)+"");
                    jButton11.setText(val3);
                    jButton10.setText("");
                    jButton9.setText("");
                }
               else if(txt11.equals(val3)){
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton10.setText("");
                    jButton9.setText("");
                }
            }
        }
         
         else if(index3==11){
            if(txt12.equals("")){
                jButton12.setText(val3);
                jButton11.setText("");
            }
            else if(val3.equals(txt12)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton12.setText(val3);
                    jButton11.setText("");
                }
            
        }
         
         
         
         
         
         
         if(index4==13){
            if(txt15.equals("")&&txt14.equals("")&&txt16.equals("")){
                jButton16.setText(val4);
                jButton13.setText("");
            }
            else if(txt15.equals("")&&txt14.equals("")){
                if(txt16.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton13.setText("");
                }
                else{
                    jButton15.setText(val4);
                    jButton13.setText("");
                } 
            }
            else if(txt15.equals("")&&txt16.equals("")){
                if(txt14.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton13.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton16.setText(txt14);
                    jButton13.setText("");
                    jButton14.setText("");
                    jButton15.setText(val4);
                } 
            }
            else if(txt14.equals("")&&txt16.equals("")){
                if(txt15.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton13.setText("");
                    jButton15.setText("");
                }
                else{
                    jButton16.setText(txt15);
                    jButton13.setText("");
                    jButton15.setText(val4);
                } 
            }
            else if(txt15.equals("")){
                if(txt16.equals(txt14)){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                   jButton15.setText(val4);
                   jButton13.setText("");
                   jButton14.setText("");
                }
                else if(txt14.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton15.setText(val4);
                   jButton13.setText("");
                   jButton14.setText("");
                }
                else{
                    jButton15.setText(txt14);
                    jButton14.setText(val4);
                   jButton13.setText("");
                }
            }
            else if(txt14.equals("")){
                if(txt16.equals(txt15)){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                    jButton15.setText(val4);
                   jButton13.setText("");
                }
                else if(txt15.equals(val4)){
                    jButton15.setText(2*Integer.parseInt(val4)+"");
                    jButton13.setText("");
                }
                else{
                    jButton14.setText(val4);
                    jButton13.setText("");
                }
            }
            else if(txt16.equals("")){
                if(txt14.equals(txt15)){
                    jButton16.setText(2*Integer.parseInt(txt15)+"");
                    jButton15.setText(val4);
                    jButton13.setText("");
                    jButton14.setText("");
                }
                else if(txt14.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(txt15);
                    jButton15.setText(val4);
                    jButton13.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton16.setText(txt15);
                    jButton15.setText(txt14);
                    jButton14.setText(val4);
                    jButton13.setText("");
                }
            }
            
            else {
                if((txt16.equals(txt15))&&(txt14.equals(val4))){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                    jButton15.setText(2*Integer.parseInt(val4)+"");
                    jButton14.setText("");
                    jButton13.setText("");
                }
               else if((txt16.equals(txt15))&&!(txt14.equals(val4))){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                    jButton15.setText(txt14);
                    jButton14.setText(val4);
                    jButton13.setText("");
                }
               else if(txt14.equals(txt15)){
                   jButton15.setText(2*Integer.parseInt(txt15)+"");
                   jButton14.setText(val4);
                   jButton13.setText("");}
               else if(!(txt16.equals(txt15))&&(txt14.equals(val4))){
                    jButton14.setText(2*Integer.parseInt(val4)+"");
                    jButton13.setText("");
                }
                
            }
        }
         
          if(index4==14){
            if(txt15.equals("")&&txt16.equals("")){
                jButton16.setText(val4);
                jButton14.setText("");
            }
            else if(txt15.equals("")){
                if(txt16.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton14.setText("");
                }
                else{
                    jButton15.setText(val4);
                    jButton14.setText("");
                } 
            }
            else if(txt16.equals("")){
                if(txt15.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton15.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton16.setText(txt15);
                    jButton14.setText("");
                    jButton15.setText(val4);
                } 
            }
            
            else {
                if(txt16.equals(txt15)){
                    jButton16.setText(2*Integer.parseInt(txt15)+"");
                    jButton15.setText(val4);
                    jButton14.setText("");
                    jButton13.setText("");
                }
               else if(txt15.equals(val4)){
                    jButton15.setText(2*Integer.parseInt(val4)+"");
                    jButton14.setText("");
                    jButton13.setText("");
                }
            }
        }
         
         else if(index4==15){
            if(txt16.equals("")){
                jButton16.setText(val4);
                jButton15.setText("");
            }
            else if(val4.equals(txt16)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton15.setText("");
                }
            
        }
         
         
         
         setIndex();
       }
        
        void upShift(int index1,String val1,int index2,String val2,int index3,String val3,int index4,String val4){    
        
         if(index1==13){
            if(txt9.equals("")&&txt5.equals("")&&txt1.equals("")){
                jButton1.setText(val1);
                jButton13.setText("");
            }
            else if(txt9.equals("")&&txt5.equals("")){
                if(txt1.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton13.setText("");
                }
                else{
                    jButton5.setText(val1);
                    jButton13.setText("");
                } 
            }
            else if(txt9.equals("")&&txt1.equals("")){
                if(txt5.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton13.setText("");
                    jButton5.setText("");
                }
                else{
                    jButton1.setText(txt5);
                    jButton13.setText("");
                    jButton5.setText(val1);
                } 
            }
            else if(txt5.equals("")&&txt1.equals("")){
                if(txt9.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton13.setText("");
                    jButton9.setText("");
                }
                else{
                    jButton1.setText(txt9);
                    jButton13.setText("");
                    jButton9.setText("");
                    jButton5.setText(val1);
                } 
            }
            else if(txt9.equals("")){
                if(txt1.equals(txt5)){
                    jButton1.setText(2*Integer.parseInt(txt1)+"");
                   jButton5.setText(val1);
                   jButton13.setText("");
                }
                else if(txt5.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton5.setText(val1);
                   jButton13.setText("");
                }
                else{
                    jButton9.setText(val1);
                   jButton13.setText("");
                }
            }
            else if(txt5.equals("")){
                if(txt1.equals(txt9)){
                    jButton1.setText(2*Integer.parseInt(txt1)+"");
                    jButton5.setText(val1);
                    jButton9.setText("");
                   jButton13.setText("");
                }
                else if(txt9.equals(val1)){
                    jButton5.setText(2*Integer.parseInt(val1)+"");
                    jButton9.setText("");
                    jButton13.setText("");
                }
                else{
                    jButton5.setText(txt9);
                    jButton9.setText(val1);
                    jButton13.setText("");
                }
            }
            else if(txt1.equals("")){
                if(txt5.equals(txt9)){
                    jButton1.setText(2*Integer.parseInt(txt5)+"");
                    jButton5.setText(val1);
                    jButton9.setText("");
                    jButton13.setText("");
                }
                else if(txt9.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(txt5);
                    jButton5.setText(val1);
                    jButton9.setText("");
                    jButton13.setText("");
                }
                else{
                    jButton1.setText(txt5);
                    jButton5.setText(txt9);
                    jButton9.setText(val1);
                    jButton13.setText("");
                }
            }
            else {
                if((txt1.equals(txt5))&&(txt9.equals(val1))){
                    jButton1.setText(2*Integer.parseInt(txt5)+"");
                    jButton5.setText(2*Integer.parseInt(val1)+"");
                    jButton9.setText("");
                    jButton13.setText("");
                }
               else if((txt1.equals(txt5))&&(!txt9.equals(val1))){
                    jButton1.setText(2*Integer.parseInt(txt5)+"");
                    jButton5.setText(txt9);
                    jButton9.setText(val1);
                    jButton13.setText("");
                }
               else if(txt5.equals(txt9)){
                   jButton5.setText(2*Integer.parseInt(txt5)+"");
                   jButton9.setText(val1);
                   jButton13.setText("");}
               else if((!txt1.equals(txt5))&&(txt9.equals(val1))){
                    jButton9.setText(2*Integer.parseInt(val1)+"");
                    jButton13.setText("");
                }
                
            }
            
        }
         
          if(index1==9){
            if(txt5.equals("")&&txt1.equals("")){
                jButton1.setText(val1);
                jButton9.setText("");
            }
            else if(txt5.equals("")){
                if(txt1.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton9.setText("");
                }
                else{
                    jButton5.setText(val1);
                    jButton9.setText("");
                } 
            }
            else if(txt1.equals("")){
                if(txt5.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton9.setText("");
                    jButton5.setText("");
                }
                else{
                    jButton1.setText(txt5);
                    jButton9.setText("");
                    jButton5.setText(val1);
                } 
            }
            else {
                if(txt1.equals(txt5)){
                    jButton1.setText(2*Integer.parseInt(txt5)+"");
                    jButton5.setText(val1);
                    jButton9.setText("");
                    jButton13.setText("");
                }
                else if(txt5.equals(val1)){
                    jButton5.setText(2*Integer.parseInt(val1)+"");
                    jButton9.setText("");
                    jButton13.setText("");
                }
            }
        }
         
          if(index1==5){
            if(txt1.equals("")){
                jButton1.setText(val1);
                jButton5.setText("");
            }
            else if(txt1.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton1.setText(val1);
                    jButton5.setText("");
                }
            
        }
         
         
         if(index2==14){
            if(txt10.equals("")&&txt6.equals("")&&txt2.equals("")){
                jButton2.setText(val2);
                jButton14.setText("");
            }
            else if(txt10.equals("")&&txt6.equals("")){
                if(txt2.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(val2);
                    jButton14.setText("");
                }
                else{
                    jButton6.setText(val2);
                    jButton14.setText("");
                } 
            }
            else if(txt10.equals("")&&txt2.equals("")){
                if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(val2);
                    jButton14.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton2.setText(txt6);
                    jButton10.setText("");
                    jButton14.setText("");
                    jButton6.setText(val2);
                } 
            }
            else if(txt6.equals("")&&txt2.equals("")){
                if(txt10.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(val2);
                    jButton14.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton2.setText(txt10);
                    jButton10.setText("");
                    jButton14.setText("");
                    jButton6.setText(val2);
                } 
            }
            else if(txt10.equals("")){
                if(txt2.equals(txt6)){
                    jButton2.setText(2*Integer.parseInt(txt2)+"");
                   jButton6.setText(val2);
                   jButton14.setText("");
                }
                else if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton6.setText(val2);
                   jButton14.setText("");
                }
                else{
                    jButton10.setText(val2);
                   jButton14.setText("");
                }
            }
            else if(txt6.equals("")){
                if(txt2.equals(txt10)){
                    jButton2.setText(2*Integer.parseInt(txt2)+"");
                    jButton6.setText(val2);
                   jButton10.setText("");
                   jButton14.setText("");
                }
                else if(txt10.equals(val2)){
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton10.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton6.setText(txt10);
                    jButton10.setText(val2);
                    jButton14.setText("");
                }
            }
            else if(txt2.equals("")){
                if(txt6.equals(txt10)){
                    jButton2.setText(2*Integer.parseInt(txt6)+"");
                    jButton6.setText(val2);
                    jButton10.setText("");
                    jButton14.setText("");
                }
                else if(txt10.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(txt6);
                    jButton6.setText(val2);
                    jButton10.setText("");
                    jButton14.setText("");
                }
                else{
                    jButton2.setText(txt6);
                    jButton6.setText(txt10);
                    jButton10.setText(val2);
                    jButton14.setText("");
                }
            }
            else {
                if((txt2.equals(txt6))&&(txt10.equals(val2))){
                    jButton2.setText(2*Integer.parseInt(txt6)+"");
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton10.setText("");
                    jButton14.setText("");
                }
               else if((txt2.equals(txt6))&&!(txt10.equals(val2))){
                    jButton2.setText(2*Integer.parseInt(txt2)+"");
                    jButton6.setText(txt10);
                    jButton10.setText(val2);
                    jButton14.setText("");
                }
               else if(txt6.equals(txt10)){
                   jButton6.setText(2*Integer.parseInt(txt6)+"");
                   jButton10.setText(val2);
                   jButton14.setText("");}
               else if(!(txt2.equals(txt6))&&(txt10.equals(val2))){
                    jButton10.setText(2*Integer.parseInt(val2)+"");
                    jButton14.setText("");
                }
                
            }
        }
         
          if(index2==10){
            if(txt6.equals("")&&txt2.equals("")){
                jButton2.setText(val2);
                jButton10.setText("");
            }
            else if(txt6.equals("")){
                if(txt2.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(val2);
                    jButton10.setText("");
                }
                else{
                    jButton6.setText(val2);
                    jButton10.setText("");
                } 
            }
            else if(txt2.equals("")){
                if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(val2);
                    jButton10.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton2.setText(txt6);
                    jButton10.setText("");
                    jButton6.setText(val2);
                } 
            }
            else {
                if(txt2.equals(txt6)){
                    jButton2.setText(2*Integer.parseInt(txt6)+"");
                    jButton6.setText(val2);
                    jButton10.setText("");
                }
               else if(txt6.equals(val2)){
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton10.setText("");
                    jButton14.setText("");
                }
            }
        }
         
          if(index2==6){
            if(txt2.equals("")){
                jButton2.setText(val2);
                jButton6.setText("");
            }
            else if(txt2.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton2.setText(val2);
                    jButton6.setText("");
                }
             
        }
         
         
         if(index3==15){
            if(txt11.equals("")&&txt7.equals("")&&txt3.equals("")){
                jButton3.setText(val3);
                jButton15.setText("");
            }
            else if(txt11.equals("")&&txt7.equals("")){
                if(txt3.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(val3);
                    jButton15.setText("");
                }
                else{
                    jButton7.setText(val3);
                    jButton15.setText("");
                } 
            }
            else if(txt11.equals("")&&txt3.equals("")){
                if(txt7.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(val3);
                    jButton15.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton3.setText(txt7);
                    jButton15.setText("");
                    jButton7.setText(val3);
                } 
            }
            else if(txt7.equals("")&&txt3.equals("")){
                if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(val3);
                    jButton15.setText("");
                    jButton11.setText("");
                }
                else{
                    jButton3.setText(txt11);
                    jButton11.setText("");
                    jButton15.setText("");
                    jButton7.setText(val3);
                } 
            }
            else if(txt11.equals("")){
                if(txt3.equals(txt7)){
                    jButton3.setText(2*Integer.parseInt(txt3)+"");
                   jButton7.setText(val3);
                   jButton15.setText("");
                }
                else if(txt7.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton7.setText(val3);
                   jButton15.setText("");
                }
                else{
                    jButton11.setText(val3);
                   jButton15.setText("");
                }
            }
            else if(txt7.equals("")){
                if(txt3.equals(txt11)){
                    jButton3.setText(2*Integer.parseInt(txt3)+"");
                    jButton7.setText(val3);
                   jButton11.setText("");
                   jButton15.setText("");
                }
                else if(txt11.equals(val3)){
                    jButton7.setText(2*Integer.parseInt(val3)+"");
                    jButton11.setText("");
                    jButton15.setText("");
                }
                else{
                    jButton7.setText(txt11);
                    jButton11.setText(val3);
                    jButton15.setText("");
                }
            }
            else if(txt3.equals("")){
                if(txt7.equals(txt11)){
                    jButton3.setText(2*Integer.parseInt(txt7)+"");
                    jButton7.setText(val3);
                    jButton11.setText("");
                    jButton15.setText("");
                }
                else if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(txt7);
                    jButton7.setText(val3);
                    jButton11.setText("");
                    jButton15.setText("");
                }
                else{
                    jButton3.setText(txt7);
                    jButton7.setText(txt11);
                    jButton11.setText(val3);
                    jButton15.setText("");
                }
            }
            else {
                if((txt3.equals(txt7))&&(txt11.equals(val3))){
                    jButton3.setText(2*Integer.parseInt(txt7)+"");
                    jButton7.setText(2*Integer.parseInt(val3)+"");
                    jButton11.setText("");
                    jButton15.setText("");
                }
                else if((txt3.equals(txt7))&&!(txt11.equals(val3))){
                    jButton3.setText(2*Integer.parseInt(txt3)+"");
                    jButton7.setText(txt11);
                    jButton11.setText(val3);
                    jButton15.setText("");
                }
                else if(txt7.equals(txt11)){
                   jButton7.setText(2*Integer.parseInt(txt7)+"");
                   jButton11.setText(val3);
                   jButton15.setText("");}
                else if(!(txt3.equals(txt7))&&(txt11.equals(val3))){
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton15.setText("");
                }
                
            }
        }
         
          if(index3==11){
            if(txt7.equals("")&&txt3.equals("")){
                jButton3.setText(val3);
                jButton11.setText("");
            }
            else if(txt7.equals("")){
                if(txt3.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(val3);
                    jButton11.setText("");
                }
                else{
                    jButton10.setText(val3);
                    jButton11.setText("");
                } 
            }
            else if(txt3.equals("")){
                if(txt7.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(val3);
                    jButton11.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton3.setText(txt7);
                    jButton11.setText("");
                    jButton7.setText(val3);
                } 
            }
            else {
                if(txt3.equals(txt7)){
                    jButton3.setText(2*Integer.parseInt(txt7)+"");
                    jButton7.setText(val3);
                    jButton11.setText("");
                    jButton15.setText("");
                }
               else if(txt7.equals(val3)){
                    jButton7.setText(2*Integer.parseInt(val3)+"");
                    jButton11.setText("");
                    jButton15.setText("");
                }
            }
        }
         
          if(index3==7){
            if(txt3.equals("")){
                jButton3.setText(val3);
                jButton7.setText("");
            }
            else if(txt3.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton3.setText(val3);
                    jButton7.setText("");
                }
             
        }
         
         
         
         if(index4==16){
            if(txt12.equals("")&&txt8.equals("")&&txt4.equals("")){
                jButton4.setText(val4);
                jButton16.setText("");
            }
            else if(txt12.equals("")&&txt8.equals("")){
                if(txt4.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(val4);
                    jButton16.setText("");
                }
                else{
                    jButton8.setText(val4);
                    jButton16.setText("");
                } 
            }
            else if(txt12.equals("")&&txt8.equals("")){
                if(txt8.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(val4);
                    jButton16.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton4.setText(txt14);
                    jButton16.setText("");
                    jButton8.setText(val4);
                } 
            }
            else if(txt8.equals("")&&txt4.equals("")){
                if(txt12.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(val4);
                    jButton16.setText("");
                    jButton12.setText("");
                }
                else{
                    jButton4.setText(txt12);
                    jButton12.setText("");
                    jButton16.setText("");
                    jButton8.setText(val4);
                } 
            }
            else if(txt12.equals("")){
                if(txt4.equals(txt8)){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                   jButton8.setText(val4);
                   jButton16.setText("");
                }
                else if(txt8.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton8.setText(val4);
                   jButton16.setText("");
                }
                else{
                    jButton12.setText(val4);
                   jButton16.setText("");
                }
            }
            else if(txt8.equals("")){
                if(txt4.equals(txt12)){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                    jButton8.setText(val4);
                   jButton12.setText("");
                   jButton16.setText("");
                }
                else if(txt12.equals(val4)){
                    jButton8.setText(2*Integer.parseInt(val4)+"");
                    jButton12.setText("");
                    jButton16.setText("");
                }
                else{
                    jButton8.setText(txt12);
                    jButton12.setText(val4);
                    jButton16.setText("");
                }
            }
            else if(txt4.equals("")){
                if(txt8.equals(txt12)){
                    jButton4.setText(2*Integer.parseInt(txt8)+"");
                    jButton8.setText(val4);
                    jButton12.setText("");
                    jButton16.setText("");
                }
                else if(txt12.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(txt8);
                    jButton8.setText(val4);
                    jButton12.setText("");
                    jButton16.setText("");
                }
                else{
                    jButton4.setText(txt8);
                    jButton8.setText(txt12);
                    jButton12.setText(val4);
                    jButton16.setText("");
                }
            }
            else {
                if((txt4.equals(txt8))&&(txt12.equals(val4))){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                    jButton8.setText(2*Integer.parseInt(val4)+"");
                    jButton12.setText("");
                    jButton16.setText("");
                }
               else if((txt4.equals(txt8))&&!(txt12.equals(val4))){
                    jButton4.setText(2*Integer.parseInt(txt4)+"");
                    jButton8.setText(txt12);
                    jButton12.setText(val4);
                    jButton16.setText("");
                }
               else if(txt8.equals(txt12)){
                   jButton8.setText(2*Integer.parseInt(txt8)+"");
                   jButton12.setText(val4);
                   jButton16.setText("");}
               else if(!(txt4.equals(txt8))&&(txt12.equals(val4))){
                    jButton12.setText(2*Integer.parseInt(val4)+"");
                    jButton16.setText("");
                }
                
            }
        }
         
          if(index4==12){
            if(txt8.equals("")&&txt4.equals("")){
                jButton4.setText(val4);
                jButton12.setText("");
            }
            else if(txt8.equals("")){
                if(txt4.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(val4);
                    jButton12.setText("");
                }
                else{
                    jButton8.setText(val4);
                    jButton12.setText("");
                } 
            }
            else if(txt4.equals("")){
                if(txt8.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(val4);
                    jButton12.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton4.setText(txt8);
                    jButton12.setText("");
                    jButton8.setText(val4);
                } 
            }
            else {
                if(txt4.equals(txt8)){
                    jButton4.setText(2*Integer.parseInt(txt8)+"");
                    jButton8.setText(val4);
                    jButton12.setText("");
                    jButton16.setText("");
                }
               else if(txt8.equals(val4)){
                    jButton8.setText(2*Integer.parseInt(val4)+"");
                    jButton12.setText("");
                    jButton16.setText("");
                }
            }
        }
         
          if(index4==8){
            if(txt4.equals("")){
                jButton4.setText(val4);
                jButton8.setText("");
            }
            else if(txt4.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton4.setText(val4);
                    jButton8.setText("");
                }
             
        }
         
         setIndex();
       }
        
        
        void downShift(int index1,String val1,int index2,String val2,int index3,String val3,int index4,String val4){    
        
        if(index1==1){
            if(txt9.equals("")&&txt5.equals("")&&txt13.equals("")){
                jButton13.setText(val1);
                jButton1.setText("");
            }
            else if(txt9.equals("")&&txt5.equals("")){
                if(txt13.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(val1);
                    jButton1.setText("");
                }
                else{
                    jButton9.setText(val1);
                    jButton1.setText("");
                } 
            }
            else if(txt9.equals("")&&txt13.equals("")){
                if(txt5.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(val1);
                    jButton1.setText("");
                    jButton5.setText("");
                }
                else{
                    jButton13.setText(txt5);
                    jButton1.setText("");
                    jButton5.setText("");
                    jButton9.setText(val1);
                } 
            }
            else if(txt5.equals("")&&txt13.equals("")){
                if(txt9.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(val1);
                    jButton1.setText("");
                    jButton9.setText("");
                }
                else{
                    jButton13.setText(txt9);
                    jButton1.setText("");
                    jButton9.setText(val1);
                } 
            }
            else if(txt9.equals("")){
                if(txt13.equals(txt5)){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                   jButton9.setText(val1);
                   jButton1.setText("");
                   jButton5.setText("");
                }
                else if(txt5.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton9.setText(val1);
                   jButton1.setText("");
                   jButton5.setText("");
                }
                else{
                    jButton9.setText(txt5);
                    jButton5.setText(val1);
                   jButton1.setText("");
                }
            }
            else if(txt5.equals("")){
                if(txt13.equals(txt9)){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                    jButton9.setText(val1);
                   jButton1.setText("");
                }
                else if(txt9.equals(val1)){
                    jButton9.setText(2*Integer.parseInt(val1)+"");
                    jButton1.setText("");
                }
                else{
                    jButton5.setText(val1);
                    jButton1.setText("");
                }
            }
            else if(txt13.equals("")){
                if(txt9.equals(txt5)){
                    jButton13.setText(2*Integer.parseInt(txt9)+"");
                    jButton9.setText(val1);
                    jButton1.setText("");
                    jButton5.setText("");
                }
                else if(txt5.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(txt9);
                    jButton9.setText(val1);
                    jButton1.setText("");
                    jButton5.setText("");
                }
                else{
                    jButton13.setText(txt9);
                    jButton9.setText(txt5);
                    jButton5.setText(val1);
                    jButton1.setText("");
                }
            }
            
            else {
                if((txt13.equals(txt9))&&(txt5.equals(val1))){
                    jButton13.setText(2*Integer.parseInt(txt13)+"");
                    jButton9.setText(2*Integer.parseInt(val1)+"");
                    jButton5.setText("");
                    jButton1.setText("");
                }
               else if((txt13.equals(txt9))&&(!txt5.equals(val1))){
                    jButton13.setText(2*Integer.parseInt(txt9)+"");
                    jButton9.setText(txt5);
                    jButton5.setText(val1);
                    jButton1.setText("");
                }
               else if(txt5.equals(txt9)){
                   jButton9.setText(2*Integer.parseInt(txt9)+"");
                   jButton5.setText(val1);
                   jButton1.setText("");}
               else if((!txt13.equals(txt9))&&(txt5.equals(val1))){
                    jButton5.setText(2*Integer.parseInt(val1)+"");
                    jButton1.setText("");
                }
                
            }
            
        
        }
         
          if(index1==5){
            if(txt9.equals("")&&txt13.equals("")){
                jButton13.setText(val1);
                jButton5.setText("");
            }
            else if(txt9.equals("")){
                if(txt13.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(val1);
                    jButton5.setText("");
                }
                else{
                    jButton9.setText(val1);
                    jButton5.setText(txt1);
                } 
            }
            else if(txt13.equals("")){
                if(txt9.equals(val1)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(val1);
                    jButton9.setText("");
                    jButton5.setText("");
                }
                else{
                    jButton13.setText(txt9);
                    jButton5.setText("");
                    jButton9.setText(val1);
                } 
            }
            else {
                if(txt13.equals(txt9)){
                    jButton13.setText(2*Integer.parseInt(txt9)+"");
                    jButton9.setText(val1);
                    jButton5.setText("");
                    jButton1.setText("");
                }
                else if(txt9.equals(val1)){
                    jButton9.setText(2*Integer.parseInt(val1)+"");
                    jButton5.setText("");
                    jButton1.setText("");
                }
            }
        }
         
         else if(index1==9){
            if(txt13.equals("")){
                jButton13.setText(val1);
                jButton9.setText("");
            }
            else if(val1.equals(txt13)){
                    val1=2*Integer.parseInt(val1)+"";
                    jButton13.setText(val1);
                    jButton9.setText("");
                }
            
        }
         
          if(index2==2){
            if(txt10.equals("")&&txt6.equals("")&&txt14.equals("")){
                jButton14.setText(val2);
                jButton2.setText("");
            }
            else if(txt10.equals("")&&txt6.equals("")){
                if(txt14.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(val2);
                    jButton2.setText("");
                }
                else{
                    jButton10.setText(val2);
                    jButton2.setText("");
                } 
            }
            else if(txt10.equals("")&&txt14.equals("")){
                if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(val2);
                    jButton2.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton14.setText(txt6);
                    jButton2.setText("");
                    jButton6.setText("");
                    jButton10.setText(val2);
                } 
            }
            else if(txt6.equals("")&&txt14.equals("")){
                if(txt10.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(val2);
                    jButton2.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton14.setText(txt10);
                    jButton2.setText("");
                    jButton10.setText(val2);
                } 
            }
            else if(txt10.equals("")){
                if(txt14.equals(txt6)){
                    jButton14.setText(2*Integer.parseInt(txt14)+"");
                   jButton10.setText(val2);
                   jButton2.setText("");
                   jButton6.setText("");
                }
                else if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton10.setText(val2);
                   jButton2.setText("");
                   jButton6.setText("");
                }
                else{
                    jButton10.setText(txt6);
                    jButton6.setText(val2);
                   jButton2.setText("");
                }
            }
            else if(txt6.equals("")){
                if(txt14.equals(txt10)){
                    jButton14.setText(2*Integer.parseInt(txt14)+"");
                    jButton10.setText(val2);
                   jButton2.setText("");
                }
                else if(txt10.equals(val2)){
                    jButton10.setText(2*Integer.parseInt(val2)+"");
                    jButton2.setText("");
                }
                else{
                    jButton6.setText(val2);
                    jButton2.setText("");
                }
            }
            else if(txt14.equals("")){
                if(txt6.equals(txt10)){
                    jButton14.setText(2*Integer.parseInt(txt10)+"");
                    jButton10.setText(val2);
                    jButton2.setText("");
                    jButton6.setText("");
                }
                else if(txt6.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(txt10);
                    jButton10.setText(val2);
                    jButton2.setText("");
                    jButton6.setText("");
                }
                else{
                    jButton14.setText(txt10);
                    jButton10.setText(txt6);
                    jButton6.setText(val2);
                    jButton2.setText("");
                }
            }
            else {
                if((txt14.equals(txt10))&&(txt6.equals(val2))){
                    jButton14.setText(2*Integer.parseInt(txt14)+"");
                    jButton10.setText(2*Integer.parseInt(val2)+"");
                    jButton6.setText("");
                    jButton2.setText("");
                }
               else if((txt14.equals(txt10))&&!(txt6.equals(val2))){
                    jButton14.setText(2*Integer.parseInt(txt14)+"");
                    jButton10.setText(txt6);
                    jButton6.setText(val2);
                    jButton2.setText("");
                }
               else if(txt6.equals(txt10)){
                   jButton10.setText(2*Integer.parseInt(txt10)+"");
                   jButton6.setText(val2);
                   jButton2.setText("");}
               else if(!(txt14.equals(txt10))&&(txt6.equals(val2))){
                    jButton6.setText(2*Integer.parseInt(val2)+"");
                    jButton2.setText("");
                }
                
            }
            
        }
         
          if(index2==6){
            if(txt10.equals("")&&txt14.equals("")){
                jButton14.setText(val2);
                jButton6.setText("");
            }
            else if(txt10.equals("")){
                if(txt14.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(val2);
                    jButton6.setText("");
                }
                else{
                    jButton10.setText(val2);
                    jButton6.setText("");
                    
                } 
            }
            else if(txt14.equals("")){
                if(txt10.equals(val2)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(val2);
                    jButton6.setText("");
                    jButton10.setText("");
                }
                else{
                    jButton14.setText(txt10);
                    jButton6.setText("");
                    jButton10.setText(val2);
                } 
            }
            
            else {
                if(txt14.equals(txt10)){
                    jButton14.setText(2*Integer.parseInt(txt10)+"");
                    jButton10.setText(val2);
                    jButton6.setText("");
                    jButton2.setText("");
                }
               else if(txt10.equals(val2)){
                    jButton10.setText(2*Integer.parseInt(val2)+"");
                    jButton6.setText("");
                    jButton2.setText("");
                }
            }
        }
         
         else if(index2==10){
            if(txt14.equals("")){
                jButton14.setText(val2);
                jButton10.setText("");
            }
            else if(val2.equals(txt14)){
                    val2=2*Integer.parseInt(val2)+"";
                    jButton14.setText(val2);
                    jButton10.setText("");
                }
            
        }
          
          
         
         if(index3==3){
            if(txt11.equals("")&&txt7.equals("")&&txt15.equals("")){
                jButton15.setText(val3);
                jButton3.setText("");
            }
            else if(txt11.equals("")&&txt7.equals("")){
                if(txt15.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(val3);
                    jButton3.setText("");
                }
                else{
                    jButton11.setText(val3);
                    jButton3.setText("");
                } 
            }
            else if(txt11.equals("")&&txt15.equals("")){
                if(txt7.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(val3);
                    jButton3.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton15.setText(txt7);
                    jButton3.setText("");
                    jButton7.setText("");
                    jButton11.setText(val3);
                } 
            }
            else if(txt7.equals("")&&txt15.equals("")){
                if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(val3);
                    jButton3.setText("");
                    jButton11.setText("");
                }
                else{
                    jButton15.setText(txt11);
                    jButton3.setText("");
                    jButton11.setText(val3);
                } 
            }
            else if(txt11.equals("")){
                if(txt15.equals(txt7)){
                    jButton12.setText(2*Integer.parseInt(txt15)+"");
                   jButton11.setText(val3);
                   jButton3.setText("");
                   jButton7.setText("");
                }
                else if(txt7.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton11.setText(val3);
                   jButton3.setText("");
                   jButton7.setText("");
                }
                else{
                    jButton11.setText(txt7);
                    jButton7.setText(val3);
                   jButton3.setText("");
                }
            }
            else if(txt7.equals("")){
                if(txt15.equals(txt11)){
                    jButton15.setText(2*Integer.parseInt(txt15)+"");
                    jButton11.setText(val3);
                   jButton3.setText("");
                }
                else if(txt11.equals(val3)){
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton3.setText("");
                }
                else{
                    jButton7.setText(val3);
                    jButton3.setText("");
                }
            }
            else if(txt15.equals("")){
                if(txt7.equals(txt11)){
                    jButton15.setText(2*Integer.parseInt(txt11)+"");
                    jButton11.setText(val3);
                    jButton3.setText("");
                    jButton7.setText("");
                }
                else if(txt7.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(txt11);
                    jButton11.setText(val3);
                    jButton3.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton15.setText(txt11);
                    jButton11.setText(txt7);
                    jButton7.setText(val3);
                    jButton3.setText("");
                }
            }
            else {
                if((txt15.equals(txt11))&&(txt7.equals(val3))){
                    jButton15.setText(2*Integer.parseInt(txt15)+"");
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton7.setText("");
                    jButton3.setText("");
                }
                else if((txt15.equals(txt11))&&!(txt7.equals(val3))){
                    jButton15.setText(2*Integer.parseInt(txt15)+"");
                    jButton11.setText(txt7);
                    jButton10.setText(val3);
                    jButton3.setText("");
                }
                else if(txt7.equals(txt11)){
                   jButton11.setText(2*Integer.parseInt(txt11)+"");
                   jButton7.setText(val3);
                   jButton3.setText("");}
                else if(!(txt15.equals(txt11))&&(txt7.equals(val3))){
                    jButton7.setText(2*Integer.parseInt(val3)+"");
                    jButton3.setText("");
                }
                
            }
            
        }
         
          if(index3==7){
            if(txt11.equals("")&&txt15.equals("")){
                jButton15.setText(val3);
                jButton11.setText(txt3);
            }
            else if(txt11.equals("")){
                if(txt15.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(val3);
                    jButton7.setText("");
                }
                else{
                    jButton11.setText(val3);
                    jButton7.setText("");
                } 
            }
            else if(txt15.equals("")){
                if(txt11.equals(val3)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(val3);
                    jButton11.setText("");
                    jButton7.setText("");
                }
                else{
                    jButton15.setText(txt11);
                    jButton7.setText("");
                    jButton11.setText(val3);
                } 
            }
            else {
                if(txt15.equals(txt11)){
                    jButton15.setText(2*Integer.parseInt(txt11)+"");
                    jButton11.setText(val3);
                    jButton7.setText("");
                    jButton3.setText("");
                }
               else if(txt11.equals(val3)){
                    jButton11.setText(2*Integer.parseInt(val3)+"");
                    jButton7.setText("");
                    jButton3.setText("");
                }
            }
        }
         
         else if(index3==11){
            if(txt15.equals("")){
                jButton15.setText(val3);
                jButton11.setText("");
            }
            else if(val3.equals(txt15)){
                    val3=2*Integer.parseInt(val3)+"";
                    jButton15.setText(val3);
                    jButton11.setText("");
                }
            
        }
         
         
         
         
         
         
         if(index4==4){
            if(txt12.equals("")&&txt8.equals("")&&txt16.equals("")){
                jButton16.setText(val4);
                jButton4.setText("");
            }
            else if(txt12.equals("")&&txt8.equals("")){
                if(txt16.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton4.setText("");
                }
                else{
                    jButton12.setText(val4);
                    jButton4.setText("");
                } 
            }
            else if(txt12.equals("")&&txt16.equals("")){
                if(txt8.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton4.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton16.setText(txt8);
                    jButton4.setText("");
                    jButton8.setText("");
                    jButton12.setText(val4);
                } 
            }
            else if(txt8.equals("")&&txt16.equals("")){
                if(txt12.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton4.setText("");
                    jButton12.setText("");
                }
                else{
                    jButton16.setText(txt12);
                    jButton4.setText("");
                    jButton12.setText(val4);
                } 
            }
            else if(txt12.equals("")){
                if(txt16.equals(txt8)){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                   jButton12.setText(val4);
                   jButton4.setText("");
                   jButton8.setText("");
                }
                else if(txt8.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton12.setText(val4);
                   jButton4.setText("");
                   jButton8.setText("");
                }
                else{
                    jButton12.setText(txt8);
                    jButton8.setText(val4);
                   jButton4.setText("");
                }
            }
            else if(txt8.equals("")){
                if(txt16.equals(txt12)){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                    jButton12.setText(val4);
                   jButton4.setText("");
                }
                else if(txt12.equals(val4)){
                    jButton12.setText(2*Integer.parseInt(val4)+"");
                    jButton4.setText("");
                }
                else{
                    jButton8.setText(val4);
                    jButton4.setText("");
                }
            }
            else if(txt16.equals("")){
                if(txt8.equals(txt12)){
                    jButton16.setText(2*Integer.parseInt(txt12)+"");
                    jButton12.setText(val4);
                    jButton4.setText("");
                    jButton8.setText("");
                }
                else if(txt8.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(txt12);
                    jButton12.setText(val4);
                    jButton4.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton16.setText(txt12);
                    jButton12.setText(txt8);
                    jButton8.setText(val4);
                    jButton4.setText("");
                }
            }
            
            else {
                if((txt16.equals(txt12))&&(txt8.equals(val4))){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                    jButton12.setText(2*Integer.parseInt(val4)+"");
                    jButton8.setText("");
                    jButton4.setText("");
                }
               else if((txt16.equals(txt12))&&!(txt8.equals(val4))){
                    jButton16.setText(2*Integer.parseInt(txt16)+"");
                    jButton12.setText(txt8);
                    jButton8.setText(val4);
                    jButton4.setText("");
                }
               else if(txt8.equals(txt12)){
                   jButton12.setText(2*Integer.parseInt(txt12)+"");
                   jButton8.setText(val4);
                   jButton4.setText("");}
               else if(!(txt16.equals(txt12))&&(txt8.equals(val4))){
                    jButton8.setText(2*Integer.parseInt(val4)+"");
                    jButton4.setText("");
                }
                
            }
        }
         
          if(index4==8){
            if(txt12.equals("")&&txt16.equals("")){
                jButton16.setText(val4);
                jButton8.setText("");
            }
            else if(txt12.equals("")){
                if(txt16.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton8.setText("");
                }
                else{
                    jButton12.setText(val4);
                    jButton8.setText("");
                } 
            }
            else if(txt16.equals("")){
                if(txt12.equals(val4)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton12.setText("");
                    jButton8.setText("");
                }
                else{
                    jButton16.setText(txt12);
                    jButton8.setText("");
                    jButton12.setText(val4);
                } 
            }
            
            else {
                if(txt16.equals(txt12)){
                    jButton16.setText(2*Integer.parseInt(txt12)+"");
                    jButton12.setText(val4);
                    jButton8.setText("");
                    jButton4.setText("");
                }
               else if(txt12.equals(val4)){
                    jButton12.setText(2*Integer.parseInt(val4)+"");
                    jButton8.setText("");
                    jButton4.setText("");
                }
            }
        }
         
         else if(index4==12){
            if(txt16.equals("")){
                jButton16.setText(val4);
                jButton12.setText("");
            }
            else if(val4.equals(txt16)){
                    val4=2*Integer.parseInt(val4)+"";
                    jButton16.setText(val4);
                    jButton12.setText("");
                }
            
        }
         
         setIndex();
       }
        
      }
        
        void setIndex(){
        String txt1=jButton1.getText();
        String txt2=jButton2.getText();
        String txt3=jButton3.getText();
        String txt4=jButton4.getText();
        String txt5=jButton5.getText();
        String txt6=jButton6.getText();
        String txt7=jButton7.getText();
        String txt8=jButton8.getText();
        String txt9=jButton9.getText();
        String txt10=jButton10.getText();
        String txt11=jButton11.getText();
        String txt12=jButton12.getText();
        String txt13=jButton13.getText();
        String txt14=jButton14.getText();
        String txt15=jButton15.getText();
        String txt16=jButton16.getText();
        int arr[]=new int [17];
        for(int i=1;i<=16;i++)
            arr[i]=0;
        if(txt1.equals(""))
            arr[1]=1;
        if(txt2.equals(""))
            arr[2]=2;
        if(txt3.equals(""))
            arr[3]=3;
        if(txt4.equals(""))
            arr[4]=4;
        if(txt5.equals(""))
            arr[5]=5;
        if(txt6.equals(""))
            arr[6]=6;
        if(txt7.equals(""))
            arr[7]=7;
        if(txt8.equals(""))
            arr[8]=8;
        if(txt9.equals(""))
            arr[9]=9;
        if(txt10.equals(""))
            arr[10]=10;
        if(txt11.equals(""))
            arr[11]=11;
        if(txt12.equals(""))
            arr[12]=12;
        if(txt13.equals(""))
            arr[13]=13;
        if(txt14.equals(""))
            arr[14]=14;
        if(txt15.equals(""))
            arr[15]=15;
        if(txt16.equals(""))
            arr[16]=16;
        int r=0;
        while(r==0)
            r=arr[(int)(16*Math.random())+1];
        int n=2*((int)(2*Math.random())+1);
        if(r==1){arr[1]=0;
            jButton1.setText(n+"");}
        if(r==2){arr[2]=0;
            jButton2.setText(n+"");}
        if(r==3){arr[3]=0;
            jButton3.setText(n+"");}
        if(r==4){arr[4]=0;
            jButton4.setText(n+"");}
        if(r==5){arr[5]=0;
            jButton5.setText(n+"");}
        if(r==6){arr[6]=0;
            jButton6.setText(n+"");}
        if(r==7){arr[7]=0;
            jButton7.setText(n+"");}
        if(r==8){arr[8]=0;
            jButton8.setText(n+"");}
        if(r==9){arr[9]=0;
            jButton9.setText(n+"");}
        if(r==10){arr[10]=0;
            jButton10.setText(n+"");}
        if(r==11){arr[11]=0;
            jButton11.setText(n+"");}
        if(r==12){arr[12]=0;
            jButton12.setText(n+"");}
        if(r==13){arr[13]=0;
            jButton13.setText(n+"");}
        if(r==14){arr[14]=0;
            jButton14.setText(n+"");}
        if(r==15){arr[15]=0;
            jButton15.setText(n+"");}
        if(r==16){arr[16]=0;
            jButton16.setText(n+"");}
        else if(arr[1]==0&&arr[2]==0&&arr[3]==0&&arr[4]==0&&arr[5]==0&&arr[6]==0&&arr[7]==0&&
                arr[8]==0&&arr[9]==0&&arr[10]==0&&arr[11]==0&&arr[12]==0&&arr[13]==0&&arr[14]==0&&arr[15]==0&&arr[16]==0){
                Toolkit.getDefaultToolkit().beep();
                int opt=JOptionPane.showOptionDialog(this, "Game Over!!! \n Do You Want to Restart???", 
                        "Message",JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE, null, null, null);
                if(opt==0){
                    this.dispose();
                    new Puzzle2048().setVisible(true);}
                else
                    System.exit(opt);
            }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setFocusable(false);
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 50, 100, 100);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setFocusable(false);
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 50, 100, 100);

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton3.setFocusable(false);
        jPanel1.add(jButton3);
        jButton3.setBounds(200, 50, 100, 100);

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton4.setFocusable(false);
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 50, 100, 100);

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton5.setFocusable(false);
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 150, 100, 100);

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton6.setFocusable(false);
        jPanel1.add(jButton6);
        jButton6.setBounds(100, 150, 100, 100);

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton7.setFocusable(false);
        jPanel1.add(jButton7);
        jButton7.setBounds(200, 150, 100, 100);

        jButton8.setBackground(new java.awt.Color(255, 102, 0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton8.setFocusable(false);
        jPanel1.add(jButton8);
        jButton8.setBounds(300, 150, 100, 100);

        jButton9.setBackground(new java.awt.Color(255, 102, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton9.setFocusable(false);
        jPanel1.add(jButton9);
        jButton9.setBounds(0, 250, 100, 100);

        jButton10.setBackground(new java.awt.Color(255, 102, 0));
        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton10.setFocusable(false);
        jPanel1.add(jButton10);
        jButton10.setBounds(100, 250, 100, 100);

        jButton11.setBackground(new java.awt.Color(255, 102, 0));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton11.setFocusable(false);
        jPanel1.add(jButton11);
        jButton11.setBounds(200, 250, 100, 100);

        jButton12.setBackground(new java.awt.Color(255, 102, 0));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton12.setFocusable(false);
        jPanel1.add(jButton12);
        jButton12.setBounds(300, 250, 100, 100);

        jButton13.setBackground(new java.awt.Color(255, 102, 0));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton13.setFocusable(false);
        jPanel1.add(jButton13);
        jButton13.setBounds(0, 350, 100, 100);

        jButton14.setBackground(new java.awt.Color(255, 102, 0));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton14.setFocusable(false);
        jPanel1.add(jButton14);
        jButton14.setBounds(100, 350, 100, 100);

        jButton15.setBackground(new java.awt.Color(255, 102, 0));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton15.setFocusable(false);
        jPanel1.add(jButton15);
        jButton15.setBounds(200, 350, 100, 100);

        jButton16.setBackground(new java.awt.Color(255, 102, 0));
        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton16.setFocusable(false);
        jPanel1.add(jButton16);
        jButton16.setBounds(300, 350, 100, 100);

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("SCORE :                 ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(50, new java.awt.Color(204, 102, 0), new java.awt.Color(255, 255, 0)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 3, 400, 45);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 int index1,index2,index3,index4;
 String val1,val2,val3,val4;
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        String txt1=jButton1.getText();
        String txt2=jButton2.getText();
        String txt3=jButton3.getText();
        String txt4=jButton4.getText();
        String txt5=jButton5.getText();
        String txt6=jButton6.getText();
        String txt7=jButton7.getText();
        String txt8=jButton8.getText();
        String txt9=jButton9.getText();
        String txt10=jButton10.getText();
        String txt11=jButton11.getText();
        String txt12=jButton12.getText();
        String txt13=jButton13.getText();
        String txt14=jButton14.getText();
        String txt15=jButton15.getText();
        String txt16=jButton16.getText();
        int keycode=evt.getKeyCode();
        if(keycode==37){
            System.out.println("leftShift()");
            index1=4;
            val1=txt4;
            if(txt4.equals(""))
            {
                index1=3;
                val1=txt3;
                if(txt3.equals(""))
                {
                    index1=2;
                    val1=txt2;
                    if(txt2.equals(""))
                    {
                        index1=1;
                        val1=txt1;
                    }
                }
            }
            index2=8;
            val2=txt8;
            if(txt8.equals(""))
            {
                index2=7;
                val2=txt7;
                if(txt7.equals(""))
                {
                    index2=6;
                    val2=txt6;
                    if(txt6.equals(""))
                    {
                        index2=5;
                        val2=txt5;
                    }
                }
            }
            index3=12;
            val3=txt12;
            if(txt12.equals(""))
            {
                index3=11;
                val3=txt11;
                if(txt11.equals(""))
                {
                    index3=10;
                    val3=txt10;
                    if(txt10.equals(""))
                    {
                        index3=9;
                        val3=txt9;
                    }
                }
            }
            index4=16;
            val4=txt16;
            if(txt16.equals(""))
            {
                index4=15;
                val4=txt15;
                if(txt15.equals(""))
                {
                    index4=14;
                    val4=txt14;
                    if(txt14.equals(""))
                    {
                        index4=13;
                        val4=txt13;
                    }
                }
            }
            Shift s=new Shift();
            s.leftShift(index1,val1, index2,val2, index3,val3, index4,val4);
        }
        
        if(keycode==39){
            System.out.println("rightShift()");
            index1=1;
            val1=txt1;
            if(txt1.equals(""))
            {
                index1=2;
                val1=txt2;
                if(txt2.equals(""))
                {
                    index1=3;
                    val1=txt3;
                    if(txt3.equals(""))
                    {
                        index1=4;
                        val1=txt4;
                    }
                }
            }
            index2=5;
            val2=txt5;
            if(txt5.equals(""))
            {
                index2=6;
                val2=txt6;
                if(txt6.equals(""))
                {
                    index2=7;
                    val2=txt7;
                    if(txt7.equals(""))
                    {
                        index2=8;
                        val2=txt8;
                    }
                }
            }
            index3=9;
            val3=txt9;
            if(txt9.equals(""))
            {
                index3=10;
                val3=txt10;
                if(txt10.equals(""))
                {
                    index3=11;
                    val3=txt11;
                    if(txt11.equals(""))
                    {
                        index3=12;
                        val3=txt12;
                    }
                }
            }
            index4=13;
            val4=txt13;
            if(txt13.equals(""))
            {
                index4=14;
                val4=txt14;
                if(txt14.equals(""))
                {
                    index4=15;
                    val4=txt15;
                    if(txt15.equals(""))
                    {
                        index4=16;
                        val4=txt16;
                    }
                }
            }
            Shift s=new Shift();
            s.rightShift(index1,val1, index2,val2, index3,val3, index4,val4);
        }
        
        if(keycode==38){
            System.out.println("upShift()");
            index1=13;
            val1=txt13;
            if(txt13.equals(""))
            {
                index1=9;
                val1=txt9;
                if(txt9.equals(""))
                {
                    index1=5;
                    val1=txt5;
                    if(txt5.equals(""))
                    {
                        index1=1;
                        val1=txt1;
                    }
                }
            }
            index2=14;
            val2=txt14;
            if(txt14.equals(""))
            {
                index2=10;
                val2=txt10;
                if(txt10.equals(""))
                {
                    index2=6;
                    val2=txt6;
                    if(txt6.equals(""))
                    {
                        index2=2;
                        val2=txt2;
                    }
                }
            }
            index3=15;
            val3=txt15;
            if(txt15.equals(""))
            {
                index3=11;
                val3=txt11;
                if(txt11.equals(""))
                {
                    index3=7;
                    val3=txt7;
                    if(txt7.equals(""))
                    {
                        index3=3;
                        val3=txt3;
                    }
                }
            }
            index4=16;
            val4=txt16;
            if(txt16.equals(""))
            {
                index4=12;
                val4=txt12;
                if(txt12.equals(""))
                {
                    index4=8;
                    val4=txt8;
                    if(txt8.equals(""))
                    {
                        index4=4;
                        val4=txt4;
                    }
                }
            }
            Shift s=new Shift();
            s.upShift(index1,val1, index2,val2, index3,val3, index4,val4);
        }
        
        if(keycode==40){
            System.out.println("downShift()");
            index1=1;
            val1=txt1;
            if(txt1.equals(""))
            {
                index1=5;
                val1=txt5;
                if(txt5.equals(""))
                {
                    index1=9;
                    val1=txt9;
                    if(txt9.equals(""))
                    {
                        index1=13;
                        val1=txt13;
                    }
                }
            }
            index2=2;
            val2=txt2;
            if(txt2.equals(""))
            {
                index2=6;
                val2=txt6;
                if(txt6.equals(""))
                {
                    index2=10;
                    val2=txt10;
                    if(txt10.equals(""))
                    {
                        index2=14;
                        val2=txt14;
                    }
                }
            }
            index3=3;
            val3=txt3;
            if(txt3.equals(""))
            {
                index3=7;
                val3=txt7;
                if(txt7.equals(""))
                {
                    index3=11;
                    val3=txt11;
                    if(txt11.equals(""))
                    {
                        index3=15;
                        val3=txt15;
                    }
                }
            }
            index4=4;
            val4=txt4;
            if(txt4.equals(""))
            {
                index4=8;
                val4=txt8;
                if(txt8.equals(""))
                {
                    index4=12;
                    val4=txt12;
                    if(txt12.equals(""))
                    {
                        index4=16;
                        val4=txt16;
                    }
                }
            }
            Shift s=new Shift();
            s.downShift(index1,val1, index2,val2, index3,val3, index4,val4);
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Puzzle2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle2048.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Puzzle2048().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
