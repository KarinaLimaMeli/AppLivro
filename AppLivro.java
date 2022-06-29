package exemplo01;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro;
        livro = new Livro();
        Livro livro2 = new Livro();


        livro.nome = "Programando em Java";
        livro.autor = "Deitel";

         livro2.nome = "Banco de Dados";
         livro2.autor = "Marcos Silva" ;

         System.out.println(livro.nome);
         System.out.println(livro.autor);
         System.out.println(livro.nome);
         System.out.println(livro.autor);


    }
}
