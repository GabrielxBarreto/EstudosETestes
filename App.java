
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // Base de conhecimento simples para o chatbot
       
        BaseDeDados baseDeDados = new BaseDeDados();
        // Iniciar a interação
        //System.out.println("Bem-vindo ao MiniChatGPT! Pergunte algo (ou digite 'Adeus' para sair).");
        
        Scanner scanner = new Scanner(System.in);
        String input;
         JFrame frame = new JFrame("DaviBritoGPT ");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(1280, 720);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JTextField textField = new JTextField();
        textField.setForeground(Color.GRAY); // Cor do texto: branco
        textField.setBackground(Color.BLACK); // Fundo: preto
        

        Font fontArea = new Font("Arial", Font.PLAIN, 24); // Fonte Arial, tamanho 16
        textArea.setFont(fontArea);
        textField.setFont(fontArea);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.BLACK);
        textField.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                if (!inputText.isEmpty()) {
                    textArea.append("\nVocê: "+inputText + "\n"); // Adiciona o texto ao JTextArea
                    textField.setText(""); // Limpa o campo de entrada
                    if (baseDeDados.getBaseDeDados().containsKey(inputText)) {
                        textArea.append("MiniChatGPT: " + baseDeDados.getBaseDeDados().get(inputText));
                    }else if(inputText.equals("quero lhe ensinar")){
                        
                        textArea.append("\nDigite a key, a pergunta que eu devo responder e Digite a Argumentação, a resposta para a pergunta");
                        String key = JOptionPane.showInputDialog("\nDigite a key, a pergunta que eu devo responder");      
                        String argument = JOptionPane.showInputDialog("\nDigite a Argumentação, a resposta para a pergunta");      

                        baseDeDados.setBaseDeDados(key,argument);
                        System.out.println(key+" "+argument);
                                 
                        textArea.append("\nok!:)");
                    } else {
                        textArea.append("MiniChatGPT: Desculpe, ainda estou aprendendo. Pode perguntar outra coisa?");
                    }
                }
                
            }
        });
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER); // Área de saída
        frame.add(textField, BorderLayout.SOUTH);
        frame.setVisible(true);


        /*do {

            //tratamento
            System.out.print("Você: ");
            textArea.append(frame,"Bem-vindo ao MiniChatGPT! Pergunte algo (ou digite 'Adeus' para sair).");
            
            input = input.toLowerCase();

            // Responder baseado na base de conhecimento
            if (baseDeDados.getBaseDeDados().containsKey(input)) {
                JOptionPane.showMessageDialog(frame,"MiniChatGPT: " + baseDeDados.getBaseDeDados().get(input));
            }else if(input.equals("quero lhe ensinar")){
                String key =JOptionPane.showInputDialog("Digite a key, a pergunta que eu devo responder");
                String argument = JOptionPane.showInputDialog("Digite o argumento, a a resposta baseada nessa pergunta");
                baseDeDados.setBaseDeDados(key,argument);
                JOptionPane.showMessageDialog(frame,"ok!:)");
            } else {
                JOptionPane.showMessageDialog(frame,"MiniChatGPT: Desculpe, ainda estou aprendendo. Pode perguntar outra coisa?");
            }
        } while (!input.equalsIgnoreCase("Adeus"));

        scanner.close();
        System.out.println("MiniChatGPT: Foi um prazer conversar com você!");
    }*/
    }
}

