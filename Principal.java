import java.util.Scanner;
public class Principal {
    public static void main(String[]rosa){

        Scanner sc=new Scanner(System.in);//parametro de entrada


        System.out.println("Digite A para quadrado e B para triangulo");
        String opcao= sc.next();
        if(sc.equals("A")){

        
        Quadrado quadrado=new Quadrado();
        System.out.println("Digite um valor referente ao um lado: ");
         quadrado.setLado(sc.nextDouble());//metodo do scanner/sc é tradicional ou pode outra palavra EX:leia
        System.out.println(quadrado.getNomeFigura());
        System.out.println("Sua Area: "+ quadrado.getArea());
        System.out.println("Seu Perimetro: "+ quadrado.getPerimetro());
}else{
        Triangulo triangulo=new Triangulo();
        System.out.println("Digite um valor lado A: ");
        triangulo.setLadoA(sc.nextDouble());
        System.out.println("Digite um valor lado B: ");
        triangulo.setLadoB(sc.nextDouble());
        System.out.println("Digite um valor lado C: ");        
        triangulo.setLadoC(sc.nextDouble());
        System.out.println("Digite a altura: ");
        triangulo.setLadoC(sc.nextDouble());
        System.out.println("Digite a base: ");
        System.out.println(triangulo.getNomeFigura());
        System.out.println("Sua Area: "+ triangulo.getArea());
        System.out.println("Seu Perimetro: "+ triangulo.getPerimetro());

}
sc.close();
    }
    
}
