package javapractice
//import
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Jpanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator extends Frame implements ActionListener{
    JTextField TF;
    int i = 0;
    int number, temp, result;
    String tempFun, tempInput = "";
    boolean done = false;
    //리스트로 16개 버튼 생성 
    JButton Button [] = new JButton[16]; 

    @Override
    public void actionPerformed(ActionEvent e){
        Strign input = e.getActionCommand();
        //입력받은 기능 읽기
        //더하기
        if(input.equals("+")){
            number = temp;
            temFun = "+";
            tempInput = "";
            
        }
        //빼기
        else if(input.equals("-")){
            number = temp;
            tempFun = "-";
            tempInput = "";
           
        }
        //곱하기
        else if(input.equals("x")){
            number = temp;
            tempFun = "x";
            tempInput = "";
            
        }
        //나누기
        else if(input.equals("/")){
            number = temp;
            tempFun = "/";
            tempInput = "";
        }
        //초기화
        else if(input.equals("C")){
            tempInput = "";
            temp = 0;
            number = 0;
            TF.setText("");
            
        }
        //등호 입력 받으면 기능 실행(계산하기)
        else if(input.equals("=")){
            //더하기
            if(tempFun.equals("+")){
                result = number + temp;
                TF1.setText(String.valueOf(result));
                done = true;
            }
            //빼기
            else if(tempFun.equals("-")){
                result = number - temp;
                TF1.setText(String.valueOf(result));
                done = true;
            }
            //곱하기
            else if(tempFun.equals("x")){
                result = number*temp;
                TF1.setText(String.valueOf(result));
                done = true;
            }
            //나누기
            else if(tempFun.equals("/")){
                result = number/temp;
                TF1.setText(String.valueOf(result));
                done = true;
            }
        }
        else{
            if(done){
                TF1.setText("0");
                done = false;
                temp = 0;
                number = 0;
                tempInput = "";

            }
            tempInput += e.getActionCommand();
            System.out.println(tempInput);
            TF1.setText(tempInput);
            temp = Integer.parseInt(tempInput);
        }

        }
    
        public Caluculator(){
            //계산기 모양으로 만들기
            super.setResizable(true);
            setLayout(new BorderLayout());
            setDefaultCloseOperation(Exit_ON_CLOSE);
            setSize(300,400);
            TF1 = new JTextField("",15);
            JPanel P1 = new JPanel();
            JPanel P2 = new JPanel();
            P1.add(TF1);
            P2.setLayout(new GridLayout(4,4,10,10));
            String buttonValue[] = {"1","2","x","3","4","5","6","/","7","8","9","+","C","0","=","-"};

            //버튼에 값 대입하기
            for (int in = 0; i <= 15; i ++){
                Button[i] = new JButton(buttonValue[i]);
                P2.add(Button[i]);
                Button[i].addActionListener(this);  
            }
            add(P1,BorderLayout.NORTH);
            add(P2,BorderLayout.CENTER);
            setVisible(true);

        }
        
        public static void main(String[] args) {
            new Calculator();
        }
        
    
      
}


