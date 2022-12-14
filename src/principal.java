import javax.swing.*;

public class principal {
    public static void main(String[] args){
        Animal an = new Animal();
        Cachorro ca = new Cachorro();
        Gato gt = new Gato();
        Galinha gl = new Galinha();

       String continuar;

        ca.setTipo("Cachorro");
        ca.setNome(JOptionPane.showInputDialog("Nome do cachorro"));
        ca.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
        ca.setSexo(JOptionPane.showInputDialog("Sexo"));
        System.out.println("O animal cadastrado é: "+ ca.getTipo());
        System.out.println(ca.mostrar());
        ca.comeCarne();
        nVegano(ca.getTipo());
        System.out.println("\n");


        gt.setTipo("Gato");
        gt.setNome(JOptionPane.showInputDialog("Nome do gato"));
        gt.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
        gt.setSexo(JOptionPane.showInputDialog("Sexo"));
        System.out.println("O animal cadastrado é: "+ gt.getTipo());
        System.out.println(gt.mostrar());
        gt.ComeCarne();
        nVegano(gt.getTipo());
        System.out.println("\n");

        gl.setTipo("Galinha");
        gl.setNome(JOptionPane.showInputDialog("Nome da galinha"));
        gl.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
        gl.setSexo(JOptionPane.showInputDialog("Sexo"));
        System.out.println("O animal cadastrado é: "+ gl.getTipo());
        System.out.println(gl.mostrar());
        gl.alimento();

        System.out.println("\n");
        System.out.println("3 animais foram cadastrados");
        sexoMasculino(ca.getSexo(), gt.getSexo(), gl.getSexo());

    }



    static void nVegano(String a){
        System.out.println(a+ ", não é vegado");
    }

    static  void sexoMasculino(String a, String b, String c){
        if (a.equalsIgnoreCase("M")){
            System.out.println("Macho");
        }else{
            System.out.println("Femea");
        }

        if (b.equalsIgnoreCase("M")){
            System.out.println("Macho");
        }else{
            System.out.println("Femea");
        }

        if (c.equalsIgnoreCase("M")){
            System.out.println("Macho");
        }else{
            System.out.println("Femea");
        }
    }


}

