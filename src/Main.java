// classe principal
public class Main {
    public static void main(String[] args) {
        // crio um novo objeto da classe (que é uma instancia da classe pai)
        Ninja sasuke = new Ninja();

        // atribuindo valores ao objeto criado
        sasuke.nome = "Sasuke Uchiha";
        sasuke.sensei = "Kakashi Hatake";
        sasuke.aldeia = "Vila Oculta da Folha";
        sasuke.melhorTecnica = "Shidori";

        // usando o(s) metodo(s)
        sasuke.usarTecnica();

        // criando outro objeto e usando metodos
        Ninja jiraya = new Ninja();

        jiraya.nome = "Jiraya";
        jiraya.sensei = "Hiruzen Sarutobi";
        jiraya.aldeia = "Vila Oculta da Folha";
        jiraya.melhorTecnica = ("Invocação de Gamabunta");

        jiraya.usarTecnica();

    }
}
