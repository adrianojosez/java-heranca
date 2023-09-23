package heranca;
import javax.swing.JOptionPane;
public class UsarFuncionario {
    public static void main (String args[]) {
        //Objetos
        Funcionario funcionario = new Funcionario();
        PessoaJuridica func = new PessoaJuridica();

        String u,v,t,z;
        int x;

        z = JOptionPane.showInputDialog ("digite 1 se contribuinte é pessoa física \n digite 2 se é pessoa jurídica");
        //conversão de string para flutuante:
        x = Integer.parseInt( z );
        if (z.length()==1) {
            switch (x)  {    
                case 1: {
                    u = JOptionPane.showInputDialog("Escreva o nome do contribuinte: ");
                    v = JOptionPane.showInputDialog("Escreva o RG do contribuinte: ");
                    t = JOptionPane.showInputDialog("Escrever a identificação do cartão do contribuinte: ");

                    funcionario.setNome(u);
                    funcionario.setRG(v);
                    funcionario.setCartao(t);
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("RG: " + funcionario.getRG());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    break;
                    }
                    case 2: {
                    u = JOptionPane.showInputDialog("Escreva o nome do contribuinte: ");
                    v = JOptionPane.showInputDialog("Escreva o CNPJ do contribuinte: ");
                    t = JOptionPane.showInputDialog("Escrever a identificação do cartão do contribuinte: ");

                    funcionario.setNome(u);
                    funcionario.setRG(v);
                    funcionario.setCartao(t);
                    System.out.println("NOME: " + funcionario.getNome());
                    System.out.println("CNPJ: " + funcionario.getClass());
                    System.out.println("CARTÃO: " + funcionario.getCartao());
                    break;
                    }
                }
        }
    }
}
